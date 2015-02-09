package generic2;

public class LinkedList<E> {
	private Element<E> first;
	private Element<E> last;
	
	public LinkedList() {
		first=null;
		last=null;
	}
	public void insertFirst(E newObj){
		Element<E> e=new Element<E>(newObj);
		e.setNext(first);
		first=e;
		if (last==null){
			last=e;
		}
	}
	
	public void print(){
		Element<E> e=first;
		while (e!=null){
			System.out.print(e.toString()+", ");
			e=e.getNext();
		}
		System.out.println();
		
	}
	
	public void insertLast(E newObj){
		Element<E> e=new Element<E>(newObj);
		if (last==null){
			last=e;
			first=e;
		}else{
			last.setNext(e);
			last=e;
		}
	}
	
	public boolean isEmpty(){
		boolean empty=false;
		if((first==null)||(last==null))
			empty=true;
		return empty;
	}
	
	public void remove(E obj) throws ObjectNotFoundException, EmptyListException{
		Element<E> r=null;
		if (isEmpty())
			throw new EmptyListException("The list is empty");
		Element<E> e=first;
		while ((e!=null)&&(obj!=e.getObject())){
			r=e;
			e=e.getNext();
		}
			
		if(e==null)
			throw new ObjectNotFoundException("Object not found");
		else{
			//BORRAR ELEMENTO DE VERDAD
			if(e==first){
				first=e.getNext();
			}else{
				r.setNext(e.getNext());
			}
			e.delete();
		}	
	}
	
	public E getFirstObject() throws EmptyListException{
		if (isEmpty()){
			throw new EmptyListException("The list is empty");
		}else{
			return (E) first.getObject();
		}			
	}
	
	public E getLastObject() throws EmptyListException{
		if(isEmpty()){
			throw new EmptyListException("The list is empty");
		}else{
			return (E) last.getObject();
		}
	}
	
	public E getObjectAtPosition(int n) throws EmptyListException,InvalidIndexException{
		if(isEmpty()){
			throw new EmptyListException("The list is empty");
		}else{
			Element<E> e=first;
			for(int i=0;i<n;i++){
				if(e==null){
					throw new InvalidIndexException(n+"Index wasn't valid");
				}else{
					e=e.getNext();
				}
			}
			return (E) e.getObject();
		}
	}
	
	public int getNumElements(){
		int x=0;
		Element<E> e=first;
		while(e!=null){
			e=e.getNext();
			x++;
		}
		return x;
	}
}

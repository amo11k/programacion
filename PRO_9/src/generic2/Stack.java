package generic2;

public class Stack<E>{
	private LinkedList<E> list;
	
	public Stack(){
		list=new LinkedList<E>();
	}
	public void push(E obj){
		list.insertLast(obj);
	}
	public E pop() throws EmptyListException{
		E obj=list.getLastObject();
		try {
			list.remove(obj);
		} catch (ObjectNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public void empty(){
		list=new LinkedList<E>();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public void print(){
		list.print();
	}
}

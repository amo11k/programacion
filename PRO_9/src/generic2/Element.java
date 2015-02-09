package generic2;

public class Element<E> {
	private E object;
	private Element<E> next;
	
	public Element(E newObject) {
		object=newObject;
		next=null;
	}
	public void setNext(Element<E> newNext){
		next=newNext;
	}
	public Element<E> getNext(){
		return next;
	}
	public E getObject(){
		return object;
	}
	public void setObject(E newObject){
		object=newObject;
	}
	public void delete(){
		object=null;
		next=null;
	}
	public String toString(){
		return object.toString();
	}

}

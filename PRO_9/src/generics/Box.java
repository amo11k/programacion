package generics;

public class Box<T> {
	private T obj;

	public void setObject(T obj) {
		this.obj = obj;
	}
	
	
	public T getObject(){
		return obj;
	}
}

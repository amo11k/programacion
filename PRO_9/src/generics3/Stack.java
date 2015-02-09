package generics3;

import generic2.EmptyListException;
import generic2.ObjectNotFoundException;
import java.util.ArrayList;

public class Stack<T> {
	private ArrayList<T> list;
	private int numElements = 0;

	public Stack() {
		list = new ArrayList<T>();
	}

	public void push(T obj) {
		list.add(obj);
		numElements++;
	}

	public T pop() throws EmptyListException, ObjectNotFoundException {
		T x = list.get(0);
		list.remove(0);
		numElements--;
		return x;

	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void empty() {
		list.clear();
	}

	public void print() {
		System.out.println(toString());
	}

	public String toString(){
		String s="";
		for (int i = 0;i < list.size();i++){
			if(i!=list.size()-1)
				s+=list.get(i)+", ";
			else
				s+=list.get(i);
			
		}
		return "["+s+"]";
	}
}

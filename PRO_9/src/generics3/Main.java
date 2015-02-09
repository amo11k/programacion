package generics3;

import generic2.EmptyListException;
import generic2.ObjectNotFoundException;

public class Main {

	public static void main(String[] args) throws EmptyListException, ObjectNotFoundException {
		Stack<Integer> s=new Stack<>();
		
		s.push(1);
		s.push(4);
		s.push(6);
		s.push(3);
		s.push(8);
		s.print();
		s.empty();
		s.print();
		
	}

}

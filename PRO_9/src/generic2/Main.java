package generic2;
public class Main {
	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<>();
		String s = "Ruben Amoros";
		l.insertLast("1");
		l.insertLast(s);
		l.insertLast("2");
		l.insertLast("3");
		l.insertLast("4");
		l.print();
		try {
			l.remove(s);
		} catch (EmptyListException e) {
			System.out.println("The list was empty");
		} catch (ObjectNotFoundException e) {
			System.out.println("Object not found");			
		}
		l.print();
		System.out.println("Number of elements: "+l.getNumElements());
		
		
		LinkedList<Integer> lista2=new LinkedList<>();
		lista2.insertFirst(12);
		lista2.insertFirst(5);
		lista2.insertFirst(16);
		lista2.insertFirst(112);
		lista2.print();
		System.out.println(lista2.getNumElements());
		
		Stack<Integer> s1=new Stack<>();
		int i=3000;
		s1.push(2);
		s1.push(4);
		s1.push(6);
		s1.push(i);
		s1.print();
		
	}

}

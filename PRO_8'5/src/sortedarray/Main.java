package sortedarray;

public class Main {

	public static void main(String[] args) {
		SortedArray so1=new SortedArray(10);
		so1.put(3);
		so1.put(2);
		so1.put(1);
		so1.put(6);
		so1.put(4);
		so1.put(0);
		so1.put(10);
		so1.put(45);
		System.out.println(so1.toString());
		so1.removeElementAt(5);
		System.out.println(so1.toString());
		System.out.println(so1.isEmpty());
		System.out.println(so1.isFull());
		System.out.println(so1.existElementAt(5));
		System.out.println(so1.existElement(45));
		System.out.println(so1.existElement(10));

	}

}

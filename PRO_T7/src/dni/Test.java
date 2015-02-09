package dni;

public class Test {

	public static void main(String[] args) {
		System.out.println("TRY WITH A WRONG NUMBER");
		try {
			DNI a = new DNI(53381650);
		} catch (NIFException e) {
			System.out.println("Invalid number for a DNI");
		}
		System.out.println();
		System.out.println("TRY WITH A WRONG LETTER");
		try {
			DNI b=new DNI(53381650,'F');
		} catch (NIFLetterException e) {
			System.out.println("Invalid letter for this DNI number");
		} catch(NIFException e){
			System.out.println("Invalid number for a DNI");
		}
		
		

	}

}

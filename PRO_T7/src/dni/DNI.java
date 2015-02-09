package dni;


public class DNI {
	private int number;
	private char letter;
	private static char[] letters = {'T','R','W','A','G','M','Y','F','P','D',
		'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	public DNI() {
		number = 0;
		letter = letters[0];
	}
	public DNI(int newNumber) throws NIFException{
		if(newNumber<0){
				throw new NIFException("Invalid number for a DNI");
				
		}
		number=newNumber;
		letter = letters[number%23];
	}
	public DNI(int newNumber, char newLetter) throws NIFException, NIFLetterException{
		if(newNumber<0){
			throw new NIFException("Invalid number for a DNI");
		}
		number=newNumber;
		letter = letters[number%23];
		if(Character.toUpperCase(newLetter)!=letter){
			throw new NIFLetterException("Invalid letter for a DNI");
		}
		
	}
	public DNI(String s) {
		char c = s.charAt(s.length()-1);
		String newS =s.replaceAll("[^0-9]", "");
		number = Integer.parseInt(newS);
		letter = letters[number%23];
		if (Character.toUpperCase(c)!=letter) {
			number=-number;
		}
	}
	public boolean isDniCorrect() {
		if (number<0)
			return false;
		else
			return true;
	}
	public int getNumber() {
		return number;
	}
	public char getLetter() {
		return letter;
	}
	public void setNumber(int newNumber) {
		number = newNumber;
		letter = letters[number%23];
	}
	public String toString() {
		return number+ Character.toString(letter);
	}
	public String toFormattedString() {
		StringBuilder s = new StringBuilder(String.valueOf(number));
		if (number>999) {
			s.insert(s.length()-3,'.');
		}
		if (number>999999) {
			s.insert(s.length()-7,'.');
		}
		if (number>999999999) {
			s.insert(s.length()-11,'.');
		}
		return s.toString()+"-"+letter;
	}
}
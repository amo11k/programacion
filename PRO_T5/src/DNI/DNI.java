package DNI;

public class DNI {
	private int num,let;
	private char letter;	
	private static char[] array={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

	
	public DNI(){
		num=0;
		letter=array[0];
	}
	public DNI(int newNum, char newChar){
		num=newNum;
		letter=array[num%23];
		if (newChar!=letter);
			num=num*-1;
	}
	public DNI(int newNum){
		num=newNum;
		let=newNum%23;
		letter=array[let];
	}
	public DNI(String dniString){
		letter=dniString.charAt(dniString.length()-1);
		String s=dniString.substring(0, dniString.length()-1);
		num=Integer.parseInt(s);
	}
	public String toString(){
		return "The DNI is: "+num+Character.toUpperCase(letter);
	}
	public String toFormattedString(){
		int millones=num/1000000;
		int cent=(num-(millones*1000000))/1000;
		String s=Integer.toString(num);
		s=s.substring(5, 8);
		return millones+"."+cent+"."+s+"-"+Character.toUpperCase(letter);
	}
	
	public int getNumber(){
		return num;
	}
	public char getLetter(){
		return letter;
	}
	public void setNumber(int newNum){
		num=newNum;
		letter=array[newNum%23];
	}
	public boolean correctDNI(){
		boolean sw=true;
		if (num<0){
			sw=false;
		}
		return sw;
	}
	public static char letterForDNI(int newNum){
		return array[newNum%23];
	}
	public static String NifForDNI(int newNum){
		DNI myDNI=new DNI(newNum);
		return myDNI.toString();
	}
}

package maps;

public class Pair implements Comparable<Pair> {
	private String country;
	private Integer value;
	
	public Pair(String country, Integer value){
		this.country=country;
		this.value=value;
	}
	
	public Integer getValue(){
		return value;
	}
	
	public String getCountry(){
		return country;
	}
	
	public int compareTo(Pair par1) {
		if (value < par1.getValue())
			return -1;
		else
			if(value > par1.getValue())
				return 1;
			else
				return 0;
	}
	
	public String toString(){
		return "The country "+getCountry()+" have "+getValue()+" candidate/s";
	}
}

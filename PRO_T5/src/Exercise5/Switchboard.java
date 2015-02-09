package Exercise5;

public class Switchboard {
	private int source,destination,timeZone;
	private double cost;
	private double seconds;
	private String type;
	public boolean sw;
	private String tz;
	private static final double LOCAL_PRICE=0.15;

	
	
	public Switchboard(int sou, int des, double c, boolean sw, int timeZone){
		source=sou;
		destination=des;
		seconds=c;
		if(sw){
			cost=getLocalCost();
			type="Local";
			if (timeZone==0){
				tz="Timezone 1";
			}if (timeZone==1){
				tz="Timezone 2";
			}else{
				tz="Timezone 3";
			}
		}else{
			cost=getProvincialCost();
			type="Provincial";
		}
	}
	
	public String toString(){
		return "The number "+source+" called to "+destination+" for this many seconds: "+seconds+". It's a "+type+" type call on "+tz+", so the cost will be "+cost;
	}
	public double getLocalCost(){
		return seconds*LOCAL_PRICE;
	}
	public double getProvincialCost(){
		if (timeZone==0){
			cost=seconds*0.20;
			tz="Timezone 1";
		}else{
			if (timeZone==1){				
				cost=seconds*0.20;
				tz="Timezone 2";
			}else{
				if (timeZone==2);					
					cost=seconds*0.30;
					tz="Timezone 3";
			}
		}return cost;				
	}
	public int getSource(){
		return source;
	}
	public int getDestination(){
		return destination;
	}
	public double getSeconds(){
		return seconds;
	}
	/*public void printPosition(int position){
		System.out.println(Switchboard[position].toString());
	}*/
}

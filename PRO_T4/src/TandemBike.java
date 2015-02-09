
public class TandemBike extends Bicycle {
	int numSeats=2;
	
	void applyBrakes(int decrement1, int decrement2){
		speed=speed-decrement1-decrement2;
		if (speed<0){
			speed=0;
		}
	}
	void printStates(){
		super.printStates();
		System.out.println("num Seats: "+numSeats);
	}
}

package exam07;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(350);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		

	}

}

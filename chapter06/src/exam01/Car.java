package exam01;

public class Car {
	
	String Company;
	String Model;
	String Color;
	int maxSpeed;
	int speed;
	boolean starter;
	int mynumber;
	static int number=0;
	 
	

	public Car(String company, String model, String color, int maxSpeed, int speed, boolean starter, int mynumber) {
		this(starter, Company );
	}
	
	int sum(int ... values) {
		int result=0;
		for(int i=0;i<values.length;i++) {
			result=result+values[i];
		}
		return result;
	}
	



	/*
	 * int speedUp(int speed) {//입력값O 출력값O return speed; }
	 *  void speedUp(int speed) {//입력값X 출력값O } 
	 *  int speedUp() {//입력값O 출력값X } 
	 *  void speedUp() {//입력값X 출력값X }
	 */
	
	public Car(String company, String model, String color, int maxSpeed, int speed, boolean starter) {
		super();
		Company = company;
		Model = model;
		Color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.starter = starter;
	}




	void starterOnOff() {
		starter=!starter;
	}
	
	

	@Override
	public String toString() {
		return "Car [Company=" + Company + ", Model=" + Model + ", Color=" + Color + "]";
	}

}
class Tire{
	
}

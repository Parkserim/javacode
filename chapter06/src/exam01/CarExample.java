package exam01;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		int sum=car1.sum(2,3,5,6,79,22,45);
		
		Car car2 = new Car();
		car2.Company="기아";
		car2.Model="K5";
		car2.Color="핑크";
		System.out.println(car1);
		System.out.println(car2);
		String s="serim";
		System.out.println(s.toString());
	}

}

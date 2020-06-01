package exam03;

public class PromotionExample {
	public static void main(String[] args) {
		A a = new A();
		A ab = new B();
		A ac = new C();
		A ad = new D();
		A ae = new E();
		
		if(ac instanceof B) {
			System.out.println("B");
		}else {
			System.out.println("아님");
		}
		
		
	}

}

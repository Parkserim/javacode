package exam04;

public abstract  class Phone { //추상 클래스
	public String onwer;

	public Phone(String onwer) {
		super(); //생략가능
		this.onwer = onwer;
	}
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	public abstract void bellOn();

}

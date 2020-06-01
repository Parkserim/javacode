package exam05.constructor_access;

public class A {
	//필드
	A a1=new A(true);
	A a2=new A(1);
	A a3=new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b){}
	private A(String s) {} //같은 클래스 안에서  private까지 아무 문제 없셩!

}

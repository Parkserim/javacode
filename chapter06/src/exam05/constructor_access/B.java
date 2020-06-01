package exam05.constructor_access;

public class B {
	//필드
	A a1=new A(true); //같은 패키지 안의 다른 클래스 문제 없셩!
	A a2=new A(1); //같은 패키지 안의 다른 클래스 문제 없셩!
	A a3=new A("문자열"); //private는 같은 클래스 안에서만 가능햇!
	

}

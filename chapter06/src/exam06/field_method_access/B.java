package exam06.field_method_access;

public class B {
	public B() {
		A a=new A();
		a.field1=1;
		a.field2=1;
		a.field3=1; //패키지 동일이여도 private 접근불가
		
		a.method1();
		a.method2();
		a.method3(); //패키지 동일이여도 private 접근불가
	}

}

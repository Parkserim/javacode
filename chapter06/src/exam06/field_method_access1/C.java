package exam06.field_method_access1;

import exam06.field_method_access.A;

public class C {
	public C() {
		A a=new A();
		a.field1=1;
		a.field2=1; //다른 패키지 default접근 불가
		a.field3=1; //다른 패키지 private접근 불가
		
		a.method1();
		a.method2(); //다른 패키지 default접근 불가
		a.method3(); //다른 패키지 private접근 불가
	}

}

package exam02.package2;

import exam02.package1.A;

public class D extends A{
	public D() {
		super(); //class A의 protected A() {}부분 호출
		this.field="value";
		this.method();
	}

}

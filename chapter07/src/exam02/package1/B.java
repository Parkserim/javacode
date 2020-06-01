package exam02.package1;

public class B {
	public class B{
		public void method() {
			A a=new A(); //생성자 호출에 있어서 문제 없(같은 패키지)
			a.field="value";
			a.method();
		}
	}

}

package exam.operator;

public class IncreseDecreseOperatorExample {
	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("--------------------------");
		
		  x++; ++x; System.out.println("x = " + x);
		 
		
		z=x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
	}

}

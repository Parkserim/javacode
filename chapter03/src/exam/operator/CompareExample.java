package exam.operator;

public class CompareExample {
	public static void main(String[] args) {
		
		//비교 연산자
		System.out.println(1==1);
		System.out.println('A'==65);
		System.out.println('A'<'B');
		System.out.println(3==3.0);
		System.out.println(0.1==0.1f);   //Float형태
		System.out.println(1.0==1.0f);   
		
		System.out.println("\n");
		//문자열 비교
		String str1="대구";
		String str2="대구";
		String str3= new String("대구");
		String str4= new String("대구");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
	    System.out.println(str3.equals(str4));
		
	}

}

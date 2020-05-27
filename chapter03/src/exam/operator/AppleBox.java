package exam.operator;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("사과의 갯수를 입력하세요 = >");
		int x=scan.nextInt();
		System.out.println("박스의 갯수를 입력하세요 = >");
		int y=scan.nextInt();
		int result=x%y;	
		int box=x/y;
		System.out.println("사과 박스의 갯수 : " + box);
		System.out.println(x + "개의 사과를 " + y + " 개씩 나눈 나머지 : " + result);
		
	}

}

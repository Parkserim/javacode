package exam.IfTest;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args)  {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			
			int menu =  scanner.nextInt();
			
			switch (menu) {
			case 1: //1을 선택
				System.out.println("예금액 >" );
				balance+=scanner.nextInt()	;							
				break;
			case 2: //2를 선택
				System.out.println("출금액 >" );
				balance-=scanner.nextInt();							
				break;			
			case 3: //3을 선택 							
				System.out.println("잔고>" );
				System.out.println(balance);			
				break;			
			case 4:  //4를 선택				
				run=false; //while문 종료
				break;				
			}
		}
		System.out.println("프로그램 종료");
	}

}

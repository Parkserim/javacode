package exam.IfTest;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int score=scan.nextInt();
				
		switch(score/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;	
			default:
				System.out.println("F");
				
			
		}
	}

}

package exam.IfTest;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class IfTest {
	public static void main(String[] args) {
		

		int count=0;
		for (int i=0; i<=4; i++) {
			
			System.out.println("주사위 숫자를 입력하세요 : ");
			Scanner scan= new Scanner(System.in);		
			int num=((int)(Math.random()*6)+1);
			System.out.println("(힌트:" + num + ")");
			int player =scan.nextInt();	
	
			
			
			
						if(player>=1 && player<=7) {
				if(num==player) {				
					System.out.println("정답입니다!");
					count=++count;
				}else {
					System.out.println("틀렸습니다.");
				}
				System.out.println("정답 :  " + num);					
			}else{
				System.out.println("1~7 사이의 수를 입력해 주세요");
			}																
		}
		System.out.println(count+"번 맞췄습니다");


	} 
}

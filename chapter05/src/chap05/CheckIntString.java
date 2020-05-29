package chap05;
import java.util.Scanner;

public class CheckIntString {
	public static void main(String[] args) {
		char tmp;
		boolean output = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("판별할 문자열을 입력하세요 : ");
		String input = scan.nextLine();
		System.out.println(input);

		int count=0;
		while(count<=4) {
			int player =scan.nextInt();
			int num=((int)(Math.random()*6)+1);


			for (int i=0; i<input.length();i++) {
				tmp=input.charAt(i);

				if(!('1'<=tmp&&tmp<='7')) {
					output=false;
				}
			}
			System.out.println("숫자여부 : " + output);
			int player = Integer.parseInt(input);

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
		}System.out.println(count+"번 맞췄습니다");
	}

}

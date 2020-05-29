package chap05;

import java.util.Scanner;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		
		
		
		System.out.println("10명의 학생 점수를 입력하세요.");
		Scanner scan = new Scanner(System.in); //Scanner를 이용하여 배열에 입력받을 점수를 저장
		
		
		//10명의 학생 점수를 입력 받을 배열선언
		int score[]= new int[10]; 
		for(int i=0;i<score.length;i++) {
			System.out.println(i+1+"번째 학생 점수");
			score[i]=scan.nextInt();
		}
		//반복문을 이용하여 배열의 점수의 합을 구한다.
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum=sum+score[i];
		}
		//구한 합에 학생 수로 나누어 평균을 구한다.
		System.out.println("점수의 합은"+sum);
		System.out.println("점수의 평균은"+(double)sum/score.length);
		

	}

}

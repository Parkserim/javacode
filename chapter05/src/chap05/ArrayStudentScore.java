package chap05;
import java.util.Scanner;

public class ArrayStudentScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner를 이용하여 배열에 입력받을 점수를 저장
		
		boolean run=true;
		
		while(run) {
	
			System.out.println("-----------------------MENU----------------------");
			System.out.println("1. 학생 점수 입력 2.성적처리 결과 리스트 3.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			int menu = scan.nextInt();
			double avg=0.0;
			int stutotal=0;
			int student[][]=new int[3][3];
			
		//10명의 학생 점수를 입력 받을 배열선언
				if(menu==1) {					
					for(int i=0; i<student.length;i++) {
						System.out.println(i+1+"번 학생 성적입력");
						System.out.print("국어 성적을 입략하세요>");
						student[i][0]=scan.nextInt();
						System.out.print("영어 성적을 입력하세요>");
						student[i][1]=scan.nextInt();
						System.out.print("수학 성적을 입력하세요>");
						student[i][2]=scan.nextInt();					
					}
				}else if(menu==2) {
					for(int i=0;i<student.length;i++) {
						int total=student[i][0]+student[i][1]+student[i][2];
						stutotal=stutotal+total;
							}System.out.println("성적 총점 : "+stutotal);
					
				}else if(menu==3) {
					run=false;
				}
				
		}		
	}

}

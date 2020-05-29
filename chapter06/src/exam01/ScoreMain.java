package exam01;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 수 저장 변수
		int snum = 0;
		
		// 학생 수 입력		
		System.out.println("학생 수를 입력해주세요");
		snum = scan.nextInt();
		
		// 학생 수 만큼 배열 생성
		Score[] scores = new Score[snum];

		// 학생 수 입력 하고 바로 학생 점수입력
		// 학생 점수입력		
		for (int i = 0; i < snum; i++) {
			int kor, eng, math;
			System.out.println(i + 1 + "번 째 학생 점수입력");
			System.out.print("국어점수를 입력해주세요>");
			kor = scan.nextInt();
			System.out.print("영어점수를 입력해주세요>");
			eng = scan.nextInt();
			System.out.print("수학점수를 입력해주세요>");
			math = scan.nextInt();
			System.out.println("----------------------------------------------------");
			scores[i] = new Score(kor, eng, math);
		}
		
		// 메뉴 실행 상태 변수 run
		boolean run = true;
		while (run) {
			// 메뉴 목록
			System.out.println("-----------------------MENU----------------------");
			System.out.println("1.전체 학생 성적 조회 2.과목별 성적 평균 조회 3.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			int menu = scan.nextInt();

			// 전체 학생 점수 조회 
			if (menu == 1) {
				for (int i = 0; i < snum; i++) {
					System.out.println(i + 1 + "번째 학생 점수");
					System.out.println(scores[i].toString());
					System.out.println("----------------------------------------------------");
				}

			}
			// 과목별 총점 및 평균 조회
			else if (menu == 2) {
				// 과목별 총점 저장 변수
				double kortotal = 0;
				double engtotal = 0;
				double mathtotal = 0;
				
				// 과목별 총점 합 구하기
				for (int i = 0; i < snum; i++) {
					kortotal = kortotal + scores[i].kor;
					engtotal = engtotal + scores[i].eng;
					mathtotal = mathtotal + scores[i].math;
				}
				
				// 과목별 총점 및 평균 출력
				System.out.println("국어 총점 : "  + kortotal + ", 국어 평균 : " + kortotal / snum);
				System.out.println("영어 총점 : " + engtotal + ", 영어 평균 : " + engtotal / snum);
				System.out.println("수학 총점 : " + mathtotal + ", 수학 평균 : " + mathtotal / snum);

			}
			// 프로그램 종료
			else if (menu == 3) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

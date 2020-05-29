package exam01;

public class Score {
	// 클래스 필드변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 클래스 생성자
	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
		
		
		// 생성하면서 총점 및 평균 계산
		this.total = kor + eng + math;
		this.avg = total / 3;
	}

	// 클래스 toString 메서드
	@Override
	public String toString() {
		return "국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : " + total + ", 평균 : " + avg;
	}

}

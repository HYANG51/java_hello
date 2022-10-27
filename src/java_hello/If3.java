package java_hello;

public class If3 {
	public static void main(String[] args) {
		// 국어,영어,수학 점수 임의로 넣고, 성적매기기
		// 90-수, 80-우, 70-미, 60-양, 가
					
		int kor = 85;
		int eng = 98;
		int mat = 30;
		int total;
		double avg;
		
		total = kor + eng + mat;
		avg = total / 3.0;
		
		if(avg >= 90) {
			System.out.println("수 입니다.");
		}else if(avg >= 80) {
			System.out.println("우 입니다.");
		}else if(avg >= 70) {
			System.out.println("미 입니다.");
		}else if(avg >= 60) {
			System.out.println("양 입니다.");
		}else {
			System.out.println("가 입니다.");
		}
		
	}
}

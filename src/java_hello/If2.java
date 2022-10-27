package java_hello;

public class If2 {
	public static void main(String[] args) {
		
		// 국어,영어,수학 점수 임의로 넣고, 성적매기기
		// 90-수, 80-우, 70-미, 60-양, 가
		
		int kor = 85;
		int eng = 98;
		int mat = 30;
		
		if(kor >= 90) {
			System.out.println("국어 : 수");
		}
		else if(kor >= 80) {
			System.out.println("국어 : 우");
		}
		else if(kor >= 70) {
			System.out.println("국어 : 미");
		}
		else if(kor >= 60) {
			System.out.println("국어 : 양");
		}
		else {
			System.out.println("국어 : 가");
		}
		
		if(eng >= 90) {
			System.out.println("영어 : 수");
		}
		else if(eng >= 80) {
			System.out.println("영어 : 우");
		}
		else if(eng >= 70) {
			System.out.println("영어 : 미");
		}
		else if(eng >= 60) {
			System.out.println("영어 : 양");
		}
		else {
			System.out.println("영어 : 가");
		}
		
		if(mat >= 90) {
			System.out.println("수학 : 수");
		}
		else if(mat >= 80) {
			System.out.println("수학 : 우");
		}
		else if(mat >= 70) {
			System.out.println("수학 : 미");
		}
		else if(mat >= 60) {
			System.out.println("수학 : 양");
		}
		else {
			System.out.println("수학 : 가");
		}
	}
}

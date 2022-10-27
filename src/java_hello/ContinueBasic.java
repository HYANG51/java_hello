package java_hello;

public class ContinueBasic {
	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		
		// 1~100까지 5의배수이자 7의 배수인 수를 찾고, 몇개인지 카운팅하는 프로그램 작성

		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0)) {
				continue;		// 5와 7의 배수가 아니라면 나머지 건너뛰고 위로 이동.
			}
			count++;	// 5와 7의 배수인 경우에만 실행
			System.out.println(num);	// 5와 7의 배수인 경우에만 실행
		}
		System.out.println("count : " + count);
	}
}

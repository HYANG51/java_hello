package java_hello;

public class BlockComment {

	public static void main(String[] args) {

		// 다음은 단순한 정수의 출력
		System.out.println(7);
		System.out.println(3.15);

		// "" 문자열
		System.out.println("3 + 5 =" + 8);
		System.out.println(3.15 + "는 실수입니다.");
		System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
		System.out.println(3 + 5 + "의 연산 결과는 8입니다.");
		System.out.println("의 연산 결과는 8입니다." + 3 + 5); // 앞에 문자열이 있어서 뒤에 있는거도 문자열로 인식되는거래

		// 다음은 덧셈 결과의 출력
		System.out.println(3 + 5);

	}

}
package java_hello;

public class PostfixOp {
	public static void main(String[] args) {
		int num = 5;
		System.out.println((num++) + " ");	// 출력 후에 값 증가
		System.out.println((num++) + " ");	// 출력 후에 값 증가
		System.out.println((num) + "\n");	// \n은 줄바꿈
		
		System.out.println((num--) + " ");	// 출력 후에 값 감소
		System.out.println((num--) + " ");	// 출력 후에 값 감소
		System.out.println(num);
	}
}

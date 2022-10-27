package java_hello;

public class Constants {
	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;		// 신입은 파이널 잘 안쓴대. 그렇군요... 
		
		CONST_ASSIGNED = 12;	// 할당하지 않았던 상수의 값 할당
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
	}
}

package java_hello;

public class CompAssignOp2 {
	public static void main(String[] args) {
		
		short num = 10;
		num = (short)(num + 77L);	// 형변환 안하면 컴파일 오류 발생
		int rate = 3;
		rate = (int)(rate * 3.5);	// 형변환 안하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;					// 형변환 필요없음.
		rate = 3;
		rate *= 3.5;				// 형변환 필요없음.
		System.out.println(num);
		System.out.println(rate);
	}
}

package java_hello;

public class PrefixOp {
	public static void main(String[] args) {
		int num = 7;
		
		//System.out.println(++num);	// 출력 전에 먼저 더하고 내보내기
		//System.out.println(++num);	// 
		//System.out.println(num);	// 
		
		System.out.println(num++);	// 출력하고 그 다음번에 더하기
		System.out.println(num++);
		System.out.println(num);
	}
}

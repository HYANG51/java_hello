package java_hello;

public class LogicalOp {
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		int num3 = 77;
		boolean result;
		
		// 변수 num1에 저장된 값이 1과 100사이의 수인가?
		result = (1 < num1) && (num1 < 100);			// 두개 조건이 다 맞아야 true
		System.out.println("1 초과 100 미만인가? " + result);
		
		// 변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);	// 둘 중 하나라도 맞으면 true 
		System.out.println("2 또는 3의 배수인가? " + result);
		
		// 변수 num1이 0인가?
		result = !(num1 != 0);								// !는 아니어야 true인데 앞에 또 !를 먹여서 false가 나옴.
		System.out.println("0 인가? " + result);
		
		// 77이 7의 배수이고, 11의 배수인지 판별하는 프로그램을 짜시오.
		result = ((num3 % 7) == 0) && ((num3 % 11) == 0);
		System.out.println("77은 7의 배수이고, 11의 배수인가요? " + result);
		
		// 77이 짝수이고, 7의 배수이고, 11의 배수인지 판별하는 프로그램을 짜시오.
		result = ((num3 % 2) == 0) && ((num3 % 7) == 0) && ((num3 % 11) == 0);
		System.out.println("77은 짝수이고, 7의 배수이고, 11의 배수인가요? " + result);
	}
}

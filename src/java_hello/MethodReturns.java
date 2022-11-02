package java_hello;

public class MethodReturns {

	public static void main(String[] args) {
		int result;
		result = adder(4, 5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));
	}
	
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;	// addResult의 값을 반환. return 뒤에 반드시 value가 들어가야함.
	}
	
	public static double square(double num) {
		return num*num;		// num*num의 결과를 반환
	}
}

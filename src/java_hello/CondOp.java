package java_hello;

public class CondOp {
	public static void main(String[] args) {
		
		//삼항 연산자. Rhs들이 많이 사용한다고 함.
		int num1 = 50;
		int num2 = 100;

		int big;
		int diff;

		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + big);
		
		//if로 했을때.
		if(num1 > num2) {
			System.out.println("큰 수 : " + num1);
		}else {
			System.out.println("큰 수 : " + num2);
		}

		//num1 num2의 차이의 절대값을 구하는 프로그램을 짜시오.
		
		//삼항 연산자
		big = (num1 > num2) ? (num1 - num2) : (num2 -num1);
		System.out.println("절대값 큰 수 : " + big);
		//if문
		if((num1 - num2) > 0) {
			System.out.println("절대값 큰 수 : " + (num1 - num2));
		}else {
			System.out.println("절대값 큰 수 : " + -(num1 - num2));
		}
	}
}

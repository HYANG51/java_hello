package java_hello;

public class ArithOp {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + num1+num2);	
		// + 결합방향은 -> 이거. 앞에가 문자열이니까 num1도 num2도 문자열로 인식해서 73이 나옴. 
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 / num2 = " + (num1/num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 % num2 = " + (num1%num2));

	}
}

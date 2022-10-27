package java_hello;

public class LogicalOp2 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);		// &&인데 10을 더하고 보니까 앞에서 이미 false가 나와서 바로 그 뒤는 확인도 안함
		System.out.println("num2 = " + num2 + '\n');		// 그래서 뒤에는 +10이 안되고 그대로 0임 
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);		// 위에 &&에서 이미 10 더해진 상태. 거기서 또 10이 더해지니까 20나옴.
		System.out.println("num2 = " + num2);		// 둘 중 하나만 true면 되는데 앞에서 이미 true 나와서 일 안해가지고 얘 또 0임.
		
		// 콤퓨타쉑 일 대충하네..
	}
}

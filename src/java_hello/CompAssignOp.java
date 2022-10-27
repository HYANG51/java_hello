package java_hello;

public class CompAssignOp {
	public static void main(String[] args) {
		
		/*
		 * char ch = 32; short sh = 100;
		 * 
		 * int result = ch + sh;
		 * 
		 * System.out.println(result); System.out.println(ch);
		 */
		
		float fl = 0.1F;	//float는 f붙여줘야됨
		long l = 10L;		
		
		float result = 10L;
		System.out.println(result);
		
		double pi = 3.14;
		int num = (int)pi;	// (int)pi;로 명시적 형변환(강제 형변환) 데이터 문제생기니까 앵간하면 안씀. 야바이데수
		// int num = pi; 는 안됨 사유 : 더블은 짱큰데 인트는 쫌큼. 큰놈이 작은놈을 품을 수 X
		
		pi = num;
		
		
		System.out.println(num);	// int는 정수만 나오니까 3으로 출력됨
									// (실수형을 정수형으로 변환하는 경우 소수점이하 자리는 버려진다 - 0.14 데이터 손실)
		
		/*
		 * short sh1 = 10; short sh2 = 20;
		 * 
		 * short sh3 = (short) (sh1 + sh2);
		 */
		
		char sh1 = 'A';		// 아스키코드 65
		short sh2 = 1;		// +1 = 66 -> B
		
		char sh3 = (char) (sh1 + sh2);
		
		System.out.println(sh3);	// 그래서 B로 출력.
		
		int a = 3;
		int b = 4;
		
		/*
		 * double c = a/b; // 정수/정수여서 정수로 나옴. 형변환 법칙이 적용돼서 0이 리턴됨.
		 * System.out.println(c); // 근데 정수를 실수로 변환해서 출력한거여서 0.0으로 출력됨.
		 */		
		
		double c = (double)(a/b);	// 형변환 하기 전에 계산먼저 되기 때문에 똑같이 0임.
		System.out.println(c);		// 그래서 똑같이 0.0으로 뜸
		
		// 실수->정수 : 0 / 정수->실수 : 0.0
		
		int aa = 3;
	    int bb = 4;
		double cc = (double)aa/bb;

		System.out.println(cc);
	}
}

package java_hello;

public class CharTypeUnicode {
	public static void main(String[] args) {

		//String str = "할";
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736;	// 문자 '헐'의 유니코드 값
		char ch4 = 54869;	// 문자 '확'의 유니코드 값
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;
		
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		// 문자는 '' 홀따옴표(?) 문자열(=String)은 "" 쌍따옴표
		
		/* 
		 * 문자와 숫자의 1:1 매칭.
		 * 
		 * */
	}
}

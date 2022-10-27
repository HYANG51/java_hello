package java_hello;

public class SwitchBasic {
	public static void main(String[] args) {
		
		//걸어서 하늘까지 -> 걸리면 break까지..... 아조씨....................
		int n = 3;
		
		switch(n) {
		case 1: 
			System.out.println("Simple Java");
			break;
		case 2: 
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
		}
		
		// break 안걸면 만약에 n=1이면 1번부터 default까지 다 출력됨.
		// n=1인데 중간에 2에만 break있으면 1,2가 출력됨. 
		// 브브브break가 고장난 8톤 트럭~~~
		
		// 문자도 넣을 수 있음. case 1대신 case 'A'로 넣고 int n = 65로 넣으면
		// 동일하게 Simple Java가 출력됨. A가 숫자로 변환되어서? 인듯?
		
		System.out.println("Do you like Java?");
	}
}

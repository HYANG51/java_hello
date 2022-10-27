package java_hello;

public class Gugu {
	public static void main(String[] args) {

		/*for(int i = 2; i < 10; i++) {	// 2단부터 9단까지 진행 위한 바깥쪽 for문
			for(int j = 1; j < 10; j++)	// 1부터 9까지의 곱을 위한 안쪽 for문
				System.out.println(i + "x" + j + "=" + (i*j));*/

		// 3단만 출력
		/*
		 * int dan = 3;
		 * 
		 * for(int i = 1; i <= 9; i++) { System.out.println(dan + "*" + i + "=" +
		 * (dan*i)); }
		 */

		// 구구단 전체 출력
		/*
		 * for(int i = 1; i <= 9; i++) {
		 * 
		 * for(int j =1; j <= 9; j++) { System.out.println(i + "*" + j + "=" + (i*j)); }
		 * System.out.println(); // 한 줄 공백 넣기 }
		 */

		// 구구단 짝수단만 출력
		/*for(int i = 1; i <= 9; i++)	{

				for(int j =1; j <= 9; j++) {
					if(i % 2 == 0) {
					System.out.println(i + "*" + j + "=" + (i*j));
					}
				}
				System.out.println(); 		// 한 줄 공백 넣기
			}*/

		// 구구단 짝수단만 출력 2
		/*
		 * for(int i = 1; i <= 9; i++) {
		 * 
		 * if(i % 2 != 0) continue;
		 * 
		 * for(int j =1; j <= 9; j++) { System.out.println(i + "*" + j + "=" + (i*j)); }
		 * System.out.println(); // 한 줄 공백 넣기 }
		 */	 		

		// 구구단 3의 배수만 출력
		for(int i = 1; i <= 9; i++)	{

			if(i % 3 != 0)
				continue;

			for(int j =1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();	// 한 줄 공백 넣기
		}		
	}

}

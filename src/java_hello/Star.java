package java_hello;

public class Star {
	public static void main(String[] args) {

		 // * 5*5로 찍기
		
		/*
		 * for(int i = 1; i < 6; i++) { System.out.println("*****"); }	//내가 쓴거 ^^....꼼수최고~~~
		 */
		
		
		  /*for(int i = 1; i < 6; i++) { 
			  for(int j = 1; j < 6; j ++) {
				  System.out.print("*"); 
			  }
          System.out.println();*/
          
			// println은 자동으로 줄바꿈됨. print는 줄바꿈 안됨
			// print로 줄바꿈하려면 이스케이프 써야댐 + "\n" 사용

		// 별 1개-> 2개-> 3개-> 4개-> 5개 찍기
		for(int i = 1; i <= 5; i++) { 
			  for(int j = 1; j <= i; j++) {
				  System.out.print("*"); 
			  }
        System.out.println();
		}
			
	}
}

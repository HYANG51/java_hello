package java_hello;

public class asdf {
	public static void main(String[] args) {
		
		// 국어 영어 수학 점수를 90 70 80으로 넣고, 총점과 평균을 구하시오.
		
		int 국어 = 90;
		int 영어 = 70;
		int 수학 = 80;
		
		System.out.println("총점 : " + 국어+영어+수학);
		System.out.println("평균 : " + (국어+영어+수학)/3);
		
		// 에스더 코드 (더 간지가 나버림)
		int kor = 90;
	    int mat = 70;
	    int eng = 80;
	    int total = kor + mat + eng;
	    double avg = total/3;
	      
	    System.out.println("국어 : " + kor + "\n수학 : " + mat + "\n영어 : " + eng + "\n총점 : " + total +"\n평균 : " + avg);
		// \n은 줄바꿈이래 HTML에서 <br>같은거
	    
	    // 센세
	    int korean, english, math;
	    double average;
	    
	    korean = 80;
	    english = 73;
	    math = 95;
	    
	    // average = (korean+english+math) / 3;	 	요거는 위에서 double로 선언해서 소수점이 아니라서 안된대 
	    average = (korean+english+math) / 3.0;		// 이게 베스트
	    // average = (korean+english+math) / (double)3;		그 외에 형변환 일케해도되고 절케해도되고~
	    // average = (double)(korean+english+math) / 3;
	    
	    
	    System.out.println(avg);
	    
	    
	    // = -> 대입 / == -> 같다 / % -> 나머지 -> 홀짝/n의 배수 표현할때 사용.
	}
}

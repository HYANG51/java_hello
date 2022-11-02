package java_hello;

public class GradeMethod {
	public static void main(String[] args) {
		System.out.println(grade(avg(50,65,65)));
		}
	public static double avg(int kor, int eng, int math) {
		return (kor + eng + math) / 3.0;
	}
	
	public static char grade(double avg) {
		char ch = ' ';
		
		if(avg >= 90)
			ch = '수';
		else if(avg >= 80)
			ch = '우';
		else if(avg >= 70)
			ch = '미';
		else if(avg >= 60)
			ch = '양';
		else
			ch = '가';
		return ch;
	}
}

package ch3;

public class OperatorEx2 {
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		//i 값을 j에 대입 후 i 값 증가
		j = i++;
		System.out.println("j=i++; 실행 후, i="+i+", j=" + j);
		
		i = 5;
		j = 0;
		
		//i 값 증가 후 i값을 j에 대입
		j = ++i;
		System.out.println("j=++i; 실행 후, i="+i+", j=" + j);
		
	}
	
}

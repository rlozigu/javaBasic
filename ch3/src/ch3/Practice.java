package ch3;

public class Practice {
	public static void main(String[] args) {
		int i = 9;
		double d = 9.4;
		
		//정수를 0으로 나누면 오류남(ArithmeticException)
		//System.out.println(i / 0);
		
		//이건 infinity 반환
		System.out.println(d / 0);
	}
	
}

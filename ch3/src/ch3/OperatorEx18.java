package ch3;

public class OperatorEx18 {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		//매개변수로 받은 값을 소수점 첫째자리에서 반올림하고 결과를 정수로 반환하는 메소드
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
	}
}

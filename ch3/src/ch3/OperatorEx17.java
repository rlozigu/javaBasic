package ch3;

public class OperatorEx17 {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		//int -> double시 소수점 버리지 않고 반올림하는 법
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi);
	}
}

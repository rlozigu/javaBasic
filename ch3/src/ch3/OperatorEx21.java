package ch3;

public class OperatorEx21 {
	public static void main(String[] args) {
		
		//비교 연산자는 연산을 수행하기 전에 형변환을 통해 두 피연산자의 타입을 같게 맞춘 다음 피연산자들을 비교한다.
		System.out.printf("10 == 10.0f \t %b%n", 10 == 10.0f);
		System.out.printf("'0' == 0 \t %b%n", '0' == 0);
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65);
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
		System.out.printf("'A' + 1 != 'B' \t %b%n", 'A' + 1 != 'B');
	}
}

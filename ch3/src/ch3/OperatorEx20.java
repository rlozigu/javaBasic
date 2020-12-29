package ch3;

public class OperatorEx20 {
	public static void main(String[] args) {
		
		//나누는 수로 음수도 허용되나 부호는 무시된다.
		//결과는 나머지 연산을 한 결과에 왼쪽 피연산자의 부호를 붙이면 된다.
		System.out.println(-10 % 8);
		System.out.println(10 % -8);
		System.out.println(-10 % -8);
	}
}

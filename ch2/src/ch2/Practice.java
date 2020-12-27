package ch2;

//책의 예제는 아니지만 개인적으로 궁금한거 실습
public class Practice {
	public static void main(String[] args) {
		int a = 0xF;
		//8진수인 17이 출력된다.
		System.out.printf("%o%n",a);
		System.out.printf("%d%n", a);
		
		//f가 출력된다
		System.out.printf("%x%n", a);
		//10진수인 15가 출력된다.
		System.out.printf("%s%n", a);
		
		//이거는 이 출력됨. F가 나타내는 유니코드인듯
		System.out.printf("%c%n", a);
		
		//이거는 오류난다..왜지? 정수타입이라 그런가
		//System.out.printf("%e%n", a);
		
		//10진수로 15가 출력된다.
		System.out.println(a);
	}

}

package ch3;

public class OperatorEx06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//byte로 형변환 안할시 오류 발생
		//a와 b모두 int형보다 작은 byte형이기 때문에 +연산자는 두 피연산자를 int형으로 변환 후 덧셈을 수행하기 때문
		byte c = (byte) (a + b);
		System.out.println(c);
	}
	
}

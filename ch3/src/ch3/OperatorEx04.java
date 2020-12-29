package ch3;

public class OperatorEx04 {
	public static void main(String[] args) {
		
		//부호 연산자는 boolean형과 char형을 제외한 기본형에만 사용 가능.
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = - i;
		System.out.println(i);
	}
	
}

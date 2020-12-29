package ch3;

public class OperatorEx3 {
	public static void main(String[] args) {
		int i = 5;
		int j = 5;
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i=" + i + ", j=" +j);
		
		
		//부적절한 사용 예시
		//식에 두 번 이상 포함된 변수에 증감연산자를 사용하는 것은 지양해야함.
		int x = 5;
		x = x++ - ++x;
		System.out.println(x);
	}
	
}

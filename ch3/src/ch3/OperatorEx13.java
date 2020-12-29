package ch3;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
		
//		컴파일 에러 발생
//		char c3 = c1 + 1;
		
		//얘는 에러 발생 안하는 이유? -> 리터럴간의 연산이기 때문.
		//실행과정동안 변하는 값이 아니기 때문에 컴파일 시 컴파일러가 계산해서 그 결과로 대체함.
		//컴파일러가 미리 덧셈연산을 수행해서 실행 시에는 덧셈 연산이 수행되지 않는다.
		//하지만 라인8처럼 변수가 들어가는 수식은 컴파일러가 미리 계산을 할 수 없기 때문에 형변환을 해주어야함.
		char c2 = 'a' + 1;
		
		System.out.println(c2);
		
	}
}

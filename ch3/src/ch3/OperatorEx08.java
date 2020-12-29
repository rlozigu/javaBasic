package ch3;

public class OperatorEx08 {
	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		
		long c = a * b;
		
		//long 타입인 c에 결과를 넣었음에도 잘못된 결과가 출력되는 이유?
		//a*b의 결과는 int로 반환되기 때문에.
		//제대로 된 결과를 얻으려면 a혹은 b를 long으로 형변환 후 계산
		System.out.println(c);

	}
	
}

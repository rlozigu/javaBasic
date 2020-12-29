package ch3;


public class OperatorEx29 {
	public static void main(String[] args) {
		
		//비트 전환 연산자는 피연산자의 타입이 int보다 작으면 int로 형변환 후 연산한다.
		byte p = 10;
		byte n = -10;
		
		System.out.printf("p = %d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));
		System.out.printf("~p+1 = %d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p = %d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		System.out.printf("n = %d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n-1));
	}
	
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}
}

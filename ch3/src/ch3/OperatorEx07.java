package ch3;

public class OperatorEx07 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		
		//더 큰 수를 작은 자료형에 넣었기때문에 데이터 손실 발생 300 -> 44
		byte c = (byte)(a*b);
		
		System.out.println(c);

	}
	
}

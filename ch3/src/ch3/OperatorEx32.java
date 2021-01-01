package ch3;


public class OperatorEx32 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		//x의 값이 음수면 양수로 만든다.
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = y >= 0 ? z : -z;
		
		//조건 연산자를 중첩
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : (x==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (x==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("x=%c%d%n", signY, absY);
		System.out.printf("x=%c%d%n", signZ, absZ);
	}
}

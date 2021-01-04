package ch4;


public class FlowEx30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				//자신이 포함된 가장 가까운 반복문을 벗어난다.
				break;
			}
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

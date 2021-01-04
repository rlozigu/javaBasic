package ch4;


public class FlowEx24 {
	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i-- != 0) {
			System.out.println(i);
			
			//시간 지연
			//같은 반복횟수인데도 long으로 하면 지연이 오래됨
			for(int j = 0 ; j < 2_000_000_000; j++) {}
		}
		System.out.println("GAME OVER");
	}
}

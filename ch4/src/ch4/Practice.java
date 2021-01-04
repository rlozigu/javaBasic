package ch4;

public class Practice {
	public static void main(String[] args) {
		
		char c = '1';
		
		switch(c) {
			case 49:
				System.out.println("이게되나?");
				break;
			case 1:
				System.out.println("이건되나?");
//			case 49랑 중복돼서 오류남
//			case '1':
//				System.out.println("이건되겠지");
		}
		
		System.out.println((int)c);

	}
}

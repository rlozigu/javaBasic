package ch6;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		
		//클래스 변수와 인스턴스 변수를 오인할 수 있기 때문에
		//c1.width 이런 방식보다는 Card.width로 표현하는 게 더 좋다.
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
	}
}

class Card{
	//인스턴스 변수
	String kind;
	int number;
	
	//클래스 변수
	static int width = 100;
	static int height = 250;
}

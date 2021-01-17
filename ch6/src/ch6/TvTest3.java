package ch6;

class Tv3 {
	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메서드)
	void power() {
		power = !power;
	}
	void channelUP() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
}
class TvTest3{
	public static void main(String[] args) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("t1의 channel값은" + t1.channel + "입니다.");
		System.out.println("t2의 channel값은" + t2.channel + "입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}

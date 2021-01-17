package ch6;

class Tv4 {
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
class TvTest4{
	public static void main(String[] args) {
		Tv4[] tvArr = new Tv4[3];
		
		for(int i = 0 ; i < tvArr.length ; i++) {
			tvArr[i] = new Tv4();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0 ; i < tvArr.length ; i++) {
			tvArr[i].channelUP();
			System.out.printf("tvArr[%d].channel = %d%n", i , tvArr[i].channel);
		}
	}
}

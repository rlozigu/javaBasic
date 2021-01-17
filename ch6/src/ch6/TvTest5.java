package ch6;

class Tv5 {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel + 100;
	}
	public void setChannel(int channel) {
		
		this.channel = channel + 10;
	}
	
	
	
}
class TvTest5{
	public static void main(String[] args) {
		Tv5 tv = new Tv5();
		
		tv.channel = 1;
		System.out.println(tv.channel);
		
		tv.setChannel(1);
		System.out.println(tv.channel);
		
		tv.setChannel(1);
		System.out.println(tv.getChannel());
		
		
	}
}

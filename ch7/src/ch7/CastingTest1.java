package ch7;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
		
		car.door = 8;
		fe2.door = 9;
		
		System.out.println(car.door);
		System.out.println(fe2.door);
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	
	void water() {
		System.out.println("water!!");
	}
}


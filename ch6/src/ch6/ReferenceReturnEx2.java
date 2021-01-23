package ch6;

class Data4{int x;
			Data4 data;}

public class ReferenceReturnEx2 {
	public static void main(String[] args) {
		Data4 d = new Data4();
		d.x = 10;
		d.data = new Data4();
		d.data.x = 900;
		
		Data4 d2 = copy(d);
		System.out.println("d.x = "+ d.x);
		System.out.println("d2.x = "+ d2.x);
		System.out.println("d.data.x = " + d.data.x);
		System.out.println("d2.data.x = " + d2.data.x);
		
		d.x = 80;
		d.data.x = 1000;
		System.out.println("d.x = "+ d.x);
		System.out.println("d2.x = "+ d2.x);
		System.out.println("d.data.x = " + d.data.x);
		System.out.println("d2.data.x = " + d2.data.x);
	}
	
	static Data4 copy(Data4 d) {
		Data4 tmp = new Data4();
		tmp.x = d.x;
		tmp.data = d.data;
		
		return tmp;
	}
}

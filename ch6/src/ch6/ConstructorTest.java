package ch6;

class Data5 {
	int value;
	String str;
}

class Data2 {
	int value;
	
	Data2(int x){
		value = x;
	}
}
class ConstructorTest {
	public static void main(String[] args) {
		Data5 d1 = new Data5();
		//컴파일에러 발생
//		Data2 d2 = new Data2();
		Data2 d2 = new Data2(2);
		
		System.out.println(d1.value);
		System.out.println(d1.str);
	}
}

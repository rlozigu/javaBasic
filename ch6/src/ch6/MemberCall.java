package ch6;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
//	static int cv2 = iv;
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		//에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
//		instanceMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	//인스턴스 메서드에서는 인스터스와 클래스메서드 모두 인스턴스 생성없이 호출이 가능하하다.
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}

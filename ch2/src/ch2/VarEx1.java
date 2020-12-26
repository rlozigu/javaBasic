package ch2;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		//변수의 값을 저장하는 대입연산(=)은 우변의 모든 계산이 끝난 후 제일 마지막에 수행된다.
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
	}

}

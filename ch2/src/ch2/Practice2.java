package ch2;

//책의 예제는 아니지만 개인적으로 궁금한거 실습
public class Practice2 {
	public static void main(String[] args) {
		byte b = (byte)1000;
		
		
		//-24왜지...? 뭔가 손실돼서 그러는듯?
		//1000을 2진수로 변환해서 8byte만 남기면 11101000
		//맨 앞이 1이기 때문에 음수로 인식해서 2의 보수법에 의해 -24가 출력되는듯
		System.out.println(b);
	}

}

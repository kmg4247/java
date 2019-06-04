package ch03;

public class OperatorEx7 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b); // 결과로 300이 나와야하지만 결과값은 44가 나온다. 데이터 손실이 발생하기 때문에
		System.out.println(c);

	}

}

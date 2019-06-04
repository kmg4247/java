package ch03;

public class OperatorEx8 {

	public static void main(String[] args) {

		int a = 1_000_000; // 1,000,000 - 백만
		int b = 2_000_000; // 2,000,000 - 이백만

		long c = a * b; // a*b=2000000000000???
		
		// a, b중 long 타입으로 형변환을 해줘야 정확한 값이 나온다.

		System.out.println(c);

	}

}

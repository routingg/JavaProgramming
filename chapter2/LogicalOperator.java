package chapter2;

public class LogicalOperator {

	public static void main(String[] args) {
		// 비교 연산
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		// 비교 연산&논리연산
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 4) || (-2 < 0));
		System.out.println((3 != 2) ^ (-1 > 0));
		
	}

}
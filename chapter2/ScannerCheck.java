package chapter2;
//Scanner 이용 / 2개의 정수를 입력받아 합을 출력
import java.util.Scanner;

public class ScannerCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a+b;
		System.out.println("두 정수의 합 : "+ c );
		
		scanner.close();
	}

}

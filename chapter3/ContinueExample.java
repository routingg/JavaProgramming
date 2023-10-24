package chapter3;
//5개의 정수를 입력 받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라.
import java.util.Scanner;
public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int sum = 0;
		
		for(int i = 0;i<5;i++) {
			int n = scanner.nextInt();
			if(n<=0) continue;
			else sum += n;
		}
		System.out.println("양수의 합: "+sum);
		scanner.close();
	}
}

package chapter3;
//while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라. -1이 입력되면 입력을 종료한다.
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		int n = scanner.nextInt();
		while (n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();			
		}
		if(count == 0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수: "+ count);
			System.out.print("	정수의 합: "+ sum);
			System.out.print("	정수의 평균: "+ (double)sum/count);
		}
		scanner.close();
	}
	
}

package chapter2;
//입력된 수가 3의 배수인지 판별하는 프로그램을 작성하시오.
import java.util.Scanner;
public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하세요:");
		int number = scanner.nextInt();
		
		if(number%3==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		scanner.close();
	}

}

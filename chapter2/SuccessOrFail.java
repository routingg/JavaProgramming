package chapter2;
//시험 점수를 입력받아 점수가 80점이 이상이면 합격 판별을 하는 프로그램을 작성하시오.
import java.util.Scanner;
public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		if(score>=80)
			System.out.println("합격!");
		scanner.close();
	}

}

package chapter2;
//다중 if-else문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성해보자.
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		
		System.out.println("점수를 입력하세요(0~100)");
		int Score = scanner.nextInt();
		
		if(Score >= 90) // score가 90 이상
			grade = 'A';
		else if(Score >= 80) // score가 80 이상 90 미만
			grade = 'B';
		else if(Score >= 70) // score가 70 이상 80 미만
			grade = 'C';
		else if(Score >= 60) // score가 60 이상 70 미만
			grade = 'D';
		else // score가 60 이만
			grade = 'F';
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
		

	}

}

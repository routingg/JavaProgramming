package chapter3;
//배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 구하는 프로그램을 작성하라.
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int myArray[] = new int[5];
		int sum = 0;
		
		System.out.println(myArray.length + "개의 정수 입력");
		for(int i=0;i<myArray.length;i++) {
			myArray[i] = scanner.nextInt();
			sum += myArray[i];
		}
		System.out.println("평균: "+(double)(sum/myArray.length));
		scanner.close();
	}

}

package chapter3;
//for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하시오.
public class ForSample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum += i;
			System.out.print(i);
			
			if(i<=9)
				System.out.print('+');
			else {
				System.out.print('=');
				System.out.print(sum);
			}
		}
	}
}


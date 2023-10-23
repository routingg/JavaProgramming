package chapter2;
//조건연산자
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
		
		int x = 5;
		int y = 3;
		int s;
		if(x>y)
		s = 1;
		else
		s = -1;
		//조건연산자 ?:
		int s1 = (x>y)?1:-1; 
		System.out.println(s+" "+s1);

	}

}

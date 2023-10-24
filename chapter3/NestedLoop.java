package chapter3;
//2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램을 작성하시오. 한 줄에 한 단씩 출력한다.
public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"x"+j+"="+ i*j);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}

package chapter3;
//비정방형 배열을 만들어 값을 초기화하고 출력하시오.
public class IrregularArray {
	public static void main(String[] args) {
		int intArray [][];
		intArray = new int [4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for (int i = 0; i < intArray.length; i++)
			for (int j = 0; j < intArray[i].length; j++)
				intArray[i][j] = (i+1)*10 + j;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j]+" ");
			System.out.println();
		}	
	}
}
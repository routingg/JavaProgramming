package chapter2;
//대입연산자 & 증강연산자
public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		int a=3,b=3,c =3;
		a += 3;
		b *= 3;
		c %= 3;
		System.out.println("a="+a+" b="+b+" c="+c);
		
		int d =3;
		a = d++;
		System.out.println("a="+a+" d="+d);
		a = ++d;
		System.out.println("a="+a+" d="+d);
		a = d--;
		System.out.println("a="+a+" d="+d);
		a = --d;
		System.out.println("a="+a+" d="+d);
	}
}

package chapter4;
//반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라.
public class circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		circle pizza;
		pizza = new circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		circle donut = new circle();
		donut.name = "자바도넛";
		donut.radius = 2;
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은 "+area);

	}

}

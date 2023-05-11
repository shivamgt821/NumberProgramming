import java.util.Scanner;

abstract class Shape {
	
	float area;
	abstract void acceptInput();
	
	abstract void calcArea();
	
	void dispArea()
	{
		System.out.println(area);
	}
}
 class Rectangle extends Shape {
	
	float length;
	float breadth;
	void acceptInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle");
		length = scn.nextFloat();
		System.out.println("Enter breadth of the Rectangle");
		breadth = scn.nextFloat();
	}
	
	void calcArea() {
		area = length*breadth;
	}
}

class Square extends Shape {
	
	float side;
	void acceptInput() {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter side of the Square : ");
	side = scn.nextFloat();
	}
	@Override
	void calcArea() {
		area = side*side;

	}
}
class Circle extends Shape {
	
	float radius;
	void acceptInput() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter radius of the circle : ");
		radius = scn.nextFloat();
	}
	@Override
	void calcArea() 
	{
		area = 3.14f*radius*radius;
	}
}
class Geometry {
	void permit(Shape ref) {
	ref.acceptInput();
	ref.calcArea();
	ref.dispArea();
	}
}
public class Area_of_Trigonometry {

	public static void main(String[] args) {
		Rectangle  r = new Rectangle();
		Square  s = new Square();
		Circle  c = new Circle();
		
		
		Geometry g = new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		
	}

}

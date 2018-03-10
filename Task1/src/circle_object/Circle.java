package circle_object;

public class Circle {
	int radius; // circle properties
	
	public Circle(int radius) {// parameterized constructor
		this.radius=radius;
	}
	
	public  void diameter() {
		
		System.out.println("Diameter of the circle is :"+ 2*this.radius);
	}
	
	public void area() {
		double area;
		area = Math.PI  * Math.pow(radius, 2);
		
		System.out.println("Area of circle is :"+ area);
		
	}
	
	public void circumference() {
		double circumference;
		circumference = 2*Math.PI*this.radius;
		System.out.println("Circumference of the circle is 	:"+ circumference);
		
		
	}

}

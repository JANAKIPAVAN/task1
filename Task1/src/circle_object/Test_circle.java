package circle_object;

public class Test_circle {

	public static void main(String[] args) {
	Circle c1= new Circle(6);// circle object c1 is created by invoking constructor
	c1.diameter();//calling circle behavior or methods 
	c1.area();
	c1.circumference();
	
	
	
	Circle c2= new Circle(4);// circle object c2 is created
	c2.diameter();
	c2.area();
    c2.circumference();
	
	if(c1.equals(c2)) {
		
		System.out.print("both values of circle object are equal");
		
	} else {
		System.err.println("Both circle objects are not equal ");
	}
	
	}
	

}

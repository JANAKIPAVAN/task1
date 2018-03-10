package dog_object;

public class Test_dog {

	public static void main(String[] args) {
	Dog d1=new Dog(3,3,"tony");
	
	d1.barks();
	d1.jumps(4);
	d1.jumps(4,4);
	System.out.println(d1.dog_name+" runs "+d1.runs()+ "kms a day");
	}

}

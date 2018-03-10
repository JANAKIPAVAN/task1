package dog_object;

public class Dog {
int age;
int height;
String dog_name;
public Dog(int age,int height,String dog_name) {
	this.age=age;
	this.height=height;
	this.dog_name=dog_name;

}
public void barks() {
	System.out.println(this.dog_name+" barks when it see theifs");
}
//jumps(int)
public void jumps(int height) {
	
	System.out.println(this.dog_name+" jumps"+ height+ " feet high above round level");
}
//jumps(int,int)
public void jumps(int height,int distance) {
	System.out.println(this.dog_name+" jumps"+ height+ " feet high "+ distance+" feet long in distance");
	
}
public void eats() {
	
	System.out.println(this.dog_name+" Eats only chicken");
}

public int runs() {
	
	return 3;
}

}

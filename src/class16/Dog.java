package class16;

public class Dog {
	String name;
	static int noOfLegs=4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	
	void displayName() {
		System.out.println(name);
		System.out.println(noOfLegs);
	}
	
	void printInfo() {
		displayName();
		displayColor();
		DisplayLegs();
	}
	static void DisplayLegs() {
		//displayName();
		//System.out.println(name); not allowed
		System.out.println(noOfLegs);
	}
}

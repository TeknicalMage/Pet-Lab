
public class Dog extends Pet {

	public Dog(String n, int a, double w) {
		super(n, a, w);
	}
	
	public void bark() {
		System.out.println(getName() + " has barked!");
	}
	
	public void dig() {
		System.out.println(getName() + " is digging!");
		setWeight(getWeight()-1);
		System.out.println(getName() + " has lost a pound and is now " + getWeight() + "!");
	}
}

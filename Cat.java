
public class Cat extends Pet{

	public Cat(String n, int a, double w) {
		super(n, a, w);
	}
	
	public void scratch() {
		System.out.println(getName() + " is scratching!");
	}
	
	public void purr() {
		System.out.println(getName() + " is purring!");
	}

}


public class Hamster extends SmallMammals{

	public Hamster(String n, int a, double w) {
		super(n, a, w);
	}
	
	public void runOnWheel() {
		System.out.println(getName() + " runs on a hamster wheel!");
		setWeight(getWeight() - 0.2);
		System.out.println(getName() + " has lost 0.2 pounds and is now " + getWeight() + "!");
	}
}

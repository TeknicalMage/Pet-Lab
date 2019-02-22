
public class SmallMammals extends Pet {

	public SmallMammals(String n, int a, double w) {
		super(n, a, w);
	}
	
	public void gainWeight() {
		setWeight(getWeight() + 0.2);
	}
	
	public void loseWeight() {
		setWeight(getWeight() - 0.2);
	}
	
	public void eatPoo() {
		System.out.println(getName() + " has eaten poop!");
		gainWeight();
		System.out.println(getName() + " has gained 1 pound and is now " + getWeight() + "!");
	}
}

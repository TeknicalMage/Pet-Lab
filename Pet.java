public class Pet
{
   private String name;
   private int age;
   private double weight;

   public Pet(String n, int a, double w)
   {
      name = n;
      age = a;
      weight = w;
   }

   public String getName()
   {
      return name;
   }
   
   public void celebrateBirthday()
   {
      age++;
      gainWeight();
      System.out.println("Happy birthday to " + name + "!");
      System.out.println(name + "'s age is now " + age + " and their weight is now " + weight + " pounds.");
      System.out.println();
   }
   
   public void eat()
   {
      gainWeight();
      System.out.println(name + " is eating");
      System.out.println(name + "'s weight is now " + weight + " pounds.");
      System.out.println();
   }
   
   public void play()
   {
      loseWeight();
      System.out.println(name + " is playing");
      System.out.println(name + "'s weight is now " + weight + " pounds.");
      System.out.println();
   }
   
   public void sleep()
   {
      System.out.println(name + " is sleeping");
      System.out.println();
   }
   
   public void gainWeight(){
      weight++;
   }
   
   public void loseWeight(){
      weight--;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }

   //NOTE: getClass().getName() will return the class name that the object was instantiated as.
   public String toString()
   {
      return name + ", " + getClass().getName() + ", " + age + " years old, " + weight + " pounds";
   }

}
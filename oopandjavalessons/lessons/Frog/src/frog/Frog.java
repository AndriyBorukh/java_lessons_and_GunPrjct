
package frog;

class Characteristic
{
 private String s;

    public Characteristic(String s) 
    {
        this.s=s;
        System.out.println("creating Characteristic"+s);
    }
 protected void Dispose()
 {
  System.out.println("deleting Characteristic"+s);
 }         
}

class Description
{
 private String s;

    public Description(String s) 
    {
        this.s=s;
        System.out.println("creating Description"+s);
    }
 protected void Dispose()
 {
  System.out.println("deleting Description"+s);
 }         
}

class LivingCreature
{
 private Characteristic p= new Characteristic("Living Creature");
 private Description t= new Description("Simple Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature.<init>()");
    }
 protected void Dispose()
 {
     System.out.println("LivingCreature.Dispose()");
     t.Dispose();
     p.Dispose();
 }         
}
 class  Animal extends LivingCreature
{
 private Characteristic p= new Characteristic("Has a heart");
 private Description t= new Description("Animal");

    public Animal() {
        System.out.println("Animal.<init>()");
    }
 protected void Dispose()
 {
     System.out.println("Animal.Dispose()");
     t.Dispose();
     p.Dispose();
     super.Dispose();
 }         
}       
   class  Amphibian extends Animal
{
 private Characteristic p= new Characteristic(" Can Live in Water");
 private Description t= new Description("live in water");

    public Amphibian() {
        System.out.println("Amphibian.<init>()");
    }
 protected void Dispose()
 {
     System.out.println("Amphibian.Dispose()");
     t.Dispose();
     p.Dispose();
     super.Dispose();
 }         
}      
public class Frog extends Amphibian{
private Characteristic p= new Characteristic(" Croaking");
 private Description t= new Description("eating insects");
  public Frog() {
        System.out.println("Frog.<init>()");
    }
 protected void Dispose()
 {
     System.out.println("Frog.Dispose()");
     t.Dispose();
     p.Dispose();
     super.Dispose();
 }         
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frog f=new Frog();
        System.out.println("Goodbye!");
        f.Dispose();    }
    
}

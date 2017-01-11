
package drago;




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
 private Description t= new Description("Live in water");

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
   class  Reptile extends Amphibian
{
 private Characteristic p= new Characteristic("Has a speed regeneration ");
 private Description t= new Description("Grow tail");

    public Reptile() {
        System.out.println("Reptile.<init>()");
    }
 protected void Dispose()
 {
     System.out.println("Reptile.Dispose()");
     t.Dispose();
     p.Dispose();
     super.Dispose();
 }         
} 

public class Dragon extends Reptile{
private Characteristic p= new Characteristic("has a 3 heads ");
 private Description t= new Description("3 heads");
Reptile head1= new Reptile();
Reptile head2= new Reptile();
Reptile head3= new Reptile();
    public Dragon() {
        System.out.println("Dragon.<init>()");
    }
 protected void Dispose()
 {
     System.out.println("Dragon.Dispose()");
     t.Dispose();
     p.Dispose();
     head3.Dispose();
     head2.Dispose();
     head1.Dispose();
     super.Dispose();
 }         
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dragon d= new Dragon();
       d.Dispose();
    }
    
}

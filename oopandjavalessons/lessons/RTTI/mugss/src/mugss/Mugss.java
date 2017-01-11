
package mugss;

/**
 *
 * @author Андрей
 */
class Mug 
{
 Mug (int marker)
 {
     System.out.println("mug ("+marker+")");
 }
 void f (int marker)
 {
  System.out.println("f ("+marker+")");
 }
}
 class Mugs
 {
        Mug mug1;
        Mug mug2;
 {
      mug1= new Mug(1);
      mug2= new Mug(2);
      
  System.out.println("mug1 and mug2 initialized");
  }
  Mugs()
  {System.out.println("mugs()");}
  Mugs(int i)
  {System.out.println("mugs(int)");}
  
 }

public class Mugss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    System.out.println("inside main");
    new Mugs();
    System.out.println(" new Mugs() ended");
    new Mugs(1);
    System.out.println(" new Mugs(int) ended");
    }
    
}

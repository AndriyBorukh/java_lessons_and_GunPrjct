
package beetle;
class Insect
{
 private int i =9;
 protected int j;

    public Insect() {
        System.out.println("i="+i+"j="+j);
        j=45;
    }
  private static int x1= printinit ("field x1 of static insect initialized ");
  static int printinit (String s)
  {
      System.out.println(s);
      return 33;
  } 
  
}


/**
 *
 * @author Adeptus mechanicus
 */
public class Beetle extends Insect{
 private int k= printinit("field k initialized");
 public Beetle()
 {
     System.out.println("k="+k);
     System.out.println("j="+j);
 }
private static int x2= printinit ("field static  Beetle.x1  initialized ");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("entering Beetle constructor");
        Beetle b = new Beetle();
    }
    
}

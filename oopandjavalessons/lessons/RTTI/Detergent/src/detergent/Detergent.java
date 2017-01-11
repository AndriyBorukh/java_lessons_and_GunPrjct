package detergent;
 class Cleanser 
 {
  private String s= "Cleanser";
     public void append(String a) {s+=a;}
     public void dilute() {append("dilute()");}
     public void apply() {append("apply()");}
     public void scrub() {append("scrub()");}
     public String toString() {return s;}
         public static void main(String[] args) {
        Cleanser x= new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
 }

/**
 *
 * @author Андрей
 */
public class Detergent extends Cleanser {
  public void  scrub()
  {
      append("Detergent.scrub()");
      super.scrub();
  }
  public void  foam()
  { append(" foam()");}
  
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Detergent x= new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
        System.out.println("checking basical class");
        Cleanser.main(args);
        
    }
    
}

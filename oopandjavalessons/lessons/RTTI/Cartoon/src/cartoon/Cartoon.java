package cartoon;

/**
 *
 * @author Андрей
 */


class Art
{
 Art(){System.out.println("Art()");}
}
class Drawing extends Art
{
    public Drawing() {System.out.println("Drawing()");}
}
        
        
public class Cartoon extends Drawing {
  public Cartoon() {System.out.println("Cartoon()");}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cartoon x= new Cartoon();
    }
    
}

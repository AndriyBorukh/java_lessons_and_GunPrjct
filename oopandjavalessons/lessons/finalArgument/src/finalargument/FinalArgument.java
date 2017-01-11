
package finalargument;

class Gizmo
{
public void spin()
{System.out.println("Gizmo.spin()");}
}

public class FinalArgument {
void with (final Gizmo g)
{
 //g=new Gizmo();
}
void without ( Gizmo g)
{
 g=new Gizmo();
 g.spin();
 
}
 void f(final int i)
 {
     //i++;
 }
 int getipp (final int i)
 {
 return i+1;
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FinalArgument fa= new FinalArgument();
        fa.without(null);
        fa.with(null);
    }
    
}

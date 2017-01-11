
package blankfinal;
class Poppet 
{
private  int i;

    public Poppet(int ii) {
        i=ii;
        System.out.println(ii);
    }
 
}


public class BlankFinal {
       private  final int i=0;
       private  final int j;
       private  final Poppet p;
       public BlankFinal()
       {
       j=1;
       p=new Poppet(1);
       }
       public BlankFinal(int x)
       {
       j=x;
       p=new Poppet(x);
       }       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new BlankFinal();
      new BlankFinal(2);
    }
    
}

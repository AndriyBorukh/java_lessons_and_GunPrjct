
package finaloverridingilusion;

class withfinals
{
private final void f ()
{
    System.out.println("withfinals.f()");
}
private void g ()
{
    System.out.println("withfinals.g()");
}
}
class   Overridingprivate  extends withfinals
{
private final void f ()
{
    System.out.println("owerrp.f()");
}
private void g ()
{
    System.out.println("owerrp.g()");
}
}
class   Overridingprivate2  extends Overridingprivate
{
public final void f ()
{
    System.out.println("owerrp2.f()");
}
public void g ()
{
    System.out.println("owerrp2.g()");
}
}

/**
 *
 * @author Adeptus mechanicus
 */
public class FinaloverridingIlusion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Overridingprivate2 op2= new Overridingprivate2();
        op2.f();
        op2.g();
        Overridingprivate op= op2;
       // op.f();
       // op.g();
        Overridingprivate op1= new Overridingprivate();
      /*  op2=  (Overridingprivate2) op1;
        op2.f();
         op2.g(); */
      withfinals wf =op2;
      //wf.f();
      //wf.g();
    }
    
}

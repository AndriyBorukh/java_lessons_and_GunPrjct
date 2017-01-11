
package referencecount;

class Shared 
{
private int refcount=0;
private static long  counter=0;
private final long id =counter++;
public Shared()
{
    System.out.println("creating"+this);
    
}
public void addRef()
{
 refcount++;
}
protected void dispose()
{
  if(--refcount==0)
  {
      System.out.println("disposing"+this);
  }
}
public String toString ()
{
return "Shared"+id;
}
}
class Composing 
{
    
private Shared sh;
private static long  counter=0;
private final long id =counter++;
public Composing(Shared s)
{
    System.out.println("creating"+this);
    this.sh=s;
    this.sh.addRef();
}

protected void dispose()
{
  System.out.println("disposing"+this);
  sh.dispose();
}
public String toString()
{
return "Composing"+id;
}
}

public class ReferenceCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Shared shared = new Shared();
      Composing [] comp ={
      new Composing(shared),new Composing(shared),
new Composing(shared), new Composing(shared), new Composing(shared) };
      for (Composing c: comp)
          c.dispose();
    }
    
}

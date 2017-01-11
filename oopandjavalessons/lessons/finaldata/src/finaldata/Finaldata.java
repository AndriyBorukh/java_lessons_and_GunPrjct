
package finaldata;

import java.util.*;
        
/**
 *
 * @author Adeptus mechanicus
 */
class  Value
{
 int i;
 public Value (int i)
 {
  this.i=i;
 }
}
public class Finaldata {
    public Finaldata(String id)
            {this.id=id;}
private static Random rand = new Random(47);
private String id;
private final int  valueone =1;
private static final int VALUE_TWO=2;
public static final int VALUE_THREE=3;
private final int i4=rand.nextInt();
static final int INT_5=rand.nextInt();
private Value v1= new Value(11);
private final Value v2= new Value(12);
private static final Value VAL_3= new Value(33);
private final  int [] m={1,2,3,4,5,6,7};
public String toString ()
{ return id +":" +"i4="+i4+"INT_5="+INT_5;  }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Finaldata f1 = new Finaldata("f1");
      //  f1.valueone++;
        f1.v2.i++;
        f1.v1=new Value(5);
        for (int i=0; i< f1.m.length; i++)
            f1.m[i]++;
        //f1.v2=new Value(3);
        //f1.VAL_3=new Value(5);
        //f1.m= new int[3];
        System.out.println(f1);
        System.out.println("creating finaldata");
        Finaldata f2 = new Finaldata("f2");
        System.out.println(f1);
        System.out.println(f2);
    }
    
}

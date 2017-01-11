
package covariant.pkgreturn;

class Grain
{
 public String toString()
 {return"grain";}
}

class Wheat extends Grain
{
 public String toString()
 {return"Wheat";}
}

class Mill
{
 Grain process()
 {return new Grain();}
}

class WheatMill extends Mill
{
 Wheat process()
 {return new Wheat();}
}
public class CovariantReturn {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mill m =new Mill();
        Grain g=m.process();
        System.out.println(g);
        m=new WheatMill();
        g=m.process();
        System.out.println(g);
    }
    
}

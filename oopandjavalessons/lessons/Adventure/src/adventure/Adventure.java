package adventure;

interface Canfight
{
void fight();
}

interface Canswim
{
void swim();
}
interface Canfly
{
void fly();
}
class Playcharacter
{
public void fight()
{System.out.println("Playcharacter.fight()");}
}

class Hero extends Playcharacter implements Canfight,Canfly,Canswim
{
public void swim()
{System.out.println("Playcharacter.swim()");}

public void fly()
{System.out.println("Playcharacter.fly()");}
}

/**
 *
 * @author Adeptus Mechanicus
 */
public class Adventure {
 public static void t(Canfight c)
 {c.fight();}
  public static void u(Canfly c)
 {c.fly();}
   public static void v(Canswim c)
 {c.swim();}
    public static void w(Playcharacter c)
 {c.fight();}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero h= new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
    
}

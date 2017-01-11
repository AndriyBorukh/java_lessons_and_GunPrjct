
package horrorshow;

interface Monster
{
 void menace ();
 
}
interface DangerousMonster extends Monster
{
 void destroy ();
 
}
interface Lethal 
{
 void kill ();
 
}

class Werwoolf implements DangerousMonster
{
  public void menace()
  {
      System.out.println("Werwoolf.menace()");
  }
  public void destroy()
  {
      System.out.println("Werwoolf.destroy()");
  }  
} 

interface Vampire extends DangerousMonster,Lethal
{
 void drinkblood ();
 
}


class  HighVampire implements Vampire
{
  public void menace()
  {
      System.out.println("HighVampire.menace()");
  }
  public void destroy()
  {
      System.out.println("HighVampire.destroy()");
  }  
  
    public void kill()
  {
      System.out.println("HighVampire.kill()");
  }  
 
        public void drinkblood()
  {
      System.out.println("HighVampire.drinkblood()");
  }  
    
} 


/**
 *
 * @author Adeptus Mechanicus
 */
public class HorrorShow {
    static  void menace (Monster b)
    {b.menace();}
    static  void menaceanddestroy (DangerousMonster b)
    {
        b.menace();
        b.destroy(); 
    }
        static  void kill (Lethal b)
    {b.kill();}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DangerousMonster vasja= new  Werwoolf();
        menace(vasja);
        menaceanddestroy(vasja);
        Vampire regis= new HighVampire();
        menace(vasja);
        menaceanddestroy(vasja);        
        // TODO code application logic here
    }
    
}

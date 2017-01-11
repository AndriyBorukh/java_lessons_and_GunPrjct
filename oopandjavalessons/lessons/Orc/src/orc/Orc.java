
package orc;

class Villain
{
 private String name;
 protected void set (String nme)
 {
  name=nme;
 }
 public Villain(String name)
 {
 this.name= name;
 }
 public String toString()
 {
 return "I am villain my name "+name;
 }
 
}


/**
 *
 * @author Adeptus mechanicus
 */
public class Orc extends Villain{
 private int orcNumber;
 public Orc (String name,int orcNumber)
 {
    super(name);
    this.orcNumber=orcNumber;
 }
 public void change   (String name,int orcNumber)
 {
    set(name);
    this.orcNumber=orcNumber;
 }
 
 public String toString ()
 {
 return "Orc"+orcNumber+ " "+super.toString();
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orc vasja = new Orc("vasja", 22);
        System.out.println(vasja);
        vasja.change("vasiliy", 33);
        System.out.println(vasja);
    }
    
}

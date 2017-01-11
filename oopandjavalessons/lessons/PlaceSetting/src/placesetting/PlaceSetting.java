package placesetting;

class Plate
{
 public Plate(int i)
 {
     System.out.println("Plate()");
 }
}
class DinnerPlate extends Plate
{

    public DinnerPlate(int i) {
        super(i);
        System.out.println(" DinnerPlate()");
    }
}
class Utensil
{
 public Utensil(int i)
 {
     System.out.println("Utensil()");
 }
}
class Spoon extends Utensil
{
 Spoon (int i)
 {
  super(i);
  System.out.println("Spoon()");
 }
}
class Fork extends Utensil
{
 Fork (int i)
 {
  super(i);
  System.out.println("Fork()");
 }
}
class Knife extends Utensil
{
 Knife (int i)
 {
  super(i);
  System.out.println("Knife()");
 }
}
class Custom
{
 public Custom(int i)
 {
     System.out.println("Custom()");
 }
}

/**
 *
 * @author Андрей
 */
public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife knf;
    private DinnerPlate pl;
    public PlaceSetting(int i){
        super(i+1);
        sp= new Spoon(+2);
        frk= new Fork(i+3);
        knf= new Knife(i+4);
        pl=new DinnerPlate(i+5);
        System.out.println("PlaceSetting()");        
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlaceSetting x= new PlaceSetting(9);
    }
    
}

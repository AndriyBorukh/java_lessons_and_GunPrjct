
package sandwich;

class Meal
{
    public Meal() {
        System.out.println("Meal.<init>()");
    }
}
class Cheese
{
    public Cheese() {
        System.out.println("Cheese.<init>()");
    }
}
class Bread
{
    public Bread() {
        System.out.println("Bread.<init>()");
    }
}

class Lettuce
{
    public Lettuce() {
        System.out.println("Lettuce.<init>()");
    }
}

class  Lunch extends Meal
{
    public Lunch() {
        System.out.println("Lunch.<init>()");
    }
}

class  PortableLunch extends Lunch
{
    public PortableLunch() {
        System.out.println("PortableLunch.<init>()");
    }
}

public class Sandwich extends PortableLunch{

    private Bread b =new Bread();
    private Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    public  Sandwich()
    {
        System.out.println("Sandwich.<init>()");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     new Sandwich();
    }
    
}

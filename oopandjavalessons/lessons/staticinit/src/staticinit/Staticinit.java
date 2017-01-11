package staticinit;

/**
 *
 * @author Андрей
 */
class Bowl
{
 Bowl (int marker)
 {
     System.out.println("Bowl ("+marker+")");
 }
 void f1(int marker)
 {
     System.out.println("f1 ("+marker+")");
 }
}
class Table
{
 static Bowl bowl1 = new Bowl(1);
  Table ()
  {
     System.out.println("Table () ");
     bowl2.f1(1);
  }
  void f2 (int marker)
  {
  System.out.println("f2 ("+marker+")");
  }
  static Bowl bowl2 = new Bowl(2);        
}
class Cupboard{
 Bowl bowl3 = new Bowl(3);
static Bowl bowl4 = new Bowl(4);
Cupboard(){
System.out.println("Cupboard()");
bowl4.f1(2);
}
  void f3 (int marker)
  {
  System.out.println("f3 ("+marker+")");
  }
static Bowl bowl5 = new Bowl(5);
}

class Cup
{
   Cup (int marker)
 {
     System.out.println("Cup ("+marker+")");
 }
  void   f (int marker)
 {
     System.out.println(" f ("+marker+")");
 }   
}

class Cups
{
static Cup cup1;
static Cup cup2;
static {
 cup1= new Cup(1);
 cup2= new Cup(2);
}
Cups()
{
    System.out.println(" Cups() ");
}
}

public class Staticinit {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("creating new Cupboard object");
        new Cupboard();
        System.out.println("creating new Cupboard object");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);  
        System.out.println("inside main");
       // Cups.cup1.f(99);
        cups1.cup1.f(0);
    }
    static Cups cups1 =new Cups();
   // static Cups cups2=new Cups();
    static Table table= new Table();
    static Cupboard cupboard= new Cupboard();
}

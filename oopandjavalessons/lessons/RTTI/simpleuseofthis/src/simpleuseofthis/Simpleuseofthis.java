
package simpleuseofthis;

/**
 *
 * @author Андрей
 */
class Apple
{
 Apple getPeeled()
 { 
     return Peeler.peel(this);
 }
}     

class Peeler
{
 static Apple peel(Apple apple)
 {
     System.out.println("Peel");
  return apple;
 }
}
class Person {
 public void eat (Apple apple)
 {
     Apple peeled = apple.getPeeled();
     System.out.println("Yummy");
 }       
}
        

public class Simpleuseofthis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leaf x= new Leaf();
        x.increment().increment().increment().print();
        new Person().eat(new Apple());
        
    }
    
}

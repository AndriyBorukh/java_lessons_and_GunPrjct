
package shapes;

/**
 *
 * @author Adeptus mechanicus
 */
public class Circle extends Shape{

     public void Draw() {
         System.out.println("Circle.Draw()");
    }
    public void Erase() {
         System.out.println("Circle.Erase()");
    }
     public  double s()
    {
    return  (Math.PI* Math.pow(5.0, 2.0));
    }
     
}

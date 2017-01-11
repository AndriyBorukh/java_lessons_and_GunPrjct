
package hide;

class Homer 
{
char doh (char c)
{
    System.out.println("Homer.doh(char)");
    return  c;
}
float doh (float f)
{
    System.out.println("Homer.doh(float)");
    return  f;
}
}

class Milhouse {}
class Bart extends Homer 
{
void doh (Milhouse m)
{
    System.out.println("Bart.doh(Milhouse)");
}
}
/*class Lisa extends Homer 
{
@Override  void doh (Milhouse m)
{
    System.out.println("Bart.doh(Milhouse)");
}
}*/

public class Hide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Bart b = new Bart();
      b.doh(1);
      b.doh('x');
      b.doh(1.5f);
      b.doh(new Milhouse());
    }
    
}

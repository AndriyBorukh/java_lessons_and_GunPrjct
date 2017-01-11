
package reusing_hide;


class Homer
{
    char doh (char c)
    {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh (float f)
    {
        System.out.println("doh(float)");
        return 1.0f;
    }    
}

class Milhouse
{ }

class Bart extends Homer
{
   void doh ( Milhouse m)
    {
        System.out.println("doh(cmilhouse)");
       
    }

}

public class Reusing_hide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bart b= new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
        
    }
    
}

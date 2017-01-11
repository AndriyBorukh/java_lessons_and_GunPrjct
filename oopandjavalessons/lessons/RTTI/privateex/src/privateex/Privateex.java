
package privateex;

/**
 *
 * @author Андрей
 */

class Sundae{
private Sundae()
{}
static Sundae make()
{
    return new Sundae();
}
}
public class Privateex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sundae s=Sundae.make();
    }
    
}

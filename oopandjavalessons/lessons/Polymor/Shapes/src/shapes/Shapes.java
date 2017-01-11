
package shapes;

/**
 *
 * @author Adeptus mechanicus
 */
public class Shapes {
private static randomSapesgen rs= new randomSapesgen();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Shape [] ss= new Shape[9];
    for (int i=0; i<ss.length;i++)
       ss[i]= rs.next();
    for (int i=0; i<ss.length;i++)
    {
     ss[i].Draw();
        System.out.println("sqare"+ss[i].s());
    ss[i].Erase();
    }
// TODO code application logic here
    }
    
}

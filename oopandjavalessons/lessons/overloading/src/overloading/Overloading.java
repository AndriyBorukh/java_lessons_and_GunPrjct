
package overloading;

/**
 *
 * @author Андрей
 */

class tree 
{
 int height;
  tree(){
    System.out.println("plant tree");
    height=0;
}
  tree(int initheight){
      height=initheight;
    System.out.println("plant tree with height"+height);
}
 void info ()
 {
 System.out.println("plant tree with height"+height);
 }
 void info (String s)
 {
 System.out.println( s+"plant tree with height"+height);
 } 
  
}

public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        for (int i=0 ; i< 10; i++)
        {
         tree myfirsttree= new tree(i);
         myfirsttree.info();
         myfirsttree.info("overloadedmethod");
        }
        tree myfirsttree= new tree();
        // TODO code application logic here
    }
    
}

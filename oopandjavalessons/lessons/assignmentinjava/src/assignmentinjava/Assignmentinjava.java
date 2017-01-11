
package assignmentinjava;

import java.util.Random;

/**
 *
 * @author Андрей
 */

public class Assignmentinjava {

    /**
     * @param args the command line arguments
     */
    static void  func (letter y)
    {
    y.c='y';
    }
        static void  func (char c)
    {
    c='v';
    }
    public static void main(String[] args) {
        Tank t1= new Tank();
        Tank t2= new Tank();
        t1.level=22;
        t2.level=46;
        System.out.println( "t1.level "+ t1.level+" t2.level"+t2.level);
             t1.level=t2.level;
        t2.level=77;
        System.out.println( "t1.level "+ t1.level+" t2.level"+t2.level);
       // t1=t2;
        t2.level=77;
        System.out.println( "t1.level "+ t1.level+" t2.level"+t2.level);
        letter m = new letter();
        m.c='l';
        System.out.println( "m.c "+ m.c);
        func (m);
        System.out.println( "m.c "+ m.c);

        
  }
    
}

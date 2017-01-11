package array_new;
import java.util.*;
/**
 *
 * @author Андрей
 */
public class Array_new {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int [] a;
           Random r= new Random(47);
           a= new int [r.nextInt(20)];
           System.out.println("lenght a"+a.length);
           System.out.println(Arrays.toString(a));
           Integer [] a1= new Integer[r.nextInt(20)];
           System.out.println("lenght a1"+a1.length);
           for(int i=0; i<a1.length; i++ )
               a1[i]=r.nextInt(200);
           System.out.println(Arrays.toString(a1));
           
           Integer[] a3= {
               new Integer(1),
               new Integer(2),
               3          
           };
           Integer[] a4= new Integer [] {
               new Integer(1),
               new Integer(2),
               3          
           };           
           System.out.println(Arrays.toString(a3));
           System.out.println(Arrays.toString(a4));
           
           
    }
    
}

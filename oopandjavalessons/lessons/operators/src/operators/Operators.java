/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.*;

/**
 *
 * @author Андрей
 */
public class Operators {
      static boolean test ( int q)
    {
        System.out.println(q);
        return q>0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Random rand = new Random ();
        int  i,j,k;
        i=rand.nextInt(100)+1;
        System.out.println( "i "+ i);
        j=rand.nextInt(100)+1;
        System.out.println( "j "+ j);
        k=i+j;
        System.out.println( "k "+ k);
        
     i=k%j;
     i=rand.nextInt(100)+1;
        System.out.println( "i=k % j "+ i);
     i=k/j;   
        System.out.println( "i=k / j "+ i);
     double d,s,h;
     d= rand.nextDouble();
     System.out.println( "d "+ d);
     s= rand.nextDouble();
     System.out.println( "s "+ s);
     h=d+s;
     System.out.println( "h "+ h);
     h=h/s;
     System.out.println( "h "+ h);
     i=1;
     System.out.println( "i++ "+ i++);
     System.out.println( "++i "+ ++i);
     System.out.println( "i-- "+ i--);
     System.out.println( "--i "+ --i);
     double r =9; 
     double c = 2*Math.PI*r;
     System.out.println( "circle length"+ c );

     Integer ii=9;
     Integer ii2=9;
     System.out.println( ii.equals(ii2));
     System.out.println( (k>10)&&(k<50));
     System.out.println( test(2)&&test(0) && test(4)  && test (2) );
     i= 0x2f;
     System.out.println( Integer.toOctalString(i));
          i= 022;
     System.out.println( Integer.toOctalString(i));
     char cc=0xfa;
     System.out.println( Integer.toBinaryString(cc));   
     float myfl= 2e-20f;
     System.out.println( myfl);
      i= -1;
     System.out.println( Integer.toBinaryString(i));
     i>>>=10;
     System.out.println( Integer.toBinaryString(i));
    long    l= -1;
     System.out.println( Long.toBinaryString(l));
     l>>>=10;
     System.out.println(  Long.toBinaryString(l)); 
    short    ss= -1;
     System.out.println( Integer.toBinaryString(ss));
     ss>>>=10;
     System.out.println(  Integer.toBinaryString(ss)); 
     byte b=-1;
     System.out.println(  Integer.toBinaryString(b));
     System.out.println(  Integer.toBinaryString(b>>>10));
    i=-2147483648;
    System.out.println( i);
    System.out.println(  Integer.toBinaryString(i));
    System.out.println( ~i);
    System.out.println(  Integer.toBinaryString(~i));  
     i=rand.nextInt(100)+1;
        System.out.println( "i "+ i);
        j=rand.nextInt(100)+1;
        System.out.println( "j "+ j);
        System.out.println( i & j);
        System.out.println( "~j "+  ~j);
        System.out.println( "-j "+ -j);
        System.out.println( "i| j " + ( i |j ));
        System.out.println( "i ^ j " + ( i ^ j ));
        System.out.println(   i + j );
        
        int big =2147483647;
        int biger= big*2;
        System.out.println(  biger);
    }
    
}

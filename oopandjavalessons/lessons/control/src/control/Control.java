/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;

/**
 *
 * @author Андрей
 */
public class Control {

    /**
     * @param args the command line arguments
     */
       static boolean boolcondition ( )
        {
           boolean result = Math.random() <0.99;
            System.out.println("result :"+ result );
           return result;
        }
        static int test (int testval, int target)
        {
            if (testval>target)
                 return 1;
            else if (testval<target)
                 return -1;
            else  return 0;
        }
    public static void main(String[] args) {
        System.out.println(test(12,25));
        while (boolcondition())
        {
         System.out.println("inside while");
        }
         System.out.println(" while end");
          for (int r =1 ; r< 90; r++ )
          {
            double s;
            s = (Math.PI * Math.pow(r,2));
           System.out.println(" circle r:"+r+" circle s:"+s);
          }
            for (char c =0 ; c< 128; c++ )
          {
             if (Character.isLowerCase(c))
           System.out.println(c+" has number"+ ((int)c));
          }
          for (int i =1 ,j=i+10 ; i< 5;i++,j=i*2 )
          {
           System.out.println(i+"i    j"+ j);
          } 
        Random rand = new Random();
        float f [] = new float [10];
        for (int i=0;i<10;++i)
        {
            f[i]= rand.nextFloat();
        }
        for (float x : f)
            System.out.println(x);
        for (char  x : "abcdefghijklmn".toCharArray())
            System.out.println(x);
        for (int i=0;i<100;++i)
        {
            if(i==74)
                break;
            if(i%9!=0)
                continue;
             System.out.println(i);
        }        
        int i=0;
        while (true)
        {
         i++;
         int j=i*27;
            if (j==1269) break;
            if (j%10 !=0) continue;
            System.out.println(i);
        }
        i=0;
        outer:
        for (;true;)
        {
            inner:
             for (;i<10;i++)    
             {
                System.out.println(i);
                 if (i==2)
                 {
                 System.out.println("continue");
                 continue;
                 }
                 if (i==3)
                 {
                 System.out.println("break");
                 i++;
                 break;
                 }
                 if (i==7)
                 {
                 System.out.println("continue outer");
                   i++;
                 continue outer;
                 }
              
                 if (i==8)
                 {
                 System.out.println("break outer");
                 break outer;
                 }
                 for (int k=0; k<5; k++ )
                 {
                   if (k==3)
                   { 
                    System.out.println("continue inner");
                    continue inner;
                   }
                 }
             }
        }
      i=0;
        outer:
        while (true)
        {
            System.out.println("oute cycle");
            inner:
             while (true)    
             {
                 i++;
                System.out.println(i);
                 if (i==1)
                 {
                 System.out.println("continue");
                 continue;
                 }
                 if (i==3)
                 {
                 System.out.println("continue outer");
                 
                 continue outer;
                 }
                 if (i==5)
                 {
                 System.out.println("break");
                   
                 continue outer;
                 }
              
                 if (i==7)
                 {
                 System.out.println("break outer");
                 break outer;
                 }
                
             }
        }       
        
        for (int j=0; j<100 ;j++ )
        {
        int cc = rand.nextInt(26)+ 'a' ;
        System.out.print((char)cc + "-"+ cc+":" );
        switch(cc)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println ("vowel"); break;
            case 'y':
            case 'w':System.out.println ("conditionaly vowel"); break;
            default: System.out.println ("consonant");
            
        
        }
        }
            
        
        
        } 
    }
    


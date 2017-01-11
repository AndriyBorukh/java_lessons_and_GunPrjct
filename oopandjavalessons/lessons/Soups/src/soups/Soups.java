/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soups;

class Soup1
{
 private Soup1(){
     System.out.println(" soup1 created");
 }
 public static Soup1 make ()
 {
     return new Soup1();
 }
 
}

class Soup2
{
 private Soup2(){
     System.out.println(" soup2 created");
 }
 private static Soup2 ps1 =new Soup2();
 public static Soup2 access  ()
 {
     return  ps1;
 }

    public void f()
    {System.out.println(" soup2 created");}
    
}
/**
 *
 * @author Adeptus mechanicus
 */
public class Soups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Soup1 s= new Soup1();
        //Soup2 s= new Soup2();
        Soup1 s1=  Soup1.make();
        Soup2.access().f();
        
    }
    
}

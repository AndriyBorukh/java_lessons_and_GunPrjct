/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicsetter;

/**
 *
 * @author Андрей
 */

class A
{
 private int a;
 public void set(int w)
 {
  a=w;
 }
  public int get()
 {
  return a;
 }
}
class B extends A
{
}
public class Publicsetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // A a= new A();
   // a.set(2);
    B b = new B();
    b.set(2);
        System.out.println(b.get());
    }
    
}

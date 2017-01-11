/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Adeptus mechanicus
 */
public class Sqare extends Shape{

     public void Draw() {
         System.out.println("Sqare.Draw()");
    }
    public void Erase() {
         System.out.println("Sqare.Erase()");
    }
     public  double s()
    {
    return  (Math.pow(5.0, 2.0));
    }
     
}

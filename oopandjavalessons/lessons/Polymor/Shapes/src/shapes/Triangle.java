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
public class Triangle extends Shape{

     public void Draw() {
         System.out.println("Triangle.Draw()");
    }
    public void Erase() {
         System.out.println("Triangle.Erase()");
    }
     public  double s()
    {
    return  (3*5)/2;
    }
     
}
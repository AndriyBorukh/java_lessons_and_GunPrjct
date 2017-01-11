/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurasic;
 class SmallBrain
 {}
final class Dinosaur
{
 int i =7;
 int j=1;
    SmallBrain sb= new SmallBrain();
    void voice ()
    {System.out.println("Garrrrrrr"); }
    
}
/*class  Further extends Dinosaur
{}
*/


/**
 *
 * @author Adeptus mechanicus
 */
public class Jurasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Dinosaur rex= new Dinosaur();
      rex.voice();
      rex.i=0;
      rex.j++;
      
        
    }
    
}

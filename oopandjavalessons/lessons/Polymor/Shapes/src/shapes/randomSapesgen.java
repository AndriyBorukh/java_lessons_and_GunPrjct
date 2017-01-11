
package shapes;

import java.util.Random;

/**
 *
 * @author Adeptus mechanicus
 */
public class randomSapesgen {
 private  Random  rnd =new Random(47);
  public Shape next()
  {
    switch (rnd.nextInt(3))
    { default:
        case 0: return new Circle();
        case 1: return new Sqare();
        case 2: return new Triangle();   
    }
  }
    
  
 
}

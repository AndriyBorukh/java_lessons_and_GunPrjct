
package initialization;

/**
 *
 * @author Андрей
 * 
 */
class rock{
 rock(int i){System.out.println("rock"+i);}
}

public class Initialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
        {
             new rock(i);
        }
        
        // TODO code application logic here
    }
    
}

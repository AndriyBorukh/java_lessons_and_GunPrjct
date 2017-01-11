package chess;
/**
 *
 * @author Андрей
 */
class Game
{
 Game(int i)
 {
     System.out.println("Game()");
 }
}
class BoardGame extends Game
{
  BoardGame(int i)
  {
    super(i);
      System.out.println("BoardGame()");
  }
  
}
public class Chess extends BoardGame{

    public Chess() {
        super(1);
       System.out.println("Chess()");
       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Chess x=new Chess();
    }
    
}

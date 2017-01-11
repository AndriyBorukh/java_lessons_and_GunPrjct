
package transmogrify;

class Actor
{
    public void act() {}
}
class HappyActor extends Actor
{
    public void act() {System.out.println("Happy Actor");}
}

class SadActor extends Actor
{
    public void act() {System.out.println("Sad Actor");}
}

class Stage
{
    private Actor actor= new HappyActor();
    public void change () {actor=new SadActor();}
    public void performPlay(){actor.act();}
}

public class Transmogrify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stage stage =new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
    
}

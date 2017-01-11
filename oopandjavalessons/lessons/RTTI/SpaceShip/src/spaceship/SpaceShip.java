package spaceship;


/**
 *
 * @author Андрей
 */
public class SpaceShip extends  SpaceShipControls {
       private String name;
       public SpaceShip(String name){this.name=name;}
       public String toString(){return name;}
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpaceShip DomStar= new SpaceShip ("Doomstar");
        DomStar.back(212);
        SpaceShipDelegation.main(args);
        
        
    }
    
}

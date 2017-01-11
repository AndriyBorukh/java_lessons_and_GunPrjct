/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship;

/**
 *
 * @author Андрей
 */
public class SpaceShipDelegation {
   private String name;
   private SpaceShipControls controls = new SpaceShipControls();
   public SpaceShipDelegation(String name) {this.name=name;}
  
   //Delegated methods:
    public void back (int velocity){controls.back(velocity); }
    public void down (int velocity){controls.down(velocity); }
    public void forward (int velocity){controls.forward(velocity); }
    public void left (int velocity){controls.left(velocity); }
    public void right (int velocity){controls.right(velocity); }
    public void warpBoost (){controls.warpBoost(); }
    public void up (int velocity){controls.up(velocity); }
      public static void main(String[] args) {
        SpaceShipDelegation Doomstar= new SpaceShipDelegation("Doomstar");
        Doomstar.forward(100);
    }
     
}

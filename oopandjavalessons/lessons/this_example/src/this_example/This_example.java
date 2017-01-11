/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this_example;

/**
 *
 * @author Андрей
 */
class Human 
  {
       Human (int height, int weight, String skincolor)
       {
        this.height=height;
        this.weight=weight;
        this.skincolor=skincolor;
       }      
   
      Human clonehuman ()
      { 
       return this;
      }   
      int getheight() 
      {
      return this.height;
      }
      int getweight() 
      {
      return this.weight;
      }
      String getskin() 
      {
      return this.skincolor;
      }
      protected  int height;
      protected  int weight;
      protected  String skincolor;
           
    
  }     

public class This_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human man = new Human (200, 90, "white");
        Human doppler = man.clonehuman();
        System.out.println("height:"+doppler.getheight()+"weight:"+doppler.getweight()+"skin:"+doppler.getskin());
    }
    
}

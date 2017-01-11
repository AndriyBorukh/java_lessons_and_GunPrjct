
package car;
 class Engine
 {
  public void start ()
  {
      System.out.println("Engine.start()");
  }
  public void rev ()
  {
      System.out.println("Engine.rev()");
  }          
    public void stop ()
  {
      System.out.println("Engine.stop()");
  }        
 }
 class Wheel
 {
  public void inflate (int psi)
  {
      System.out.println("car.Wheel.inflate(int)"+psi);
  }
 }
class Window
 {
  public void rollup ()
  {
      System.out.println("car.Window.rollup()");
  }
    public void rolldown ()
  {
      System.out.println("car.Window.rolldown()");
  }
 }

class Door
 {
    Window win = new Window();
  public void open ()
  {
      System.out.println("car.Door.open()");;
  }
    public void close ()
  {
      System.out.println("car.Door.close()");
  }
 }


public class Car {
 public Engine engine = new Engine();
 public Wheel [] wheels = new Wheel[4];
 public Door leftforwarddoor = new Door();
  public Door rightforwarddoor = new Door();
   public Door leftbackdoor = new Door();
    public Door rightbackdoor = new Door();
    /**
     * @param args the command line arguments
     */
    public Car()
    {
      for (int i =0;i<4 ;++i)
          wheels[i]=new Wheel();
      
    }
    public static void main(String[] args) {
     Car zaporogec =new Car();
     zaporogec.leftbackdoor.win.rollup();
     zaporogec.wheels[0].inflate(45);  
    }
    
}

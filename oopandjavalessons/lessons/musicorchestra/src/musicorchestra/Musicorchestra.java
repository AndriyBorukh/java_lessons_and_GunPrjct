
package musicorchestra;

class Wind extends Instrument {
 public  void Play(Note n)
 {
     System.out.println("Wind.Play()"+n);
 }
 public String what (){ return "Wind";}
 public  void Adjust()
 {}
}

class Perrcussion extends Instrument {
 public  void Play(Note n)
 {
     System.out.println("Perrcussion.Play()"+n);
 }
 public String what (){ return "Perrcussion";}
 public  void Adjust()
 {}
}

class Stringed extends Instrument {
 public  void Play(Note n)
 {
     System.out.println("Stringed.Play()"+n);
 }
 public String what (){ return "Stringed";}
 public  void Adjust()
 {}
}

class Woodwind extends Wind {
 public  void Play(Note n)
 {
     System.out.println("Woodwind.Play()"+n);
 }
 public String what (){ return "Woodwind";}
 
 {}
}
class Brass extends Wind {
 public  void Play(Note n)
 {
     System.out.println("Brass.Play()"+n);
 }
 public  void Adjust()
 {
 System.out.println("Brass.Adjust()");
 }
 
 
}

/**
 *
 * @author Adeptus Mechanicus
 */
public class Musicorchestra {

  static void  tune (Instrument i)
  {
   i.Play(Note.UT);
   
  }
  
    static void  tuneall (Instrument [] m)
  {
      for ( Instrument i:m)
        i.Play(Note.UT);
   
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Instrument [] orchestra={new Wind(), new Stringed(),new Perrcussion(),new Brass()
             ,new Woodwind()};
           tuneall(orchestra);

    }
    
}


package musicwithinterface;
import musicorchestra.Note;

interface Instrument {
  int i=5;
 public  void Play(Note n);

 public  void Adjust();
  
}


class Wind implements Instrument {
 public  void Play(Note n)
 {
     System.out.println(this+".Play()"+n);
 }
 public String toString (){ return "Wind";}
 public  void Adjust()
 { System.out.println(this+".Adjust()");}
}

class Perrcussion implements Instrument {
 public  void Play(Note n)
 {
     System.out.println(this+".Play()"+n);
 }
 public String toString (){ return "Perrcussion";}
 public  void Adjust()
 { System.out.println(this+".Adjust()");}
}

class Stringed implements Instrument {
 public  void Play(Note n)
 {
     System.out.println(this+".Play()"+n);
 }
 public String toString (){ return "Stringed";}
 public  void Adjust()
 { System.out.println(this+".Adjust()");}
}

class Woodwind extends Wind {
  public String toString (){ return "Woodwind";}
 }
class Brass extends Wind {
  public String toString (){ return "Brass";}
 
 
}


/**
 *
 * @author Adeptus Mechanicus
 */
public class Musicwithinterface {

    static void  tune (Instrument i)
  {
   i.Play(Note.UT);
   
  }
  
    static void  tuneall (Instrument [] m)
  {
      for ( Instrument i:m)
          tune(i);
   
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

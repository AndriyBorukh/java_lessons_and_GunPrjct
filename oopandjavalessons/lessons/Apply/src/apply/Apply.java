
package apply;

import java.util.Arrays;
import filters.*;
        
/*class Processor {
 public String name (){ return getClass().getSimpleName();}
 Object Process(Object input) { return input;}
}  */

interface Processor {
 public String name ();
 Object Process(Object input) ;
} 

abstract class StringProcessor implements Processor {
 public String name (){ return getClass().getSimpleName();}
 public abstract String Process(Object input);

} 
class Upcase extends StringProcessor {
 public String Process(Object input) 
 { return ((String)input).toUpperCase();}
}
class Downcase extends StringProcessor {
 public String Process(Object input) 
 { return ((String)input).toLowerCase();}
}

class Splitter extends StringProcessor {
 public String Process(Object input) 
 { return Arrays.toString(((String)input).split(" "));}
}

 class FilterAdapter implements Processor {
     filter f;

    public FilterAdapter(filter fil) {
        this.f=fil;
        
    }
     
 public String name (){ return f.name();}
 
 public Waveform Process(Object input)
 {
 return f.Process( (Waveform)input);
 }

} 



public class Apply {
   public static void process (Processor p,Object s)
   {
       System.out.println("Using Processor"+p.name());
       System.out.println(p.Process(s));
   }
    
    public static String s="This is experimental string.";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        process(new  Upcase(), s);
        process(new  Downcase(), s);
        process(new  Splitter(), s);
        Waveform w= new Waveform();
        process(new  FilterAdapter(new HighPass(1.0)), w);
        process(new  FilterAdapter(new LowPass(2.0)), w);
        process(new  FilterAdapter(new bandPass(3.0,4.0)), w);
    }
    
}

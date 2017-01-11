
package music;

class Stringed  extends Instrument
{
  public void Play (Note n)
    {
        System.out.println("Stringed.Play()"+n);
    }
}

class Brass  extends Instrument
{
  public void Play (Note n)
    {
        System.out.println("brass.Play()"+n);
    }
}

/**
 *
 * @author Adeptus mechanicus
 */
public class Music22 {
  public static void tune (Wind i)
{
i.Play(Note.UT);
}
  public static void tune (Stringed i)
{
i.Play(Note.UT);
}    
  public static void tune (Brass i)
{
i.Play(Note.UT);
}
    public static void main(String[] args) {
        
    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Brass frenchHorn =  new Brass();
    
    tune(flute);
    tune(violin);
    tune (frenchHorn);
    
    }
}
 
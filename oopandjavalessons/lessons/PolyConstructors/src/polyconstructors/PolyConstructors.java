
package polyconstructors;

class Glyph
{
 void Draw ()
 {
     System.out.println("Glyph.Draw()");
 }

    public Glyph() {
        System.out.println("Glyph before Draw()");
        Draw();
        System.out.println("Glyph after Draw()");
    }
 
}

class  RoundGlyph extends Glyph
{
    private int radius=1;
    
 void Draw ()
 {
     System.out.println("RoundGlyph.Draw() ; r="+radius);
 }

    public RoundGlyph(int r) {
        radius=r;
        System.out.println("RoundGlyph(); r="+r);
        Draw();
        }
}

public class PolyConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
    
}

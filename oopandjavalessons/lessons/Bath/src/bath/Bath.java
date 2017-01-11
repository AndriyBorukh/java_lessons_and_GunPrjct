/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bath;

class Soap
{
 private String s;
 Soap()
 {
     System.out.println("soap()");
      s="constructor ok";
 }
 public String toString ()
 { return s; }
}
/**
 *
 * @author Андрей
 */
public class Bath {
  private String s1="Luky",s2="Luky",s3,s4 ;
   private Soap castille;
   private int i;
   private  float toy;
    public Bath()
    {
        System.out.println("inside Bath()");
        s3="joyful";
        toy=3.14f;
        castille= new Soap();
    }
    {i=47;}
    public String toString()
    {
     if (s4==null)
         s4="joyful";
        return  "s1="+s1+"\n"+
                "s2="+s2+"\n"+
                "s3="+s3+"\n"+
                "s4="+s4+"\n"+
                "i="+i+"\n"+
                "toy="+toy+"\n"+
                "castille="+castille+"\n";    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
    
}

package constructorwiththis;

public class Flower {
 int PetalCount =0;
 String s= "Initial value";

     Flower( int petals)
    {
        PetalCount=petals;
        System.out.println("constructor with int parameter Petals  "+PetalCount);
    }
     
   Flower (String ss)
   {
       s=ss;
    System.out.println("constructor with String parameter s  "+s);
   }
      Flower (String s,int petals)
   {
       this(petals);
       this.s=s;
    System.out.println("constructor with String and int parameters  "+s +petals );
   }
     Flower ()
   {
    this("hi",47);
    System.out.println("constructor without parameters  "); 
   }    
     
  void printpetalcount()
  {
      System.out.println("petalcount="+ PetalCount+ "s="+s);
  }
}

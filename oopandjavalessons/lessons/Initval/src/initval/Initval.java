package initval;


class InitialValues{
boolean bool;
char c;
byte b;
short s;
int i;
long l;
float f;
double d;

InitialValues reference;
void printinitialvalues ()
{
  System.out.println("boolean "+bool);
  System.out.println("char "+c);
  System.out.println("byte "+b);
  System.out.println("short "+s);
  System.out.println("int "+i);
  System.out.println("long "+l);
  System.out.println("float "+f);
  System.out.println("double "+d);
  System.out.println("reference "+reference);
}
}
class InitialValues2{
boolean bool=true;
char c='x';
byte b=4;
short s=2;
int i=1;
long l=23;
float f= 3.5f;
double d=4.9;


void printinitialvalues ()
{
  System.out.println("boolean "+bool);
  System.out.println("char "+c);
  System.out.println("byte "+b);
  System.out.println("short "+s);
  System.out.println("int "+i);
  System.out.println("long "+l);
  System.out.println("float "+f);
  System.out.println("double "+d);
  
}
}
  
class Window 
{
 Window (int marker)
 {
     System.out.println("Window ("+marker+")");
 }
}

class House
{    Window w1= new Window(1);
    House()
    { 
      System.out.println("house() ");
      w3= new Window(33);
    }
 Window w2= new Window(2);
 void f(){System.out.println("f() ");}
 Window w3= new Window(3);
    
}

public class Initval {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    InitialValues iv = new InitialValues();
    //iv.printinitialvalues();
    InitialValues2 iv2 = new InitialValues2();
    iv2.printinitialvalues();
    House h=new House();
    h.f();
    }
}

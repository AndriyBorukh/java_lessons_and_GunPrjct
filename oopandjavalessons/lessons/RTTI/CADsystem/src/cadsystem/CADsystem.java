package cadsystem;
class Shape
{
 public Shape(int i) {
     System.out.println("Shape()");
  } 
 void dispose ()
 {System.out.println(" dispose Shape"); }
}

class Circle extends Shape
{
 public Circle(int i) {
     super(i);
     System.out.println("Circle()");
  } 
 void dispose ()
 {System.out.println(" dispose Circle"); 
  super.dispose();
 }
}

class Triangle extends Shape
{
 public Triangle(int i) {
     super(i);
     System.out.println("Triangle()");
  } 
 void dispose ()
 {System.out.println(" dispose Triangle"); 
  super.dispose();
 }
}

class Line extends Shape
{
    private int start,end;
 public Line(int start, int end) {
     super(start);
     this.start=start;
     this.end=end;
     System.out.println("line"+start+","+end);
  } 
 void dispose ()
 {System.out.println(" dispose line"+start+","+end);
 
  super.dispose();
 }
}

public class CADsystem extends Shape
{ 
    private Circle c;
    private Triangle t;
    private Line [] lines = new Line[3];
    
    public CADsystem(int i) {
        super(i+1);
        for (int j=0;j<lines.length;j++)
            lines[j]= new Line(j, j*j);
        c=new Circle(1);
        t= new Triangle(1);
        System.out.print("combined constructor");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CADsystem x = new CADsystem(43);
        try{}
        finally{
        x.dispose();
        }
    }

    
    
}

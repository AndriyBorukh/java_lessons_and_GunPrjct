package varargs;

/**
 *
 * @author Adeptus mechanicus
 */
class A{int i;}
public class VarArgs {

    /**
     * @param args the command line arguments
     */
    static void printArray(Object[] aargs)
    {
     for(Object obj : aargs)
            System.out.print(obj+" ");
     System.out.println();
    }
    static void printArray1(Object... aargs)
    {
     for(Object obj : aargs)
            System.out.print(obj+" ");
     System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{new Float(3.14),new Integer(33), new Double(11.11)});
        printArray(new Object[]{"text1","text2",23});
        printArray(new Object[]{new A(),new A(), new A()});
        printArray1(new Object[]{new Float(3.14),new Integer(33), new Double(11.11)});
        printArray1(new Object[]{"text1","text2",23});
        printArray1(new Object[]{new A(),new A(), new A()});
        printArray1( (Object[]) new Integer[]{2,3,6});        
// TODO code application logic here
    }
    
}

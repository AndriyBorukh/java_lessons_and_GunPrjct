package terminationcondition;
 class Book
    {
     boolean checkedOut =false;
     Book (boolean checkOut)
     {
      checkedOut=checkOut;
      
     }
     void checkIn ()
     {
      checkedOut=false;
     }
     public void finalize()
     {
      if (checkedOut)
             System.out.println("error checkedout");
     }
    }

public class Terminationcondition {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
         Book novel = new Book(true);
         novel.checkIn();
          new Book (true);
          System.gc();
        // TODO code application logic here
    }
    
}

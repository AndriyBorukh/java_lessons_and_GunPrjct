package java ;
import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		String command="something"; 
		calendar newcalendar = new calendar();
		while (!(command.contentEquals("end")))
		{	
		 System.out.println("do you want to see current month type yes or no, or end for exit  ");
		 Scanner in = new Scanner(System.in);
		 command= in.next();
		 if (command.contentEquals("yes"))
		 {
			 System.out.println(" ПН  ВТ  СР  ЧТ  ПТ  СБ  НД"); 
			 YearMonth thisyearmonth =YearMonth.now(); 
			 int year = thisyearmonth.getYear();
			 int month = thisyearmonth.getMonthValue();
			 newcalendar.ShowCalendar(year, month);
			 System.out.println(' ');
		 }
		 
		 if (command.contentEquals("no"))
		 {	 
		  System.out.println("enter year and month");
          int year = in.nextInt();
          String monthname = in.next();
          monthname=monthname.toUpperCase();
          Month enteredmonth = Month.valueOf(monthname);
          int month = enteredmonth.getValue() ;
		  System.out.println(" ПН  ВТ  СР  ЧТ  ПТ  СБ  НД");  
		  newcalendar.ShowCalendar(year, month);
		 }
		}
	
	}
}
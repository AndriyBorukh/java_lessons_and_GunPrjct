package prjct111;
import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class calendar  {
	 int daysinweek;
	 public calendar() {
		
		 daysinweek=7;
	}
 /*   static LocalDate now  ()
    {    LocalDate datenow=LocalDate.now();
    	return datenow;
    }*/
	public   void ShowCalendar(int year,int month)
	{	
		
		YearMonth ym=YearMonth.of(year, month);
	    int numberofday=1;
	    int daycount =1;
  
	//    LocalDate nw=now(); 
	    LocalDate dat= LocalDate.of(ym.getYear(),ym.getMonth(),1);
   
	    while ( (dat.getDayOfWeek() !=DayOfWeek.of(numberofday)  ))
	    		{
	    	      System.out.print(' '); 
	    	      System.out.print(' ');
			      System.out.print(' ');
			      System.out.print(' ');
			  	  numberofday++;
	    		}   
		  while (daycount<=ym.lengthOfMonth()) 
		  {
			  if (numberofday<=daysinweek)
			  {  
				  System.out.print(' ');
				  if (daycount<10)
			       System.out.print(' '); 
				  System.out.print(daycount);
				  System.out.print(' ');
				  numberofday++;
			  }
			  if (numberofday>daysinweek)
			  {
				  System.out.println (' ');
				  numberofday=1;
			  }
			  daycount++;
		  }	
		}
	}
	
	
	
	


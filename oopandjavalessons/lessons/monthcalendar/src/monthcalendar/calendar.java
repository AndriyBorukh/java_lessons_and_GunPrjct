package monthcalendar;
/**
 *
 * @author Андрей
 */
import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class calendar  {
 static final int daysinweek=7;
 static final int weekdays=5;
 public calendar() 
 {
 }
 static LocalDate now  ()
    {    LocalDate datenow=LocalDate.now();
    	return datenow;
    }
public   void ShowCalendar(int year,int month)
 {
  printer Printer = new printer();   
  YearMonth calendaryearmonth=YearMonth.of(year, month);
  int numberofday=1;
  int daycount =1;
     LocalDate today =now();
     
  LocalDate date= LocalDate.of(calendaryearmonth.getYear(),calendaryearmonth.getMonth(),1);
  while ( (date.getDayOfWeek() !=DayOfWeek.of(numberofday)  ))
    {
      System.out.print(' '); 
      System.out.print(' ');
      System.out.print(' ');
      System.out.print(' ');
      numberofday++;
    }   
  while (daycount<=calendaryearmonth.lengthOfMonth()) 
    {
     if (numberofday<=daysinweek)
      {  
        System.out.print(' ');
	if (daycount<10)
	  System.out.print(' ');
        if (numberofday>weekdays )
        { System.out.print("\033[31m"+ daycount+ "\u001B[0m" );}
	 else
            if ( (today.getYear()==date.getYear())&&(today.getMonthValue()==date.getMonthValue())&&(today.getDayOfMonth()==daycount) )
            {System.out.print( "\033[32m"+ daycount+ "\u001B[0m"  );}
             else
               {System.out.print( daycount );} 
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

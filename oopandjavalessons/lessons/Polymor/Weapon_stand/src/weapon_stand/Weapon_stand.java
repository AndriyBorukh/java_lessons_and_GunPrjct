
package weapon_stand;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Adeptus mechanicus
 */

class Printer
 {
   public void print( Object str )
   {
       System.out.print(str);
   }
   public void println( Object str )
   {
       System.out.println(str);
   }    
 }


abstract class Gun
{	
 abstract  int Shootonce();
 abstract  int Shoottriple();
 abstract  int Shootfull();
 public double getfirerate()
 {
  return  firerate;
 }
 public String getname()
 {
  return  name;
 }
protected String name;
protected int once;
protected int triple;
protected int full;
protected double firerate;
public static final int FM_NONE =0;
public static final int FM_ONCE =1;
public static final int FM_TRIPLE =3;
public static final int FM_FULLAUTOMATICFIRE =30;
public static final int VARIANT1 =1;
public static final int VARIANT2 =2;
public static final int VARIANT3 =3;
   
}

class Akm extends Gun
{
	Akm ()
	{
	 name = "AKM";
	 once=FM_ONCE;
	 triple=FM_TRIPLE;
	 full=FM_FULLAUTOMATICFIRE;
	 firerate=1.67;
	}
 	int Shootonce()
	{ 
	  firerate=0.67;
	  return once;
	}
 	int Shoottriple()
	{
	 firerate=1.67;
	 return triple ;
	}
 	int Shootfull()
	{   
	 firerate=1.67;
	 return full;
	}
}

class M16A4 extends Gun
{
	M16A4 ()
	{
	 name = "M16A4";
	 once=FM_ONCE;
	 triple=FM_TRIPLE;
	 full=FM_FULLAUTOMATICFIRE;
	 firerate=13.33;
	}
 	int Shootonce()
	{ 
	 return once;
	}
 	int Shoottriple()
	{
	 return triple ;
	}
 	int Shootfull()
	{   
	 return full;
	}
}

class Gatlinggun extends Gun
{
 Gatlinggun ()
  {
   name = "Gatling gun";
   once=FM_NONE;
   triple=FM_TRIPLE;
   full=FM_FULLAUTOMATICFIRE;
   firerate=50;
  }
 int Shootonce()
  {
   return once;
  }
 int Shoottriple()
  {
   return triple ;
  }
 int Shootfull()
  {
   return full;
  }
}

class  Autocannon2a72 extends Gun
{
 Autocannon2a72 ()
  {
   name = "2a72";
   once=FM_NONE;
   triple=FM_TRIPLE;
   full=FM_FULLAUTOMATICFIRE;
   firerate=5.5;
  }
 int Shootonce()
  {
   return once;
  }
 int Shoottriple()
  {
   return triple ;
  }
 int Shootfull()
  {
   return full;
  }
}

class  Flak30 extends Gun
{
 Flak30 ()
  {
   name = "2cmflak30";
   once=FM_NONE;
   triple=FM_TRIPLE;
   full=FM_FULLAUTOMATICFIRE;
   firerate=4.67;
  }
 int Shootonce()
  {
   return once;
  }
 int Shoottriple()
  {
   return triple ;
  }
 int Shootfull()
  {
  return full;
  }
}

class  Flak38 extends Gun
{
 Flak38 ()
  {
    name = "2cmflak38";
    once=FM_NONE;
    triple=FM_TRIPLE;
    full=FM_FULLAUTOMATICFIRE;
    firerate=7.5;
  }
 int Shootonce()
  {
    return once;
  }
 int Shoottriple()
   {
     return triple ;
   }
 int Shootfull()
  {
   return full;
  }
}

 class AtTiny
 {
     Printer prntr = new Printer();
  public void setrs232 (int baudrate, short  databits , short stops   )
    {
     this.baudrate= baudrate;
     this.databits= databits;
     this.stops= stops;
    }
   public void impulseGen (  )
     {   
      if (this.firemode==Gun.FM_NONE)
        prntr.println("this mode is no supported by this gun ");
      else
        {
         int shoots= this.firemode; 
	 double timerrate= 1000/this.firerate;
            
	for (int iterator=0; iterator < this.cycles; ++iterator)
	  {
	   for ( ; shoots >0 ; --shoots)
	    {
	      try {
                   Thread.sleep((long) timerrate);
               } catch (InterruptedException ex) {
                   Logger.getLogger(AtTiny.class.getName()).log(Level.SEVERE, null, ex);
               }
	     prntr.print(" beep  impulse len ");
             prntr.print((timerrate/3));
             prntr.println("ms \n");
	    }
	  }
        }
     }
 public void rs232data (int firemode, int  cycles , double firerate   )
  {
   this.firemode= firemode;
   this.cycles=cycles;
   this.firerate=firerate;
   prntr.println("data rec ok");
   prntr.println("generation start:");  
   this.impulseGen();
  }       
 int baudrate;
 short databits;
 short stops;
 int firemode;
 int  cycles ;
 double firerate ;
}

class Rschannel 
{
  Printer prntr = new Printer();
  public void senddata (int firemode, int  cycles , float firerate , AtTiny  attiny13  )
    {
     if ( (this.baudrate ==attiny13.baudrate )&& (this.databits ==attiny13.databits )&& (this.stops ==attiny13.stops ) )
      {
	prntr.println("connecting ok") ;
	attiny13.rs232data (firemode, cycles , firerate);
      }
    }
  public void senddata (int firemode, Gun  somegun, int  cycles ,  AtTiny  attiny13 )
    {
     if ((this.baudrate==attiny13.baudrate)&&(this.databits==attiny13.databits)&&(this.stops==attiny13.stops))
      {
       prntr.println("connecting ok") ;
       if (firemode==Gun.VARIANT1)
        attiny13.rs232data (somegun.Shootonce(), cycles ,  somegun.getfirerate());
       if (firemode==Gun.VARIANT2)
	attiny13.rs232data (somegun.Shoottriple(), cycles , somegun.getfirerate());
       if (firemode==Gun.VARIANT3)
	attiny13.rs232data (somegun.Shootfull(), cycles , somegun.getfirerate());
     }
}      
 public void setrs (int baudrate, short  databits , short stops   )
   {
    this.baudrate= baudrate;
    this.databits= databits;
    this.stops= stops;
   }
  public void dispose ( )
   {
    prntr.print("closing rs232 channel ");
   }
	int baudrate;
	short databits;
	short stops;
}

class Gunfabric
{
    Gun MakeGun ( int selector )
   {
    if (selector==6)
      return new M16A4();
    if (selector==5)
      return new Akm();
    if (selector==4)
      return new Flak38();
    if (selector==3)
      return new Flak30 ();
    if (selector==2)
      return new Autocannon2a72();
    if (selector==1)
      return new Gatlinggun ();
    return null;
   }	
}


public class Weapon_stand {
    /**
     * @param args the command line arguments
     */
     public static Printer prntr= new Printer();
    public static void main(String[] args) {
      // тут маэ бути цикл ы захист выд ынших цифр
      Scanner in = new Scanner(System.in);
      char slctr;
      Gunfabric gunworkshop= new Gunfabric();
      do
      {     
       	int gunselector;
	prntr.println("Choose type of gun :");
        prntr.println(" 1 gatling gun;");
        prntr.println(" 2  autocannon 2a72;");
        prntr.println(" 3 Flak 30;");
        prntr.println(" 4 Flak 38;");
        prntr.println(" 5 AKM;");
        prntr.println(" 6 M16A4;");
        gunselector = in.nextInt();
        if ((gunselector<=6)&&(gunselector>=1))
        {
	   Gun gun=   gunworkshop.MakeGun(gunselector);
	 prntr.print ("Choosen gun : ");
         prntr.println (gun.getname()); 
	 AtTiny  attiny13= new AtTiny()  ;
	 Rschannel com= new Rschannel() ;
	 int firemode;
	 com.setrs(9600,(short)8,(short)2);
	 attiny13.setrs232(9600,(short)8,(short)2);
	 AtTiny  atp= attiny13;
	 prntr.println("Choose firemode:");
         prntr.println(" 1 once;");
         prntr.println(" 2 triple;");
         prntr.println(" 3 30 bulets;");
         firemode=in.nextInt();
         if ((firemode<=3)&&(firemode>=1))
         {
	  com.senddata ( firemode,gun,1 , atp);
          com.dispose();
         }
          else
         prntr.println(" Input error!");
        }
        else
         prntr.println(" Input error!");
         prntr.println("Repeat immitation:");
         prntr.println(" 1 for yes;");
         prntr.println("  other for no;");
         slctr =(char) in.nextByte();
       } while (slctr==1);
      
    }
    
}

#include <iostream>
#include "Windows.h"
#include <time.h>
#include <string>

using namespace std;
#define FM_NONE 0
#define FM_ONCE 1
#define FM_TRIPLE 3
#define FM_FULLAUTOMATICFIRE 30
#define VARIANT1 1
#define VARIANT2 2
#define VARIANT3 3

struct  gun
{
	
	virtual ~gun(){}	
 virtual	int Shootonce()=0;
 virtual	int Shoottriple()=0;
 virtual	int Shootfull()=0;

 double getfirerate()
 {
 return  firerate;
 }
    string getname()
 {
 return  name;
 }
protected:
	string name;
	int once;
	int triple;
	int full;
	double firerate;
    
};

struct  Gatlinggun : gun
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
};

struct  autocannon2a72 : gun
{
	autocannon2a72 ()
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
};

struct  flak30 : gun
{
	flak30 ()
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
};

struct  flak38 : gun
{
	flak38 ()
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
};


struct  akm : gun
{
	akm ()
	{
		name = "akm";
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
};

struct  M16A4 : gun
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
};



struct AtTiny
{
	void setrs232 (int baudrate, short  databits , short stops   );
	void impulseGen (  );
	void rs232data (int firemode, int  cycles , double firerate   );
	int baudrate;
	short databits;
	short stops;
	int firemode;
	int  cycles ;
	double firerate ;
};

void AtTiny::setrs232 (int baudrate, short  databits , short stops   )
{
 this->baudrate= baudrate;
 this->databits= databits;
 this->stops= stops;
}

void AtTiny::rs232data (int firemode, int  cycles , double firerate   )
{
	this->firemode= firemode;
	
	this->cycles=cycles;
	this->firerate=firerate;
	cout<< "data rec ok\n generation start: \n";
	
	   
	this->impulseGen();
}

void  AtTiny::impulseGen (  )
{   
	if (this->firemode==FM_NONE)
		cout<< "this mode is no supported by this gun \n";
         else
           {
             int shoots= this->firemode; 
	         double timerrate= 1000/this->firerate;
             for (int iterator=0; iterator < this->cycles; ++iterator)
	          {
	           for ( ; shoots >0 ; --shoots)
	            {
	 
		        Sleep (timerrate);
	             cout<<shoots<< " beep  impulse len "<<(timerrate/3.0)<< "ms \n";
	            }
	          }
            }
}

struct rschannel 
{
	void senddata (int firemode, int  cycles , double firerate , AtTiny * attiny13  );
	void senddata (int firemode,gun * somegun, int  cycles ,  AtTiny * attiny13  );
	void setrs (int baudrate, short  databits , short stops   );
	int baudrate;
	short databits;
	short stops;
	~rschannel()
	{
	  cout<< "connection end \n";
	}
};
void rschannel::setrs (int baudrate, short  databits , short stops   )
{
 this->baudrate= baudrate;
 this->databits= databits;
 this->stops= stops;
}
void rschannel::senddata (int firemode, int  cycles , double firerate, AtTiny * attiny13   )
{
	if ( (this->baudrate ==attiny13->baudrate )&& (this->databits ==attiny13->databits )&& (this->stops ==attiny13->stops ) )
	  {
		   cout<< "connecting ok \n";
		  attiny13->rs232data (firemode, cycles , firerate);
	   }
}

void rschannel::senddata (int firemode,gun * somegun, int  cycles , AtTiny * attiny13   )
{
	if ( (this->baudrate ==attiny13->baudrate )&& (this->databits ==attiny13->databits )&& (this->stops ==attiny13->stops ) )
	  {
		   cout<< "connecting ok \n";
		    
		   if (firemode==VARIANT1)
			   attiny13->rs232data (somegun->Shootonce(), cycles , somegun->getfirerate());
		   if (firemode==VARIANT2)
			   attiny13->rs232data (somegun->Shoottriple(), cycles , somegun->getfirerate());
		   if (firemode==VARIANT3)
			   attiny13->rs232data (somegun->Shootfull(), cycles , somegun->getfirerate());
	   }
}

/* VOID CALLBACK TimerProc(HWND hwnd,UINT uMsg,UINT_PTR idEvent,DWORD dwTime)
{
    std::cout << "test\n";
}
*/

struct Gunfabric
{
public:
 gun * MakeGun ( int selector )
   {  
    if (selector==6)
		return new M16A4();
	if (selector==5)
      return new akm();
    if (selector==4)
      return new flak38();
    if (selector==3)
      return new flak30 ();
    if (selector==2)
      return new autocannon2a72();
    if (selector==1)
      return  new Gatlinggun ();
    
   }	
};

struct Gunplatform 
{
	
	Gunplatform ( int selector )
	  {
		   SmithnWesson= new Gunfabric() ;
		mountedgun= SmithnWesson->MakeGun (  selector );
	  }
		
	string getGunName()
	{
		return mountedgun->getname();
	}
	gun * thisgun()
	{
	 return mountedgun;
	}   
	   
	~Gunplatform (  )
	  {
		  delete  mountedgun;
		  delete SmithnWesson;
	  }
	gun * mountedgun;
	Gunfabric * SmithnWesson;
};


int main() {
	int gunselector;
    int firemode;
	int slctr;
   do
   {
	std::cout<<"Choose type of gun :\n 1 gatling gun;\n 2  autocannon 2a72;\n 3 Flak 30;\n 4 Flak 38;\n 5 akm;\n 6 M16A4;\n" ;
	std::cin>> gunselector;
	 if ((gunselector<=6)&&(gunselector>=1))
	 {
	  Gunplatform gunPlatform (gunselector);
	  std::cout<<"Choosen gun : " << gunPlatform.getGunName();
      AtTiny  attiny13;
      rschannel com;
	  com.setrs(9600,8,2);
	  attiny13.setrs232(9600,8,2);
	  AtTiny * atp=& attiny13;
	  std::cout<<"Choose firemode:\n 1 once;\n 2 triple;\n 3 30 bulets; " ;
	  std::cin>> firemode;
	  if ((firemode<=3)&&(firemode>=1))
	   {
		com.senddata ( firemode,gunPlatform.thisgun(),1 , atp);
	   }
	  	 else
         std::cout<<" Input error! \n";
	 }
	 else
     std::cout<<" Input error! \n";
	 std::cout<<"Repeat immitation:\n 1 for yes;\n other for no;\n";
       std::cin>>  slctr ;
   } while (slctr==1);

	 std::cout<< "end \n";
	 
	 return 0;
}



//	int nTimerID;
/*	nTimerID= SetTimer (NULL,0,1000,(TIMERPROC)TimerProc);
	MSG msg;
	
/*	while (GetMessage(&msg,0,0,0))
	{
		DispatchMessage(&msg);

	}*/
//	KillTimer (NULL,nTimerID); 
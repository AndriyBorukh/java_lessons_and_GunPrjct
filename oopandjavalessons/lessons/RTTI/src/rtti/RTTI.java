/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtti;
class Usefull
{
void g(){System.out.println("g()");}
void f(){System.out.println("f()");}
}
class  MoreUsefull  extends Usefull
{
void g(){System.out.println("mg()");}
void f(){System.out.println("mf()");}
void h(){System.out.println("mh()");}
void j(){System.out.println("mj()");}
void k(){System.out.println("mk()");}
void l(){System.out.println("ml()");}
}
/**
 *
 * @author Adeptus Mechanicus
 */
public class RTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usefull [] hh={new Usefull(),new MoreUsefull()};
        hh[0].f();
        hh[1].g();
       ((MoreUsefull)hh[1]).j();
     //  ((MoreUsefull)hh[0]).j();
        
    }
    
}

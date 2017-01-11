/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import jssc.SerialPortList;
/**
 *
 * @author Adeptus mechanicus
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String [] Portnames =SerialPortList.getPortNames();
    for (int i=0; i<Portnames.length; i++ )
            System.out.println (Portnames[i] );  
// TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newarray;

/**
 *
 * @author Андрей
 */
public class Newarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a1={2,3,4,5,6,7,8};
        int [] a2=a1;
        for (int i=0; i<a2.length;i++)
            a2[i]++;
        for (int i=0; i<a1.length;i++)
            System.out.println(a1[i]);
    }
    
}

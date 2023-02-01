/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Jonathan
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        int cc = 1;
        while (cc<=10) {
            System.out.println("Cambalhota " + cc);
            cc++; 
        }*/
        
        /*
        int cc = 0;
        while (cc<10) {
            cc++; 
            if (cc == 5 || cc == 7 ) {
                continue;
            }
            System.out.println("Cambalhota " + cc);      
        } */  
        
        int cc = 0;
        while (cc<10) {
            cc++; 
            if (cc == 2 || cc == 4 ) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);      
        }        
    }    
}

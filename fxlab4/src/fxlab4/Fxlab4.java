/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxlab4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long
 */
public class Fxlab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoNguyenTo s = new SoNguyenTo();        
        Runnable r1 = () -> {
            synchronized(s){
                while(true){
                    System.out.println(s.nextSoNguyenTo());
                    System.out.println(s.binhPhuongSoNguyenTo());
                }
            }
        };
        
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        
    }
    
    
}

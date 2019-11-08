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
                    
                    System.out.println(Thread.currentThread().getName()+":   "+s.nextSoNguyenTo());
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Fxlab4.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        s.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Fxlab4.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    s.notify();
                }
            }    
        };
        Runnable r2 = () -> {            
            synchronized(s){
                while(true){                    
                    System.out.println(Thread.currentThread().getName()+":   "+s.binhPhuongSoNguyenTo());                    
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Fxlab4.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                    s.notify();                    
                    try {
                        s.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Fxlab4.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }    
        };
        
        Thread t1 = new Thread(r1);        
        Thread t2 = new Thread(r2);        
            
        t1.start();
        t2.start();
            
            
        
        
    }
    
    
}

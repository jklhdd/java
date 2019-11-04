/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long
 */
public class Demothread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        
        Runnable r1 = ()->{
            for(int i = 600;i>0;i--){                
                try {
                    System.out.println(i/60+":"+i%60);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Demothread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Happy new year!");
        };
        Thread r2 = new Thread(r1);
        r2.start();
        
        
    }
    
}

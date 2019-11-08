/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.concurrent.CountDownLatch;
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
        try {
            // TODO code application logic here
            
//        Runnable r1 = ()->{
//            for(int i = 600;i>0;i--){  
//                int min = i/60;
//                int sec = i%60;
//                try {
////                    if(min < 10 && sec < 10) System.out.println("0"+min+":"+"0"+sec);
////                    else if(min < 10 ) System.out.println("0"+min+":"+sec);
////                    else if(sec < 10 ) System.out.println(min+":"+"0"+sec);
////                    else System.out.println(min+":"+sec);
////                    System.out.println(String.format("%02d", min)+String.format("%02d", sec));
//                    System.out.println((min>=10?"":"0")+min+":"+(sec>=10?"":"0")+sec);
//                    Thread.sleep(1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Demothread.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            System.out.println("Happy new year!");
//        };
//        Thread r2 = new Thread(r1);
//        r2.start();
//
//       

Number n = new Number();

Runnable r1 = () ->{
    for(int i = 0;i<100;i++){
        // khóa n
        synchronized(n){
            n.count();
            n.showCount();
        }
        try{
            Thread.sleep(100);
        }catch(Exception e){
            
        }
    }
};

Thread t1 = new Thread(r1);
Thread t2 = new Thread(r1);
t1.start();
t2.start();
final CountDownLatch latch = new CountDownLatch(1);
final Thread t = new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("qwerty");
        latch.countDown();
    }
});

t.start();
latch.await();

System.out.println("absolutely sure, qwerty as been printed");
        } catch (InterruptedException ex) {
            Logger.getLogger(Demothread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

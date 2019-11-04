/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

/**
 *
 * @author Long
 */
public class MyThread implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<20;i+=2){
            System.out.println("MyThread..."+i);
        }
    }
    
}

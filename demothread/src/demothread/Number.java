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
public class Number {
    public int count = 0;
    public int count1 = 0;
    //khóa count và count1
    public synchronized void count(){
        count++;
        count1++;
    }
    //khóa count và count1
    public synchronized void showCount(){
        System.out.println(count);
        System.out.println(count1);
    }
}

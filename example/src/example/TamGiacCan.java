/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;

/**
 *
 * @author Long
 */
public class TamGiacCan extends TamGiac {

    public TamGiacCan(int a, int b, int c) {
        super(a, b, c);
        Scanner in = new Scanner(System.in);
        while(!(a==b||a==c||b==c)) {
            System.out.println("Sai");
            this.setA(in.nextInt());
            this.setB(in.nextInt());
            this.setC(in.nextInt());
        } 
    }

    public TamGiacCan() {
    } 
    
    
    
    
}

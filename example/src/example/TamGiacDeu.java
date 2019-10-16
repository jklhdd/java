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
public class TamGiacDeu extends TamGiacCan{

    public TamGiacDeu(int a, int b, int c) {
        super(a, b, c);
        Scanner in = new Scanner(System.in);
        while(a != b || a!=c ){
            System.out.println("Sai");
            this.setA(in.nextInt());
            this.setB(a);
            this.setC(a);
        }
    
    }

    
    
    public TamGiacDeu() {
    }
    
    @Override
    public double dientich(){
        return Math.pow(a, 2)*Math.sqrt(3)/4;
    }
}

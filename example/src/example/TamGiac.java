/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Long
 */
public class TamGiac {
    protected int a;
    protected int b;
    protected int c;

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TamGiac() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double chuvi(){
        return this.getA()+this.getB()+this.getC();
    }
    
    public double dientich(){
        double p = this.chuvi()/2;
        return Math.sqrt(p*(p-this.getA())*(p-this.getB())*(p-this.getC()));
    }
    
}

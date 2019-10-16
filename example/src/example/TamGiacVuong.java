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
public class TamGiacVuong extends TamGiac{

    public TamGiacVuong(int a, int b, int c) {
        super(a, b, c);
        Scanner in = new Scanner(System.in);
        while(!checkvuong()){
            System.out.println("Sai");
            this.setA(in.nextInt());
            this.setB(in.nextInt());
            this.setC(in.nextInt());
        }     
         
    }

    public TamGiacVuong() {
    }
        
            
    @Override
    public double dientich(){
        return this.getA()*this.getB()/2;
    }
    public boolean checkvuong(){
        double c1 = Math.pow(a, 2)+Math.pow(b, 2);
        double c2 = Math.pow(b, 2)+Math.pow(c, 2);
        double c3 = Math.pow(a, 2)+Math.pow(c, 2);
        if(c1 == Math.pow(c, 2) || c2 == Math.pow(a, 2)|| c3 == Math.pow(b, 2))
            return true;
        else return false;
    }
}

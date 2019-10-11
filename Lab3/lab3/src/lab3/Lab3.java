/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Long
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo(4,7);
        a.input();
        PhanSo temp = a.add(b);
        temp.output();
        temp = a.mul(b);
        temp.output();
        temp = a.div(b);
        temp.output();
        temp = a.sub(b);
        temp.output();
    }
    
}

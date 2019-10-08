/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

/**
 *
 * @author Long
 */
public class B2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        System.out.print(Fibo(22)-1);
    }
    public static int Fibo(int n){
        if (n == 1 || n == 2 ) return 1;
        else return Fibo(n-1) +Fibo(n-2);
    }
}

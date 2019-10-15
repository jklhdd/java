/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cart c = new Cart();      
        Scanner in = new Scanner(System.in);
        c.nhapCart();
        c.inCart(); 
        c.removeP(1);
        c.inCart();
                
    }
    
}

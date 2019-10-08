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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 2;i < n;i++){
            if(isNT(i)) System.out.print(i + " ");
        }
    }    
    public static boolean isNT(int n){        
        for (int i = 2;i < Math.abs(n);i++){
            if(n % i == 0) return false;            
        }
        return true;
    }
    
}

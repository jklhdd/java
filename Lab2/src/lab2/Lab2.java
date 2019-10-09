/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        SoNguyenTo x = new SoNguyenTo();
        int n = in.nextInt();
        x.setSNT(n);
        int b = x.timSoNguyenToTiepTheo();
        System.out.println(b);
    }
    
}

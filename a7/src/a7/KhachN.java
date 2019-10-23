/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a7;

import java.util.Scanner;

/**
 *
 * @author Long
 */
public class KhachN extends Khach{
    protected String quoctich;

    public KhachN() {
    }
    
    @Override
    public void inputInfo(){
        Scanner scan = new Scanner(System.in);
        super.inputInfo();
        this.quoctich = scan.nextLine();
    }
    @Override
    public void tinhtien(){
        this.thanhtien = dongia[3]*soluong;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Quoc tich: " + quoctich);
        System.out.println("Thanh tien: " + thanhtien);        
        
    }
    
}

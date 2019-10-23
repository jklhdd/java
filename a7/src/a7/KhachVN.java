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
public class KhachVN extends Khach{
    protected String doituong;

    public KhachVN() {
    }
    
    @Override
    public void inputInfo(){
        Scanner scan = new Scanner(System.in);
        super.inputInfo();
        this.doituong = scan.nextLine();
        
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Doi tuong: " + doituong);
        System.out.println("Thanh tien: " + thanhtien);     
        
    }
}

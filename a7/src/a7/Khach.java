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
public class Khach {
    protected String MaKH;
    protected String hoten;
    protected String date;
    protected double [] dongia = {1000,1200,1500,2000};
    protected double dinhmuc ;
    protected double soluong;
    protected double thanhtien;

    public Khach() {
    }

    public Khach(String MaKH, String hoten, String date, double dinhmuc) {
        this.MaKH = MaKH;
        this.hoten = hoten;
        this.date = date;
        this.dinhmuc = dinhmuc;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public double getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }
    
    public void inputInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        this.MaKH = in.nextLine();
        System.out.println("Nhap ten: ");
        this.hoten = in.nextLine();
        System.out.println("Nhap ngay: ");
        this.date = in.nextLine();
        System.out.println("Nhap so luong: ");
        this.soluong = in.nextInt();
    }
    
    public void tinhtien(){
        double t1 = 50 * dongia[0];
        double t2 = t1 + 50*dongia[1];
        double t3 = t2 + 50*dongia[2];
        double t4 = t3 + 50*dongia[3];
        if(soluong <= 50) this.thanhtien = dongia[0]*soluong;
        else if(soluong <= 100 ) this.thanhtien = t1+(soluong-50)*dongia[1];
        else if(soluong <= 200 ) this.thanhtien = t2+(soluong-100)*dongia[2];
        else this.thanhtien = t3+(soluong-200)*dongia[3];
    }
    
    public void showInfo(){
        System.out.println("Ma: " + MaKH);
        System.out.println("Ten: " + hoten);
        System.out.println("Ngay: " + date);
        System.out.println("So luong: " + soluong);        
        
    }
}

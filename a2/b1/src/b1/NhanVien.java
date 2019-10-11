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
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double luong;
    private int giolam;
    
    public NhanVien(){};
    public NhanVien(String ten,int tuoi,String diachi,double luong,int giolam){
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.giolam = giolam;
        this.luong = luong;
    }
    public void setTenNV(String ten){
        this.ten = ten;
    }
    public void setTuoiNV(int tuoi){
        this.tuoi = tuoi;
    }
    public void setDiaChiNV(String diachi){
        this.diachi = diachi;
    }
    public void setLuongNV(double luong){
        this.luong = luong;
    }
    public void setGioNV(int giolam){
        this.giolam = giolam;
    }
    
    public String getTenNV(){
        return this.ten;
    }
    
    public int getTuoiNV(){
        return this.tuoi;
    }
    
    public String getDiaChiNV(){
        return this.diachi;
    }
    
    public int getGioNV(){
        return this.giolam;
    }
    
    public Double getLuongNV(){
        return this.luong;
    }
    
    public void inputInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.ten = in.nextLine();        
        System.out.println("Nhap dia chi: ");
        this.diachi = in.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi = in.nextInt();
        System.out.println("Nhap luong: ");
        this.luong = in.nextDouble();
        System.out.println("Nhap gio lam: ");
        this.giolam = in.nextInt();
    }
    
    public void printInfo(){
        System.out.println("Thong tin: ");
        System.out.println("Ten: "+ this.ten);              
        System.out.println("Dia chi: " + this.diachi);       
        System.out.println("Tuoi: " + this.tuoi); 
        System.out.println("Luong: " + this.luong);      
        System.out.println("Gio lam: " + this.giolam);      
    }
    
    public double tinhThuong(){
        double thuong;
        if(this.giolam >= 200 ) return thuong = this.luong*0.2;
        else if(this.giolam < 100 ) return thuong = 0;
        else return thuong = this.luong*0.1;
    }
}

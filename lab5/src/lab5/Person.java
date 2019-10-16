/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Long
 */
public class Person {
    protected String ten;
    protected String gioitinh;
    protected String ngaysinh;
    protected String diachi;

    public Person(String ten, String gioitinh, String ngaysinh, String diachi) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public Person() {
    }
    
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public void inputInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ten: ");
        this.setTen(in.nextLine());
        System.out.println("Gioi tinh: ");
        this.setGioitinh(in.nextLine());
        System.out.println("Ngay sinh:(dd-mm-yyyy) ");
        this.setNgaysinh(in.nextLine());
        System.out.println("Dia chi: ");
        this.setDiachi(in.nextLine());
    }
    public void showInfo(){
        System.out.println("Ten: " +this.getTen());
        System.out.println("Gioi tinh: " + this.getGioitinh());
        System.out.println("Ngay sinh: " + this.getNgaysinh());
        System.out.println("Dia chi: " + this.getDiachi());        
    }
}

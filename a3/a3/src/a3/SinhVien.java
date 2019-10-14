/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class SinhVien {
    private String msv;
    private double diem;
    private int tuoi;
    private String lop;

    public SinhVien(){

    }
    public SinhVien(String msv,double diem,int tuoi,String lop){
        
    }
    public String getMasv() {
        return this.msv;
    }
    public void setMasv(String msv) {
        do{
            System.out.println("Yeu cau nhap lai: Ma sinh vien phai 8 ky tu");
            Scanner sc = new Scanner(System.in);
            msv = sc.nextLine();
        }while (msv.length()!=8);
        this.msv = msv;
    }
    public double getDiem() {
        return this.diem;
    }
    public void setDiem(double diem) {
        do{
            System.out.println("Yeu cau nhap lai: Diem so phai tu 0.0 den 10.0");
            Scanner sc = new Scanner(System.in);
            diem = sc.nextDouble();
        }while (diem<0||diem>10);
        this.diem = diem;
    }
    public int getTuoi() {
        return this.tuoi;
    }
    public void setTuoi(int tuoi) {
        do{
            System.out.println("Yeu cau nhap lai: Sinh vien phai >= 18 tuoi");
            Scanner sc = new Scanner(System.in);
            tuoi = sc.nextInt();
        }while (tuoi<18);
        this.tuoi = tuoi;
    }
    public String getLop() {
        return this.lop;
    }
    public void setLop(String lop) {
        do{
            System.out.println("Yeu cau nhap lai: Lop hoc phai bat dau chu A hoac C");
            Scanner sc = new Scanner(System.in);
            lop = sc.nextLine();
        }while (!(lop.startsWith("A") || lop.startsWith("C")));
        this.lop = lop;
    }

    public void inputInfo(){
        System.out.println("Nhap thong tin sinh vien");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MA sinh vien: 8 ky tu");
        setMasv(sc.nextLine());
        System.out.println("Nhap DIEM sinh vien: tu 0.0 den 10.0");
        setDiem(sc.nextDouble());
        System.out.println("Nhap TUOI sinh vien: >= 18 tuoi");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap LOP sinh vien: bat dau chu A hoac C");
        setLop(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("Thong tin chi tiet cua sinh vien la: ");
        System.out.println("Ma sinh vien: " + this.getMasv());
        System.out.println("Tuoi: " + this.getTuoi());
        System.out.println("Diem: " + this.getDiem());
        System.out.println("Lop hoc: " + this.getLop());
    }

    public void xetHocbong(){
        if(this.getDiem()>=8){
            System.out.println("Sinh vien nay duoc hoc bong");
        }
        else {
            System.out.println("Sinh vien nay khong duoc hoc bong");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class User {
    private String ten;
    private int tuoi;
    private String cmt;
    public User(){
        
    }
    public User(String ten,int tuoi,String cmt){
        this.ten = ten;
        this.tuoi = tuoi;
        this.cmt = cmt;
    }
    public String getTen(){
        return this.ten;
    }
    public int getTuoi(){
        return this.tuoi;
    }
    public String getCMT(){
        return this.cmt;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void setCMT(String cmt){
        this.cmt = cmt;
    }   
    
    public void addUser(){
        Scanner in = new Scanner(System.in);        
            System.out.println("Nhap ten");
            this.setTen(in.nextLine());
            System.out.println("Nhap tuoi");
            this.setTuoi(Integer.parseInt(in.nextLine()));
            System.out.println("Nhap cmt");
            this.setCMT(in.nextLine());
                     
    }
    public void printUser(){
        System.out.println(this.getTen()+"\t"+this.getTuoi()+"\t"+this.getCMT());
        
    }
}

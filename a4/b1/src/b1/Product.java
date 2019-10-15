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
public class Product {
    private int id;
    private String name;
    private int sl;
    private double gia;
    public Product(){
        
    }
    public Product(int id,String name,int sl,double gia){
        this.id = id;
        this.gia = gia;
        this.name = name;
        this.sl = sl;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getSL(){
        return this.sl;
    }
    public double getGia(){
        return this.gia;
    }
    public void setTen(String name){
        this.name = name;
    }
    public void setGia(double gia){
        this.gia = gia;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setSL(int sl){
        this.sl = sl;
    }
    public void checkSL(){
        if(this.getSL()<=0) System.out.println("Het hang");
        else System.out.println("Con hang");
    }
    public void addOneP(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap id:");
        this.setID(Integer.parseInt(in.nextLine()));
        System.out.println("Nhap ten:");
        this.setTen(in.nextLine());
        System.out.println("Nhap so luong:");
        this.setSL(in.nextInt());
        System.out.println("Nhap gia:");
        this.setGia(in.nextDouble());
    }
    public void inP(){
        System.out.println(this.getID()+"\t"+this.getName()+"\t"+this.getSL()+"\t"+this.getGia()+"\t");
    }
    
        
}

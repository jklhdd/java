/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Long
 */
public class Room {
    private String tenP;
    private int vitri;
    private ArrayList<User> danhsach;
    public Room(){
        danhsach = new ArrayList<User>();
    }
    
    
    public void addU(){
        User u = new User();        
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguoi:");
        int count = Integer.parseInt(in.nextLine());
        while(count!=0){
            u.addUser();
            this.danhsach.add(u);
            count--;
        }
    }
    public void addRoom(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten phong:");
        this.tenP = in.nextLine();
        System.out.println("Nhap vi tri:");
        this.vitri = in.nextInt();
        this.addU();
        
    }
    public void deleteUser(int index){
        if(this.danhsach.size() >= index && index >=0 ) danhsach.remove(index);
        else System.out.println("Khong ton tai!");
    }
    
    public void printRoom(){
        System.out.println("Thong tin");
        System.out.println("Ten phong: "+this.tenP);
        System.out.println("Vi tri phong: "+this.vitri);        
        System.out.println("Ten\t Tuoi\t CMT");
        for(User u : this.danhsach){
            u.printUser();
        }
    }
}

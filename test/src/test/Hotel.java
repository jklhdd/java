/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Long
 */
public class Hotel {
    private String name;
    private String location;
    private String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void inputInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten khach san: ");
        this.setName(in.nextLine());
        System.out.println("Nhap dia chi khach san: ");
        this.setLocation(in.nextLine());
        System.out.println("Nhap ten chu khach san: ");
        this.setOwnerName(in.nextLine());
    }
    
    public void showInfo(){
        System.out.println("Ten khach san: " + this.getName());
        System.out.println("Dia chi khach san: "+ this.getLocation());
        System.out.println("Ten chu khach san: "+ this.getOwnerName());
        System.out.println("=======================================");
    }
    
    public void findHotel(String name){
        if(this.getOwnerName().equalsIgnoreCase(name)) this.showInfo();
    }
}

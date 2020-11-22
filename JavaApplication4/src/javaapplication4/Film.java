/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Long
 */
public class Film {
    private String name;
    private double price;

    public Film() {
    }

    public Film(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void createFilm(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten phim: ");
        this.setName(s.nextLine());
        System.out.println("Nhap gia ve: ");
        this.setPrice(s.nextDouble());
    }
    
    public void readFilm(){
        if(this.getName() != null && this.getPrice() != 0){
            System.out.println("Ten phim: " + this.getName());
            System.out.println("Nhap ten phim: " + this.getPrice());
        }
    }
    
    public void updateFilm(){
        System.out.println("Nhap thong tin phim moi: ");
        this.createFilm();
    }
    
    public void deleteFilm(){
        this.setName(null);
        this.setPrice(0);
    }
    
    
}

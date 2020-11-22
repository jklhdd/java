/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Long
 */
public class Ticket {
    private String name;
    private String phone;
    private Film film;

    public Ticket() {
    }

    public Ticket(String name, String phone, Film film) {
        this.name = name;
        this.phone = phone;
        this.film = film;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
    
    public void bookTicket(ArrayList<Film> listFilm){
        String tenPhim;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Nhap ten phim muon dat: ");
            tenPhim = s.nextLine();            
        }while(findFilm(tenPhim, listFilm)== null);
        this.setFilm(findFilm(tenPhim, listFilm));
        System.out.println("Nhap ten nguoi dat: ");
        this.setName(s.nextLine());
        System.out.println("Nhap so dien thoai: ");
        this.setPhone(s.nextLine());
    }

    public Film findFilm(String tenPhim, ArrayList<Film> listFilm) {
        for(Film f : listFilm){
            if(tenPhim.equalsIgnoreCase(f.getName())) return f;
        }        
        return null;
    }
    
    public void showTicket(){
        System.out.println("Ten phim: " + this.getFilm().getName());
        System.out.println("Ten nguoi dat: " + this.getName());
        System.out.println("So dien thoai: " + this.getPhone());
    }
}

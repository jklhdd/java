/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author Long
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Film> listFilm = new ArrayList<>();
        Ticket t = new Ticket();
        Film a = new Film();
        Film b = new Film("b", 20000);
        Film c = new Film();        
        a.createFilm();
        c.updateFilm();
        listFilm.add(a);
        listFilm.add(b);
        listFilm.add(c);
        // b.deleteFilm();
        for(Film f : listFilm){
            f.readFilm();
        }
        t.bookTicket(listFilm);
        t.showTicket();
        
    }
    
}

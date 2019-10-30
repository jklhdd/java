/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Hotel> list = new ArrayList<>();
        String owner;
        Scanner in = new Scanner(System.in);
        
        list.add(new Hotel("Anh trang", "Ha Noi", "Long1"));
        list.add(new Hotel("Anh sao", "HCM", "Long2"));
        list.add(new Hotel("Anh sang", "Ha Noi", "Long3"));
        list.add(new Hotel("Mong mo", "HCM", "Long4"));
        list.add(new Hotel("Mong mai", "Ha Noi", "Long5"));
        list.add(new Hotel("Mong mien", "HCM", "Long6"));
        list.add(new Hotel("Mong mi", "Ha Noi", "Long7"));
        list.add(new Hotel("Hoa hong", "HCM", "Long8"));
        list.add(new Hotel("Hoa mai", "Ha Noi", "Long"));
        list.add(new Hotel("Hoa lan", "HCM", "Long"));
        
        System.out.println("Nhap ten chu so huu muon tim: ");
        owner = in.nextLine();
        
        list.stream().forEach((x) -> {
            x.findHotel(owner);
        });
    }
    
}

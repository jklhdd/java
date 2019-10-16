/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.time.LocalDate;
/**
 *
 * @author Long
 */
public class Student extends Person{
    public void ktTuoi(){
        LocalDate now = LocalDate.now();        
        String[] arrS = this.getNgaysinh().split("-");
        if(now.getYear() - Integer.parseInt(arrS[2])>=18) System.out.println("Du 18");
        else System.out.println("Khong du 18");
    }
}

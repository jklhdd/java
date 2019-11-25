/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

import java.util.Scanner;

/**
 *
 * @author Long
 */
public class Finaltest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        sm.fileOutput();
        while(true){            
            int lc;
            menu();
            System.out.println("Nhap lua chon: ");
            lc = sc.nextInt();
            switch(lc){                
                case 1:
                    sm.addStudent();break;
                case 2:                    
                    sm.display();break;
                case 3:
                    sm.fileInput();break;
                case 4:
                    return;
            }           
        }
    }
    
    public static void menu(){
        
        System.out.println("1.Add student record");
        System.out.println("2.Display student records");
        System.out.println("3.Save");
        System.out.println("4.Exit");
        
    }
    
}

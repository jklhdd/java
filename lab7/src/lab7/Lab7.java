/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Long
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sl;
        StudentManager studentList = new StudentManager();       
        while(true){
            Scanner in = new Scanner(System.in);
            menu();
            sl = in.nextInt();
            switch(sl){
                case 1:{
                    Student s = new Student();
                    s.inputInfo();
                    studentList.getStudentList().add(s);break;
                }
                case 2:{
                    Student s = new Student();
                    System.out.println("Nhap id sinh vien muon sua:");
                    int temp = in.nextInt();
                    for(int i=0;i<studentList.getStudentList().size();i++){
                        if(studentList.getStudentList().get(i).getId() == temp){
                            s.inputInfo();
                            studentList.getStudentList().set(i, s);break;
                        }
                        else if(i==studentList.getStudentList().size()-1){
                            System.out.println("Khong ton tai!");
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Nhap id sinh vien muon xoa:");
                    int temp = in.nextInt();
                    for(int i=0;i<studentList.getStudentList().size();i++){
                        if(studentList.getStudentList().get(i).getId() == temp){
                            studentList.getStudentList().remove(i);break;
                        }
                        else if(i==studentList.getStudentList().size()-1){
                            System.out.println("Khong ton tai!");
                        }
                    }
                    break;
                }
                case 4:{
                    studentList.sortByGPA();
                    for(Student s : studentList.getStudentList()){
                        s.showStudent();
                        System.out.println("=======================");    
                    }
                }
                case 5:{
                    studentList.sortByName();
                    for(Student s : studentList.getStudentList()){
                        s.showStudent();
                        System.out.println("=======================");    
                    }
                }
                case 6:{
                    for(Student s : studentList.getStudentList()){
                        s.showStudent();
                        System.out.println("=======================");    
                    }
                }
                case 0:return;
            }
            
        }
    }
    public static void menu(){
        System.out.println("==========MENU=========");
        System.out.println("1.Add student");
        System.out.println("2.Edit student");
        System.out.println("3.Delete student");
        System.out.println("4.Sort student by gpa");
        System.out.println("5.Sort student by name");
        System.out.println("6.Show student");
        System.out.println("0.Exit");
        System.out.println("=======================");
    }
}

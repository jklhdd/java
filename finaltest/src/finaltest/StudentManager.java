/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Long
 */
public class StudentManager {
    public ArrayList<Student> list = new ArrayList<Student>();
    public File f = new File("C:/Users/Long/Documents/GitHub/java/finaltest/src/finaltest/students.txt");
    

    public StudentManager() {
    }   
    
    
    public void addStudent(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        String i = s.nextLine();        
        System.out.println("Nhap ten: ");
        String n = s.nextLine();
        System.out.println("Nhap dia chi: ");
        String a = s.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String p = s.nextLine();
        Student sv = new Student(i,n,a,p);
        list.add(sv);
    }
    
    public void display(){
        System.out.println("StudentID    StudentName    Address    Phone");
        for(Student s : list){
            System.out.println(s.getId()+"\t" + s.getName()+"\t" + s.getAddress()+"\t" +s.getPhone()+"\t");
            
        }
    }
    
    public void fileOutput(){
        String ftxt= "";
        if (f.canRead()){
            try{
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String line= "";
                while ((line = dis.readLine()) !=null){
                    ftxt += line+"\n";
                    
                    String[] strs = line.split(",");
                    Student s = new Student(strs[0],strs[1],strs[2],strs[3]);
                    list.add(s);
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }catch (IOException e){
                System.out.println(e.getMessage());
            }            
        }
    }
    public void fileInput(){
        String ftxt= "";
        if(f.canWrite()){
                try{
                    FileOutputStream fos = new FileOutputStream(f,true);
                    DataOutputStream dos = new DataOutputStream(fos);
                    for(Student s:list){
                        String w = s.getId()+","+s.getName()+","+s.getAddress()+","+s.getPhone();
                        dos.writeBytes(ftxt+w+"\n");
                    }
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
    }
    
}

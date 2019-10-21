/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Long
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int gpa;

    public Student(int id, String name, int age, String address, int gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void showStudent(){
        System.out.println("ID: "+this.id);
        System.out.println("Ten: "+this.name);
        System.out.println("Tuoi: "+this.age);
        System.out.println("Dia chi"+this.address);
        System.out.println("GPA: "+this.gpa);
        
    }
    public void inputInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap id: ");
        this.id = in.nextInt();
        in.nextLine();
        System.out.println("Nhap ten: ");
        this.name = in.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = in.nextInt();
        in.nextLine();
        System.out.println("Nhap dia chi: ");
        this.address = in.nextLine();
        System.out.println("Nhap gpa: ");
        this.gpa = in.nextInt();        
        
    }
}

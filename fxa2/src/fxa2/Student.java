/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxa2;

/**
 *
 * @author Long
 */
public class Student {
    protected String name;
    protected int age;
    protected float diem;

    public Student() {
    }

    public Student(String name, int age, float diem) {
        this.name = name;
        this.age = age;
        this.diem = diem;
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

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    
}

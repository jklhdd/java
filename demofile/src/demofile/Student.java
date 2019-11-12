/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofile;

/**
 *
 * @author Long
 */
public class Student {
    protected String name;
    protected int tuoi;
    protected int diem;

    public Student() {
    }

    public Student(String name, int tuoi, int diem) {
        this.name = name;
        this.tuoi = tuoi;
        this.diem = diem;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    
}

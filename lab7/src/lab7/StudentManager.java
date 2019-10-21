/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author Long
 */
public class StudentManager {
    protected ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public void sortByName() {
        Collections.sort(studentList, new Comparator<Student>(){
            @Override
            public int compare(Student a1,Student a2){
                return a1.getName().compareTo(a2.getName());
            }
        });
    }
    
    public void sortByGPA() {
        Collections.sort(studentList, new Comparator<Student>(){
            @Override
            public int compare(Student a1,Student a2){
                if(a1.getGpa() > a2.getGpa()) return 1;
                else return -1;
            }
        });
    }
    
    
}

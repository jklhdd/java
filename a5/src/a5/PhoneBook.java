/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author Long
 */
public class PhoneBook extends Phone {
    protected ArrayList<Contact> PhoneList;

    public PhoneBook(ArrayList<Contact> PhoneList) {
        this.PhoneList = PhoneList;
    }    

    public PhoneBook() {
        PhoneList = new ArrayList<>();
    }
    
    @Override
    public void insertPhone(String name, String phone){        
        for(Contact c : this.PhoneList){
            if(c.getName().equals(name)){
                if(!phone.equals(c.getPhone())){
                    String s = c.getPhone()+" : "+phone;
                    c.setPhone(s);
                    return;
                }
                else {
                    System.out.println("Lap!");
                    return;
                }
            }
            
        }
        Contact c = new Contact(name, phone);
        this.PhoneList.add(c);
    }
    
    @Override
    public void removePhone(String name){
        for(Contact c : this.PhoneList){
            if(c.getName().equals(name)){
                PhoneList.remove(c); 
                return ;
            }
        }
        System.out.println("Khong ton tai");
    }
    
    @Override
    public void updatePhone(String name, String newphone){
        Scanner in = new Scanner(System.in);
        for(Contact c : this.PhoneList){
            if(c.getName().equals(name)){
                c.setPhone(newphone);
                return;
            }           
        }
        System.out.println("Khong ton tai");
    }
    
    @Override
    public void searchPhone(String name){
        for(Contact c : this.PhoneList){
            if(c.getName().equals(name)){
                System.out.println("TTTB: ");
                System.out.println(c.getName());
                System.out.println(c.getPhone());
                return  ;              
            }            
           
        }
        System.out.println("Khong ton tai");
    }
    
    @Override
    public void sort() {
        Collections.sort(PhoneList, new Comparator<Contact>(){
            @Override
            public int compare(Contact a1,Contact a2){
                return a1.getName().compareTo(a2.getName());
            }
        });
    }
}

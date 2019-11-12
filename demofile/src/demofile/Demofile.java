/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long
 */
public class Demofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> arr= new ArrayList<>();

        File f = new File("C:/Users/Long/Documents/Demo.txt");
        String ftxt= "";

        if (f.canRead()){
            try{
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
//                System.out.println(dis.readLine());
                String line= "";
                while ((line = dis.readLine()) !=null){
                    ftxt += line+"\n";
//                    System.out.println(line);
                    String[] strs = line.split("-");
                    Student s = new Student(strs[0],Integer.parseInt(strs[1]),Integer.parseInt(strs[2]));
                    arr.add(s);
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

            for (Student s:arr){
                System.out.println("ten : "+s.getName());
                System.out.println("tuoi : "+s.getTuoi());
                System.out.println("diem : "+s.getDiem());
            }

            if(f.canWrite()){
                try{
                    FileOutputStream fos = new FileOutputStream(f);
                    DataOutputStream dos = new DataOutputStream(fos);
                    String s= "Lilly-18-8";
                    dos.writeBytes( ftxt+s);
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

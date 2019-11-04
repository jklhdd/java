/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxa2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
/**
 *
 * @author Long
 */
public class StudentController {
    public TextField name = new TextField();
    public TextField age = new TextField();
    public TextField score = new TextField();
    
    public void listStudent(){
        try{
        String data = name.getText()+"-"+age.getText()+"-"+score.getText();
        writeFile(data);
        Parent liststudent = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
        Fxa2.mainStage.getScene().setRoot(liststudent);        
        } catch(Exception e){
                System.out.println("aa");
        }
    }
    
    public void writeFile(String s){
        File f = new File("C:/Users/Long/Documents/Demo.txt");
        String ftxt= "";
        if (f.canRead()){
            try{
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String line= "";
                while ((line = dis.readLine()) !=null){
                    ftxt += line+"\n";
                    
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        if(f.canWrite()){
                try{
                    FileOutputStream fos = new FileOutputStream(f);
                    DataOutputStream dos = new DataOutputStream(fos);                    
                    dos.writeBytes( ftxt+s );
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
    }   
    
    
}

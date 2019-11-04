/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxa2;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.*;
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
        
        if(f.canWrite()){
                try{
                    FileOutputStream fos = new FileOutputStream(f);
                    DataOutputStream dos = new DataOutputStream(fos);                    
                    dos.writeBytes( ListStudentController.ftxt+s );
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
    }   
    
    
}

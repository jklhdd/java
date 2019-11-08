/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavasql;
import static demojavasql.Demojavasql.password;
import static demojavasql.Demojavasql.url;
import static demojavasql.Demojavasql.username;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
        String n = name.getText();
        Integer a = Integer.parseInt(age.getText());
        Float s = Float.parseFloat(score.getText());
        Class.forName("com.mysql.jdbc.Driver");
            
        Connection conn = DriverManager.getConnection(url, username, password);
            
        Statement stm = conn.createStatement();
        
        String ins_sql = "INSERT INTO student(st_name,age,score) VALUES ('"+n+"'"+","+a+","+s+")"+";";
        stm.executeUpdate(ins_sql);
        Parent liststudent = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
        Demojavasql.mainStage.getScene().setRoot(liststudent);        
        } catch(Exception e){
                System.out.println("aa");
        }
    }
    
    
    
    
}

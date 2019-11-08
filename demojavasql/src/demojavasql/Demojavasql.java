/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavasql;
import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Long
 */
public class Demojavasql extends Application{
    public static Stage mainStage;
    /**
     * @param args the command line arguments
     */
    public static String url = "jdbc:mysql://localhost:3306/firstdatabase?useUnicode=true&characterEncoding=utf-8";
    public static String username = "root";
    public static String password = "";
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    
    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;
import java.io.IOException;
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
public class Labs6 extends Application {
    public static Stage mainstage;
    /**
     * @param args the command line arguments
     */
    public static String url = "jdbc:mysql://localhost:3306/phone?useUnicode=true&characterEncoding=utf-8";
    public static String username = "root";
    public static String password = "";
    public static void main(String[] args)  {
        // TODO code application logic here
        launch(args);     
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainstage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
        Scene scene = new Scene(root);
        mainstage.setScene(scene);
        mainstage.show();
    }
    
}

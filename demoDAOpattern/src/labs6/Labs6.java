/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;
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
    public static Stage mainStage;
    public static Parent root;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
        // TODO code application logic here
        launch(args);     
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        try {
            if(root==null){
                root = FXMLLoader.load(getClass().getResource("contact.fxml"));
            }
            ContactController.render();
            primaryStage.setTitle("Contact");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}

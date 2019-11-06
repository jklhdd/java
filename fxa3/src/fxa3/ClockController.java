/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxa3;


import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Long
 */
public class ClockController {
    public TextField min = new TextField();
    public TextField sec = new TextField();
    public Text mclk = new Text();
    public Text sclk = new Text();
    
    public static int m;
    public static int s;
    public static boolean flag=true;
    
    public void startClock(){
        try{
            m = Integer.parseInt(min.getText());
            
        }catch(Exception e){
            m = 10;
            
        }
        try{
            s = Integer.parseInt(sec.getText());
            
        }catch(Exception e){
            s = 10;
            
        }
        //lớp ẩn danh implements 
        Runnable r = new Runnable(){
            
            @Override
            public void run(){
                for(Integer i = m*60+s;i>=0;i--){                    
                        mclk.setText(((i/60)>=10?"":"0")+String.valueOf((i/60)));
                        sclk.setText(((i%60)>=10?"":"0")+String.valueOf((i%60)));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ClockController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                Platform.exit();
            }
        };
        Thread t = new Thread(r);
        t.setName("clock");
        t.start();
        
    }
    public void pauseClock(){
        
    }
}

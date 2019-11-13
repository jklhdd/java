/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavasql;
import java.sql.*;
/**
 *
 * @author Long
 */
public class Connector {
    public Connection conn;
    private static Connector _instance;

    private Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/firstdatabase?useUnicode=true&characterEncoding=utf-8";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            
        }
    }
    
    public static Connector getInstance(){
        if(_instance == null){
            _instance = new Connector();
        }
        return _instance;
    }
    
    public ResultSet getQuery(String sql){
        try {
            PreparedStatement prstm = conn.prepareStatement(sql);
            return prstm.executeQuery();
        }catch (Exception e){}
        return null;
    }

    public boolean updateQuery(String sql){
        try{
            PreparedStatement prstm = conn.prepareStatement(sql);
            if(prstm.executeUpdate() > 0){
                return true;
            }
        }catch (Exception e){}
        return false;
    }

    public void close(){
        try {
            conn.close();
        }catch (Exception e){}
    }
}

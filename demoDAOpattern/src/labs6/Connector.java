/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Long
 */
public class Connector {
    private Connection conn;
    private static Connector _instance;

    private Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/phone?useUnicode=true&characterEncoding=utf-8";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException | SQLException e){
            
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

    public int updateQuery(String sql){
        int aff = 0;
        try{
            
            PreparedStatement prstm = conn.prepareStatement(sql);
            aff = prstm.executeUpdate();            
            
        }catch (Exception e){}
        return aff;
    }

    public void close(){
        try {
            conn.close();
        }catch (Exception e){}
    }
}

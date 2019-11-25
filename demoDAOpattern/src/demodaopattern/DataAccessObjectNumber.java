/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaopattern;

import java.util.ArrayList;
import labs6.Connector;
import labs6.Number;

/**
 *
 * @author Long
 */
public class DataAccessObjectNumber implements DataAccessObject<Number>{

    @Override
    public int create(Number s) {
        Connector connector = Connector.getInstance();
        String sql = "INSERT INTO "+s.tableName+" (number,type,contact_id)"+
                " VALUES('"+s.getNumber()+"','"+s.getType()+"','"+
                s.getContactId()+"')";
        return connector.updateQuery(sql);        
    }

    @Override
    public int update(Number s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Number s) {
        Connector connector = Connector.getInstance();
        String sql = "DELETE FROM "+s.tableName+" WHERE contact_id="+s.getContactId();
        return connector.updateQuery(sql);
    }

    @Override
    public ArrayList<Number> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

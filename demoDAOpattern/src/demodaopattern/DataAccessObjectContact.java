/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaopattern;

/**
 *
 * @author Long
 */
import labs6.Connector;
import labs6.Contact;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataAccessObjectContact implements DataAccessObject<Contact> {

    @Override
    public int create(Contact contact) {
        Connector connector = Connector.getInstance();
        String sql = "INSERT INTO "+contact.tableName+" (name,company,address)"+
                " VALUES('"+contact.getCompany()+"','"+contact.getCompany()+"','"+
                contact.getAddress()+"')";
        return connector.updateQuery(sql);
    }

    @Override
    public int update(Contact contact) {
        Connector connector = Connector.getInstance();
        String sql = "UPDATE "+ contact.tableName+" SET name="+contact.getName()+
                " company="+contact.getCompany()+" address="+contact.getAddress()+
                " WHERE id="+contact.getId();

        return connector.updateQuery(sql);
    }

    @Override
    public int delete(Contact contact) {
        Connector connector = Connector.getInstance();
        String sql = "DELETE FROM "+contact.tableName+" WHERE id="+contact.getId();
        return connector.updateQuery(sql);
    }

    @Override
    public ArrayList<Contact> read() {
        Contact contact = new Contact();
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM "+contact.tableName;
        ResultSet rs = connector.getQuery(sql);
        try {
            ArrayList<Contact> list = new ArrayList<>();
            while (rs.next()){
                list.add(new Contact(rs.getInt("id"),rs.getString("name"),
                        rs.getString("company"),rs.getString("address")));
            }
            return list;
        }catch (Exception e){}
        return null;
    }

    @Override
    public Contact find(Integer id) {
        Contact contact = new Contact();
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM "+contact.tableName+" WHERE id="+id;
        ResultSet rs = connector.getQuery(sql);
        try {
            while (rs.next()){
                contact.setId(rs.getInt("id"));
                contact.setName(rs.getString("name"));
                contact.setCompany(rs.getString("company"));
                contact.setAddress(rs.getString("address"));
            }
        }catch (Exception e){}
        return contact;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

/**
 *
 * @author Long
 */
public class Contact {
    private Integer id;
    private String name;
    private String company;
    private String address;
    
    public String tableName  = "contact";

    public Contact() {
    }

    public Contact(Integer id, String name, String company, String address) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Id:" + id +"    "+ "Name:" + name +"    "+ "Company:" + company +"    "+ "Address:" + address;
    }

    
    
    
}

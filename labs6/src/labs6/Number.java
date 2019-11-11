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
public class Number {
    private int number;
    private int type;
    private int contactId;

    public Number() {
    }

    public Number(int number, int type, int contactId) {
        this.number = number;
        this.type = type;
        this.contactId = contactId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        return "Number:" + number +"    "+ "Type:" + type +"    "+ "ContactId:" + contactId;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;
    
    public PhanSo(){}
    
    public PhanSo(int ts,int ms){
        this.tuSo = ts;
        this.mauSo = ms;
    }
    
    public void setTS(int ts){
        this.tuSo = ts;
    }
    public void setMS(int ms){
        this.mauSo = ms;
    }
    public int getTS(){
        return this.tuSo;
    }
    public int getMS(){
        return this.mauSo;
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tuSo = in.nextInt();
        do{
            System.out.println("Nhap mau so: ");
            this.mauSo = in.nextInt();
            if(this.mauSo == 0) System.out.println("Khong hop le ");
        }while(this.mauSo == 0);        
    }
    public void output(){        
        if(this.tuSo == 0) System.out.println("Phan so: " + 0);
        else System.out.println("Phan so: "+ this.tuSo+"/"+this.mauSo);
    }
    public PhanSo rutGon(){
        PhanSo temp = new PhanSo(this.getTS(),this.getMS());
        int i = timUSCLN(this.getTS(),this.getMS());
        temp.setTS(this.getTS()/i);
        temp.setMS(this.getMS()/i);   
        return temp;
    }
    public PhanSo nghichDao(){
        if(this.tuSo == 0){
            System.out.println("Khong hop le ");
            return this;
        }
        else{
            PhanSo temp = new PhanSo(this.mauSo,this.tuSo);
            return temp;
        }
    }
    
    public PhanSo add(PhanSo b){
        PhanSo temp = new PhanSo();
        int t= this.getTS()*b.getMS()+this.getMS()*b.getTS();
        int s= this.getMS()*b.getMS();
        temp.setTS(t);
        temp.setMS(s);
        temp = temp.rutGon();
        return temp;
    }
    public PhanSo sub(PhanSo b){
        PhanSo temp = new PhanSo();
        int t= this.getTS()*b.getMS()-this.getMS()*b.getTS();
        int s= this.getMS()*b.getMS();
        temp.setTS(t);
        temp.setMS(s);
        temp = temp.rutGon();
        return temp;
    }
    public PhanSo mul(PhanSo b){
        PhanSo temp = new PhanSo();
        int t= this.getTS()*b.getTS();
        int s= this.getMS()*b.getMS();
        temp.setTS(t);
        temp.setMS(s);
        temp = temp.rutGon();
        return temp;
    }
    public PhanSo div(PhanSo b){
        PhanSo temp = new PhanSo();
        b = b.nghichDao();
        int t= this.getTS()*b.getTS();
        int s= this.getMS()*b.getMS();
        temp.setTS(t);
        temp.setMS(s);
        temp = temp.rutGon();
        return temp;
    }   
    
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }   
    
    
}

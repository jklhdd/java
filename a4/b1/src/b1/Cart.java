/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Long
 */
public class Cart {
    private int id;
    private String name;
    private double total;
    private ArrayList<Product> list;
    private String city;
    public Cart(){
        list = new ArrayList<Product>();
    }
    public Cart(int id,String name,String city,ArrayList<Product> list){
        this.id = id;
        this.name = name;
        this.city = city;        
        this.list.addAll(list);
    }
    public ArrayList<Product> getList(){
        return this.list;    
    }
    public String getCity(){
        return this.city;    
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void addP(Product p){
        this.getList().add(p);
    }
    public void removeP(int i){
        this.getList().remove(i);
        this.cal();
    }
    public void nhapCart(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap id:");
        this.setId(Integer.parseInt(in.nextLine()));
        System.out.println("Nhap ten:");
        this.setName(in.nextLine());
        System.out.println("Nhap thanh pho:");
        this.setCity(in.nextLine());
        System.out.println("Nhap so san pham:");
        int count = in.nextInt();
        while(count != 0){
            Product p = new Product();
            p.addOneP();
            this.addP(p);
            count--;
        }
        this.cal();
    }
    public void cal(){
        double sum=0;
        double ship;
        for(Product p : this.getList()){     
            
            sum = sum+p.getGia();
        }
        if(this.getCity().equalsIgnoreCase("HCM") || this.getCity().equalsIgnoreCase("HN") )
            ship = 0.01;
            else ship = 0.02;
        this.setTotal(sum+=sum*ship);
    }
    public void inCart(){
        System.out.println("Id: " + this.getId());
        System.out.println("Ten: "+ this.getName());
        System.out.println("Thanh pho: "+ this.getCity());
        System.out.println("Danh sach san pham: ");        
        System.out.println("Id \t Ten \t So luong \t Gia \t");
        for(Product p : list){
            p.inP();
        }
        System.out.println("Tong tien: "+ this.getTotal());
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;
import java.util.Scanner;    
/**
 *
 * @author Long
 */
public class TamGiac {
    private int canh1;
    private int canh2;
    private int canh3;
    public TamGiac(){
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Nhap tam giac");
            this.canh1 = in.nextInt();
            this.canh2 = in.nextInt();
            this.canh3 = in.nextInt();
            if(!checkTamGiac(this.canh1,this.canh2,this.canh3))
                    System.out.println("Nhap sai");
                
        }while(!checkTamGiac(this.canh1,this.canh2,this.canh3));
    }
    
    public boolean checkTamGiac(int canh1,int canh2,int canh3){
        if(canh1+canh2 < canh3 || canh1+ canh3 < canh2 || canh2 + canh3 < canh1)
            return false;
        else return true;
    }
    
    public int chuvi(){
        return this.canh1+this.canh2+this.canh3;
    }
    public float dientich(){
        float p = chuvi()/2;
        return (float)Math.sqrt(p*(p-this.canh1)*(p-this.canh2)*(p-this.canh3));
    }
}

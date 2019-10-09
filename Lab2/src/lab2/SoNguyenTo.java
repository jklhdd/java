/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Long
 */
public class SoNguyenTo {
    private int a;
    
    public void setSNT(int a){
        if(isSoNguyenTo(a)) this.a = a;
        else System.out.print("Invalid");
    }
    
    public int getSNT(){
        return this.a;
    }
    public boolean isSoNguyenTo(int x){
        if(x == 1) return false;
        for (int i = 2;i < Math.abs(x);i++){
            if(x % i == 0) return false;            
        }
        return true;
    }
    public int timSoNguyenToTiepTheo(){
            int n = this.a + 1;
            while(this.a < n){
                if(isSoNguyenTo(n)) break;
                else n++;
            } 
            return n;
          
        
    }   
    
}

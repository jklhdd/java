/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxlab4;

/**
 *
 * @author Long
 */
public class SoNguyenTo {
    private double n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
    
    public double nextSoNguyenTo(){
        double i = this.getN();
        while(true){
            i++;
            if(check(i)){
                this.setN(i);
                return i;
            }
        }
    }
    
    public double binhPhuongSoNguyenTo(){
        return n*n;
    }
    
    public boolean check(double s){
        if(s==1) return false;
        for(int i = 2;i<=Math.sqrt(s);i++){
            if(s%i == 0) return false;
        }
        return true;
    }
}

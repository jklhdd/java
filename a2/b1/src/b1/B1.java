/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

/**
 *
 * @author Long
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Lam", 20, "Pho Hue", 150, 2000);
        NhanVien nv3 = new NhanVien("Long", 20, "Sai Dong", 210, 3000);
        nv1.inputInfo();
        nv1.printInfo();
        System.out.println(nv1.tinhThuong());
        System.out.println(nv2.tinhThuong());
        System.out.println(nv3.tinhThuong());
    }
    
}

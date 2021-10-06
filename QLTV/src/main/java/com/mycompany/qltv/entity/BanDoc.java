
package com.mycompany.qltv.entity;

import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class BanDoc {
    private static final String SV =" sinh vien";
    private static final String HV =" hoc vien cao hoc";
    private static final String GV =" giao vien";
    private static int ID = 10000;
    
  

    String  hoTen ,diaChi , loaiBanDoc;
    int SĐT , ma ;
    
    public BanDoc(){
        this.ma = this.ID;
        this.ID++;
    }
    
    
    

    public BanDoc(String hoTen, String diaChi, String loaiBanDoc, int SĐT, int ma) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiBanDoc = loaiBanDoc;
        this.SĐT = SĐT;
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    public int getSĐT() {
        return SĐT;
    }

    public void setSĐT(int SĐT) {
        this.SĐT = SĐT;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

   public void nhapBanDoc(){
        Scanner in=new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin :");
        System.out.println("Ma ban doc:" + this.getMa());
        System.out.println("Nhap ho ten cua ban doc:");
        hoTen=in.nextLine();
        System.out.println("Nhap dia chi cua ban doc:");
        diaChi=in.nextLine();
        System.out.println("Nhap so dien thoai cua ban doc:");
        SĐT=in.nextInt();


        System.out.println("1: Sinh Vien");
        System.out.println("2: Hoc Vien");
        System.out.println("3: Giao Vien");
        int chon;
        do{
            chon =in.nextInt();
            System.out.println("Moi ban chon loai ban doc :");
            switch(chon){
                case 1:
                    this.setLoaiBanDoc(SV);
                    break;
                case 2:
                    this.setLoaiBanDoc(HV);
                    break;
                case 3:
                    this.setLoaiBanDoc(GV);
                    break;

            }
        }
        while (true);
    }

   public void Xuat(){
       System.out.printf("ma: %s - ho ten: %s - dia chi: %s  - sdt: %s - loai ban doc: %s", ma , hoTen,diaChi ,SĐT , loaiBanDoc);
        
    }   
    
    
    
    
    
}

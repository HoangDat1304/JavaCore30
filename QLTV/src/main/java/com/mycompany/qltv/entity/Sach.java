
package com.mycompany.qltv.entity;

import java.util.Scanner;


public class Sach {
    private static final String KHTN ="Khoa học tự nhiên";
    private static final String VHNT ="Văn hoa nghệ thuật";
    private static final String DTVT ="Điện tử viễn thông";
    private static final String CNTT ="Công  nghệ thông tin";
     private static int ID = 10000;
    
    
    
    String tenSach , tacGia , chuyenNganh;
    int maSach , namSanXuat;
    
    public Sach(){
        this.maSach= this.ID;
        this.ID++;
    }
    

    public Sach(String tenSach, String tacGia, String chuyenNganh, int maSach, int namSanXuat) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.maSach = maSach;
        this.namSanXuat = namSanXuat;
    }

    

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    
     public void nhapSach(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin sach:");
        System.out.println("Ma Sach :"+this.getMaSach());
        System.out.print("Nhap ten sach:");
        tenSach=sc.nextLine();
        System.out.print("Nhap ten tac gia:");
        tacGia=sc.nextLine();
        System.out.print("Nhap nam xuat ban sach:");
        namSanXuat=sc.nextInt();

        System.out.println("Nhap chuyen nganh:");
        System.out.println("1: Khoa Hoc Tu Nhien");
        System.out.println("2: Van Hoa Nghe Thuat");
        System.out.println("3: Dien Tu Vien Thong");
        System.out.println("4: Cong Nghe Thong Tin");
        int chon;
        do{
            System.out.println("moi ban chon chuyen nganh:");
            chon =sc.nextInt();
            switch(chon){
                case 1:
                    this.setChuyenNganh(KHTN);
                    break;
                case 2:
                    this.setChuyenNganh(VHNT);
                    break;
                case 3:
                    this.setChuyenNganh(DTVT);
                    break;
                case 4:
                    this.setChuyenNganh(CNTT);
                    break;
            }
        }
        while (true);
    }
      public void Xuat(){
       System.out.printf("ma: %s - ten sach: %s - tac gia: %s  - nam xb: %s - chuyen nganh: %s", maSach , tenSach,tacGia ,namSanXuat , chuyenNganh);
        
    }   

    
    
    
}

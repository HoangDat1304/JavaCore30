package entity;

import java.util.Scanner;

public class DienThoai {
    private int ma , donGia;
    private String model ,hangSX;
    private  static int ID = 9999;

    public DienThoai(){
        this.ma = ID++;
    }

    public DienThoai(int ma, int donGia, String model, String hangSX) {
        this.ma = ma;
        this.donGia = donGia;
        this.model = model;
        this.hangSX = hangSX;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        DienThoai.ID = ID;
    }

    public  void nhapĐT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập mã" + this.getMa());
        System.out.println(" mời nhập model");
        this.setModel(sc.nextLine());
        System.out.println("mời nhập hãng sản xuất");
        this.setHangSX(sc.nextLine());
        System.out.println(" mời nhập giá");
        this.setDonGia(sc.nextInt());
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "ma=" + ma +
                ", donGia=" + donGia +
                ", model='" + model + '\'' +
                ", hangSX='" + hangSX + '\'' +
                '}';
    }
}

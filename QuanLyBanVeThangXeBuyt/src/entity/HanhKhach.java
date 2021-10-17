package entity;

import java.util.Scanner;

public abstract class HanhKhach {
    private static int ID = 9999;
    private int ma, sDT;
    private String hoTen, diaChi;

    public HanhKhach() {
        this.ma = ID++;
    }

    public HanhKhach(int ma, int sDT, String hoTen, String diaChi) {
        this.ma = ma;
        this.sDT = sDT;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getsDT() {
        return sDT;
    }

    public void setsDT(int sDT) {
        this.sDT = sDT;
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

    public void nhapHK() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập mã " + this.getMa());
        System.out.println(" mời nhập họ tên");
        this.setHoTen(sc.nextLine());
        System.out.println(" mời nhập địa chỉ");
        this.setDiaChi(sc.nextLine());
        System.out.println(" mời nhập số điện thoại");
        this.setsDT(sc.nextInt());

    }

    @Override
    public String toString() {
        return "HanhKhach{" +
                "ma=" + ma +
                ", sDT=" + sDT +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}

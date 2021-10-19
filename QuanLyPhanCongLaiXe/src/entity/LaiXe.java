package entity;

import java.util.Scanner;

public abstract class LaiXe {
    private int ma , sDT;
    private String hoTen , diaChi;
    private static int ID = 10000;

    public LaiXe() {
        this.ma = ID++;
    }

    public LaiXe(int ma, int sDT, String hoTen, String diaChi) {
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

   public void nhapLX(){
       Scanner sc = new Scanner(System.in);
       System.out.println(" nhập mã " + this.getMa());
       System.out.println("nhập họ tên");
       this.setHoTen((sc.nextLine()));
       System.out.println(" nhập địa chỉ ");
       this.setDiaChi(sc.nextLine());
       System.out.println(" nhập số điện thoại");
       this.setsDT(sc.nextInt());

   }

    @Override
    public String toString() {
        return "LaiXe{" +
                "ma=" + ma +
                ", sDT=" + sDT +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}

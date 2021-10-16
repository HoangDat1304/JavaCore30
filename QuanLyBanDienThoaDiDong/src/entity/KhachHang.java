package entity;

import java.util.Scanner;

public  class KhachHang {
      private String hoTen , diaChi ;
      private int ma , sDT;
      private static int ID = 9999;

      public KhachHang() {
          this.ma = ID++;
      }

    public KhachHang(String hoTen, String diaChi, int ma, int sDT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ma = ma;
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

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        KhachHang.ID = ID;
    }

    public  void nhap(){
          Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập mã " + this.getMa());
          System.out.println("mời nhập họ tên ");
          this.setHoTen(sc.nextLine());
          System.out.println("mời nhập địa chỉ :");
          this.setDiaChi(sc.nextLine());
          System.out.println("mời nhập số điện thoại");
          this.setsDT(sc.nextInt());
      }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ma=" + ma +
                ", sDT=" + sDT +
                '}';
    }
}

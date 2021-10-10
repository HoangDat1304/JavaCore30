package Model;


import java.util.Scanner;

public class GiangVien {
    private int ma , sĐT;
    private String hoTen , diaChi ;
    private static int ID = 100;

    public GiangVien(){
        this.ma = this.ID++;
    }

    public GiangVien(int ma, int sĐT, String hoTen, String diaChi) {
        this.ma = ma;
        this.sĐT = sĐT;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getsĐT() {
        return sĐT;
    }

    public void setsĐT(int sĐT) {
        this.sĐT = sĐT;
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


    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        GiangVien.ID = ID;
    }
    public  void nhapGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ma " + this.getMa());
        System.out.println(" nhập họ tên ");
        this.setHoTen(sc.nextLine());
        System.out.println(" nhập địa chỉ");
        this.setDiaChi(sc.nextLine());
        System.out.println(" nhập số điện thoại ");
        this.setsĐT(sc.nextInt());

    }

}

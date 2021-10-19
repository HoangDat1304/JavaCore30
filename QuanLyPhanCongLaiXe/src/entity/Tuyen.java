package entity;

import java.util.Scanner;

public class Tuyen {
    private int ma , soKhoangCach , soDiemDung;
    private static int ID =100;

    public Tuyen(){
        this.ma = ID++;
    }

    public Tuyen(int ma, int soKhoangCach, int soDiemDung) {
        this.ma = ma;
        this.soKhoangCach = soKhoangCach;
        this.soDiemDung = soDiemDung;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoKhoangCach() {
        return soKhoangCach;
    }

    public void setSoKhoangCach(int soKhoangCach) {
        this.soKhoangCach = soKhoangCach;
    }

    public int getSoDiemDung() {
        return soDiemDung;
    }

    public void setSoDiemDung(int soDiemDung) {
        this.soDiemDung = soDiemDung;
    }

   public void nhapTuyen(){
       Scanner sc = new Scanner(System.in);
       System.out.println(" nhập mã " + this.getMa());
       System.out.println("nhập số khoảng cách");
       this.setSoKhoangCach(sc.nextInt());
       System.out.println(" nhập số điểm dừng ");
       this.setSoDiemDung(sc.nextInt());
   }

    @Override
    public String toString() {
        return "Tuyen{" +
                "ma=" + ma +
                ", soKhoangCach=" + soKhoangCach +
                ", soDiemDung=" + soDiemDung +
                '}';
    }
}

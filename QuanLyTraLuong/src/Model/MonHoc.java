package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class MonHoc {
//    ArrayList<MonHoc> list = new ArrayList<>();
//    Scanner sc =new Scanner(System.in);
//    private  String tenMon;
//    private int ma, tongSoTiet, soTietLyThuyet, mucKinhPhi;
//
//    private static int ID = 100;
//
//    public MonHoc(ArrayList<MonHoc> list, String tenMon,  int tongSoTiet, int soTietLyThuyet, int mucKinhPhi) {
//        this.list = list;
//        this.tenMon = tenMon;
//        this.ma = ma;
//        this.tongSoTiet = tongSoTiet;
//        this.soTietLyThuyet = soTietLyThuyet;
//        this.mucKinhPhi = mucKinhPhi;
//    }
//
//    public String getTenMon() {
//        return tenMon;
//    }
//
//    public void setTenMon(String tenMon) {
//        this.tenMon = tenMon;
//    }
//
//    public int getTongSoTiet() {
//        return tongSoTiet;
//    }
//
//    public void setTongSoTiet(int tongSoTiet) {
//        this.tongSoTiet = tongSoTiet;
//    }
//
//    public int getSoTietLyThuyet() {
//        return soTietLyThuyet;
//    }
//
//    public void setSoTietLyThuyet(int soTietLyThuyet) {
//        this.soTietLyThuyet = soTietLyThuyet;
//    }
//
//    public int getMucKinhPhi() {
//        return mucKinhPhi;
//    }
//
//    public void setMucKinhPhi(int mucKinhPhi) {
//        this.mucKinhPhi = mucKinhPhi;
//    }
//
//    public static int getID() {
//        return ID;
//    }
//
//    public static void setID(int ID) {
//        MonHoc.ID = ID;
//    }
//
//    public MonHoc() {
//        this.ma = this.ID;
//        this.ID++;
//    }
//
//
//    public int getMa() {
//        return ma;
//    }
//
//    @Override
//    public String toString() {
//        return "MonHoc{" +
//                "tenMon='" + tenMon + '\'' +
//                ", ma=" + ma +
//                ", tongSoTiet=" + tongSoTiet +
//                ", soTietLyThuyet=" + soTietLyThuyet +
//                ", mucKinhPhi=" + mucKinhPhi +
//                '}';
//    }
//
//    public void setMa(int ma) {
//        this.ma = ma;
//    }
//
//    public void nhapDSMonHoc(){
//
//        System.out.println("Moi ban nhap thong tin :");
//        System.out.println("Ma mon hoc:" + this.getMa());
//        System.out.println("Nhap ten mon:");
//        String ten= sc.nextLine();
//        System.out.println("Nhap tong so tiet:");
//        int sotiet= sc.nextInt();
//        System.out.println("Nhap so tiet ly thuyet:");
//        int sotietlythuyet = sc.nextInt();
//        System.out.println("muc kinh phi");
//        int muckinhphi = sc.nextInt();
//        boolean add = list.add(new MonHoc("ten,sotiet,sotietlythuyet,muckinhphi"));
//
//    }
//
//    public  void xuat(){
//        System.out.println(list);
//    }

    Scanner sc = new Scanner(System.in);
    ArrayList<MonHoc> list = new ArrayList<>();
    private String ten;
    private int ma, tongsotiet, sotietlythuyet,mucKinhPhi, number=100;

    public MonHoc() {
        super();
        this.ma = number++;
    }

    public MonHoc( String ten,  int tongsotiet, int sotietlythuyet, int mucKinhPhi) {
        this.ma = number++;

        this.list = list;
        this.ten = ten;
        this.ma = ma;
        this.tongsotiet = tongsotiet;
        this.sotietlythuyet = sotietlythuyet;
        this.mucKinhPhi = mucKinhPhi;
    }

    @Override
    public String toString() {
        return "MonHoc{" +

                ", ten='" + ten + '\'' +
                ", ma=" + ma +
                ", tongsotiet=" + tongsotiet +
                ", sotietlythuyet=" + sotietlythuyet +
                ", mucKinhPhi=" + mucKinhPhi +
                ", number=" + number +
                '}';
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<MonHoc> getList() {
        return list;
    }

    public void setList(ArrayList<MonHoc> list) {
        this.list = list;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTongsotiet() {
        return tongsotiet;
    }

    public void setTongsotiet(int tongsotiet) {
        this.tongsotiet = tongsotiet;
    }

    public int getSotietlythuyet() {
        return sotietlythuyet;
    }

    public void setSotietlythuyet(int sotietlythuyet) {
        this.sotietlythuyet = sotietlythuyet;
    }

    public int getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(int mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void nhap(){
        System.out.println("Moi ban nhap ten: ");
        String tenMh = sc.nextLine();
        System.out.println("MOi ban nhap tong so tiet: ");
        int sotiet = sc.nextInt();
        System.out.println("MOi ban nhap so tiet ly thuyet: ");
        int lythuyet = sc.nextInt();
        System.out.println("MOi ban nhap muc kinh phi: ");
        int kinhphi = sc.nextInt();
        list.add(new MonHoc(tenMh,sotiet,lythuyet,kinhphi));

    }
    public  void xuat(){
        System.out.println(list);
    }
}

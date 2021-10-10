package Model;

import java.util.Scanner;

public class MonHoc {
    private int ma , tongSoTiet, soTietLyThuyet , mucKinhPhi;
    private String tenMon;
    private static int ID = 100;

    public MonHoc(){
        this.ma = ID++;
    }

    public MonHoc(int ma, int tongSoTiet, int soTietLyThuyet, int mucKinhPhi, String tenMon) {
        this.ma = ma;
        this.tongSoTiet = tongSoTiet;
        this.soTietLyThuyet = soTietLyThuyet;
        this.mucKinhPhi = mucKinhPhi;
        this.tenMon = tenMon;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    public int getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(int mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        MonHoc.ID = ID;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "ma=" + ma +
                ", tongSoTiet=" + tongSoTiet +
                ", soTietLyThuyet=" + soTietLyThuyet +
                ", mucKinhPhi=" + mucKinhPhi +
                ", tenMon='" + tenMon + '\'' +
                '}';
    }

    public void nhapMonHoc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("mã môn học là"+ this.getMa());
        System.out.println("nhập tên môn :");
        this.setTenMon(sc.nextLine());
        System.out.println(" số tiết lý thuyết :");
        this.setSoTietLyThuyet(sc.nextInt());
        System.out.println("tổng số tiết");
        boolean chon = false;
        do {
            int a = sc.nextInt();
            if(a<this.getTongSoTiet()){
                System.out.println(" số tiết lý thuyết đúng");
                chon = true;
            }
        }while (false);
        System.out.println(" mức kinh phí :");
        this.setMucKinhPhi(sc.nextInt());

    }
}


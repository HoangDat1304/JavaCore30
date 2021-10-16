import entity.DienThoai;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhomKhachHang;

import java.util.Scanner;

public class MainClass {
    private static KhachHang[] khachhang;
    private  static DienThoai[] dienthoai;
    private  static HoaDon[] hoađon;
    private static NhomKhachHang[] nhomkhachhang;
    public static void main(String[] args) {

    }
    public static  void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--- Quản Lý Bán Điện Thoại Di Động----");
            System.out.println("--1: Nhập danh sách khách hàng ---");
            System.out.println("--2: In ra danh sách các khách hàng đã có--");
            System.out.println("--3 : Nhập danh sách điện thoại mới ---");
            System.out.println("--4: In ra danh sách điện thoại mới---");
            System.out.println("--5: Bảng ql mua hàng ---");
            System.out.println("--6: Sắp xếp theo họ tên khách hàng---");
            System.out.println("--7 :Sắp xếp theo số lượng khách hàng đặt mua ---");
            System.out.println("--8: Tính toán  và lập bảng tính tiền công---");
            System.out.println("----9: thoát-------");
            System.out.println("-------------------------------------");
            System.out.println("mời bạn chọn chức năng");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapDSKH();
                    break;
                case 2:
                    inDSKH();
                    break;
                case 3:
                    nhapDSĐT();
                    break;
                case 4:
                    inDSĐT();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
            }

        } while (true);
    }
    public  static  void nhapDSKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập danh sách khách hàng");
        int a = sc.nextInt();
        khachhang = new KhachHang[a];
        for(int i =0 ; i< a ;i++){
            KhachHang kh = new KhachHang();
            kh.nhap();
            khachhang[i] = kh;
        }
    }
    public  static void inDSKH(){
        for(KhachHang kh : khachhang){
            System.out.println(" danh sách khách hàng là" + kh);
        }
    }
    public  static void nhapDSĐT(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập danh sách điện thoại mới");
        int b = sc.nextInt();
        dienthoai = new DienThoai[b];
        for(int i =0 ; i<b; i++){
            DienThoai đt = new DienThoai();
            đt.nhapĐT();
            dienthoai[i] = đt;
        }
    }
    public  static void inDSĐT(){
        for(DienThoai đt : dienthoai){
            System.out.println("danh sách đt mới là :" + đt);
        }
    }

}

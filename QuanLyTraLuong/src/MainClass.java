import Model.GiangVien;
import Model.MonHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private  static ArrayList<GiangVien> listGV = new ArrayList<>();
    private static  ArrayList<MonHoc> listMH = new ArrayList<>();
   static MonHoc mh = new MonHoc();
    public static void nhapDSMH(){
        mh.nhap();

    }
    public  static  void inDSMH(){
       mh.xuat();
    }
    public static void nhapGV(){
        GiangVien gv = new GiangVien();
        gv.nhapDSGV();
        listGV.add(gv);
    }
    public static void inDSGV(){
        mh.xuat();
    }

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--- Quản Lý Thư Trả Lương----");
            System.out.println("--1: Nhập danh sách môn học ---");
            System.out.println("--2: In ra danh sách các môn học đã có--");
            System.out.println("--3 :In ra danh sách giảng viên ---");
            System.out.println("--4: Nhập danh sách giảng viên---");
            System.out.println("--5: Bảng ql mượn sách ---");
            System.out.println("--6: Sắp xếp theo họ tên giảng viên---");
            System.out.println("--7 :Sắp xếp theo số tiết giảng dạy mỗi môn---");
            System.out.println("--8: Tính toán  và lập bảng tính tiền công---");
            System.out.println("----thoát-------");
            System.out.println("-------------------------------------");
            System.out.println("mời bạn chọn chức năng");
            int chon =  sc.nextInt();
            switch(chon){
                case 1:
                    nhapDSMH();
                    break;
                case 2:
                    inDSMH();
                    break;
                case 3:
                    nhapGV();
                    break;
                case 4:
                    inDSGV();
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



}

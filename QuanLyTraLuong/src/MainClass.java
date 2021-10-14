
import Model.BangKeKhai;
import Model.GiangVien;
import Model.MonHoc;
import Model.TrinhDo;

import java.util.Scanner;

public class MainClass {

    public static GiangVien[] giangvien;
    public static MonHoc[] monhoc;
    public static BangKeKhai[] bangkekhai;
    public static TrinhDo[] trinhdo;


    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--- Quản Lý Thư Trả Lương----");
            System.out.println("--1: Nhập danh sách môn học ---");
            System.out.println("--2: In ra danh sách các môn học đã có--");
            System.out.println("--3 : Nhập danh sách giảng viên ---");
            System.out.println("--4: In ra danh sách giảng viên---");
            System.out.println("--5: Bảng ql mượn sách ---");
            System.out.println("--6: Sắp xếp theo họ tên giảng viên---");
            System.out.println("--7 :Sắp xếp theo số tiết giảng dạy mỗi môn---");
            System.out.println("--8: Tính toán  và lập bảng tính tiền công---");
            System.out.println("----9: thoát-------");
            System.out.println("-------------------------------------");
            System.out.println("mời bạn chọn chức năng");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapDSMH();
                    break;
                case 2:
                    inDSMH();
                    break;
                case 3:
                    nhapDSGV();
                    break;
                case 4:
                    inDSGV();
                    break;
                case 5:
                    break;
                case 6:
                    sapXepTenGV();
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


    public void nhapDSMH() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap danh sách môn học");
        int a = sc.nextInt();
        monhoc = new MonHoc[a];
        for (int i = 0; i < a; i++) {
            MonHoc mh = new MonHoc();
            mh.nhapMonHoc();
            monhoc[i] = mh;

        }

    }
    public  void inDSMH(){
        System.out.println(" danh sách môn học :");
        for (MonHoc m : monhoc){
            System.out.println(" danh sách môn học "+ m);
        }

    }
    public  void nhapDSGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập danh sách giảng viên");
        int a = sc.nextInt();
        giangvien = new GiangVien[a];
        for(int i=0 ; i<a; i++){
            GiangVien gv = new GiangVien();
            gv.nhapGV();
            giangvien[i] = gv;
        }
    }
    public  void inDSGV(){
        System.out.println("danh sách giảng viên :");
        for(GiangVien g : giangvien){
            System.out.println(" danh sách giảng viên " + g);
        }
    }
    public  void sapXepTenGV(){
        BangKeKhai bkk = new BangKeKhai();
        for(int i= 0 ; i< bangkekhai.length-1;i++){
            for(int j= i+1 ; j<bangkekhai.length;j++){
                if(bangkekhai[i].getGv().getHoTen().compareTo(bangkekhai[j].getGv().getHoTen())>0){
                    bkk = bangkekhai[i];
                    bangkekhai[i]=bangkekhai[j];
                    bangkekhai[j] = bkk;

                }

            }
        }
    }

   public static   void sapXepSoTietGiangDay(){
        MonHoc m = new MonHoc();
        for(int i=0 ; i<bangkekhai.length;i++){
            for(int j = 0 ; j<bangkekhai[i].getMh().getTenMon().length() ; j++){
                for(int k = j+1 ; k < bangkekhai[j].getMh().getTenMon().length();k++){
                    if(monhoc[j].getTongSoTiet()<monhoc[k].getTongSoTiet()){
                        m = monhoc[j];
                        monhoc[j] = monhoc[k];
                        monhoc[k] = m ;
                    }
                }
            }

        }

    }


}









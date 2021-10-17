import entity.BangKeBanVe;
import entity.HanhKhach;
import entity.LoaiHanhKhach;
import entity.Ve;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private static HanhKhach[] hanhkhachs;
    private static LoaiHanhKhach[] loaihanhkhach;
    private static Ve[] ves=new Ve[1000];
    private static BangKeBanVe[] bangKBV;
    private static int tongSL;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("--- Quản Lý Bán vé----");
                System.out.println("--1: Nhập danh sách khách hàng ---");
                System.out.println("--2: In ra danh sách khách hàng đã có--");
                System.out.println("--3 : Nhập danh sách giá vé ---");
                System.out.println("--4: In ra danh sách giá vé---");
                System.out.println("--5: nhập danh sách bán vé và in ds  ---");
                System.out.println("--6: Sắp xếp ds bán vé theo tên khách hàng---");
                System.out.println("--7 :Sắp xếp ds bán vé theo loại vé ---");
                System.out.println("--8: Tính tổng giá tiền phải trả của kh---");
                System.out.println("----9: thoát-------");
                System.out.println("-------------------------------------");
                System.out.println("mời bạn chọn chức năng");
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        nhapDSHK();
                        break;
                    case 2:
                        inDSHK();
                        break;
                    case 3:
                        nhapLoaiVe();
                        break;
                    case 4:
                        inDSLV();
                        break;
                    case 5:
                        nhapDSBV(hanhkhachs , ves , bangKBV);
                        break;
                    case 6:
                        sapXepTheoTen();
                        break;
                    case 7:
                        sapXepTheoLoaiVe();
                        break;
                    case 8:
                        tinhTong();
                        break;
                    case 9:
                        System.exit(0);
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void nhapDSHK() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so luong hành khách");
            int a = sc.nextInt();
            hanhkhachs = new HanhKhach[a];
            for (int i = 0; i < a; i++) {
               LoaiHanhKhach hk = new LoaiHanhKhach();
                hk.nhapLoaiKH();
                hanhkhachs[i] = hk;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void inDSHK() {
        for (HanhKhach hk : hanhkhachs) {
            System.out.println(" danh sách hành khách là :" + hk);
        }
    }

    public static void nhapLoaiVe() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("danh sách vé là :");
            int a = sc.nextInt();
            ves = new Ve[a];
            for (int i = 0; i < a; i++) {
                Ve v = new Ve();
                v.nhapVe();
                ves[i] = v;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void inDSLV() {
        for (Ve v : ves) {
            System.out.println("danh sách loại vé là :" + v);
        }
    }
    public static void timKiemHK(int id){
        for(HanhKhach hk : hanhkhachs) {
            if (hk.getMa() == id) {
                System.out.println(hk);
            }
        }
    }
    public static void timKiemLoaiVe(int id){
        for(Ve ve: ves){
            if(ve.getMa()==id){
                System.out.println(ve);
            }
        }
    }
    public static void nhapDSBV(HanhKhach[] listHK , Ve[] listVe , BangKeBanVe[] listBBV) {
        boolean check = true;
        int n = 0;
        int maHK  ;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(" nhập số lượng hành khách mua vé");
                n = sc.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println(e);
            }
        }while (check);
        for(int i =0 ; i <n ; i++) {
            do {
                try {
                    System.out.println("nhập mã khách hàng cần mua vé");
                    maHK = sc.nextInt();
                    if (listBBV[i].getVe().getMa() == maHK) {
                        check = true;
                        this.ves = listVe[i];
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                HanhKhach hk1 = timKiemHK(maHK);
                if (hk1 != null) {
                    int tongVe;
                    System.out.println("nhập số lượng loại vé mà" + hk1.getHoTen() + " cần mua là :");
                    try {
                        tongVe = sc.nextInt();
                        if (tongVe < 0 || tongVe > 3) {
                            System.out.println("bạn chỉ được chọn trong khoảng từ 1-3");
                            check = false;
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                int soVe;
                int tongVe;
                Ve ve1 = timKiemLoaiVe(soVe);
                if (ve1 != null) {
                    System.out.println("Nhập số lượng vé hành khách muốn mua của loại vé " + ve1.getMoTa());
                    do {
                        try {
                            tongVe = sc.nextInt();
                            if (tongVe > 1) {
                                System.out.println("số lượng vé phải nhỏ hơn 1");
                                check = false;
                            }
                            check = true;
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } while (!check);
                }
                while (check) ;
            }
        }


    }

    public static void sapXepTheoTen(){
        BangKeBanVe dem =new BangKeBanVe();
        for(int i=0; i<bangKBV.length; i++){
            for(int j=0; j<bangKBV.length; j++){
                if(bangKBV[i].getHanhkhach().getHoTen().compareTo(bangKBV[j].getHanhkhach().getHoTen())>0)
                {
                    dem = bangKBV[i];
                    bangKBV[i] = bangKBV[j];
                    bangKBV[j] = dem;
                }
            }
        }
    }

    public static void sapXepTheoLoaiVe (){
        BangKeBanVe dem =new BangKeBanVe();
        for(int i=0; i<bangKBV.length; i++){
            for(int j=0; j<bangKBV.length; j++){
                if(bangKBV[i].getVe().getMoTa().compareTo(bangKBV[j].getVe().getMoTa())>0)
                {
                    dem = bangKBV[i];
                    bangKBV[i] = bangKBV[j];
                    bangKBV[j] = dem;
                }
            }
        }
    }

    public static void tinhTong(){
        for (int i=0 ; i < bangKBV.length;i++){
            int sum =0;
            if(bangKBV[i].getHanhkhach().getHoTen().equals("HS-SV")){
                sum += bangKBV[i].getVe().getGia() * 50/100;
            }
            System.out.println(sum);
            if(bangKBV[i].getHanhkhach().getHoTen().equals("Cán bộ")){
                sum += bangKBV[i].getVe().getGia() * 70/100;
            }
            System.out.println(sum);
            if(bangKBV[i].getHanhkhach().getHoTen().equals("khách thông thường")){
                sum += bangKBV[i].getVe().getGia() * 100;
            }
            System.out.println(sum);
        }
    }

}



package com.mycompany.qltv.main;

import com.mycompany.qltv.entity.BanDoc;
import com.mycompany.qltv.entity.QLMuonSach;
import com.mycompany.qltv.entity.Sach;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class MainClass {
    public static void main(String[] args) {
       
    }
    
    private static ArrayList<Sach> listSach = new ArrayList<>();
    private  static ArrayList<BanDoc> listBanDoc = new ArrayList<>();
    private static ArrayList<QLMuonSach> listQLMS = new ArrayList<>();


    
    public  static void menu(){
        Scanner sc = new Scanner(System.in);
        do {     
            System.out.println("--- Quản Lý Thư Viện Sách----");
            System.out.println("--1: Nhập danh sách đầu sách mới---");
            System.out.println("--2: In ra danh sách các đầu sách đã có--");
            System.out.println("--3 :In ra danh sách bạn đọc---");
            System.out.println("--4: Nhập danh sách bạn đọc---");
            System.out.println("--5: Bảng ql mượn sách ---");
            System.out.println("--6: Sắp xếp theo tên bạn đọc---");
            System.out.println("--7 :Sắp xếp theo số lượng cuốn sách được mượn---");
            System.out.println("--8: Tìm kiếm và hiện thị danh sách mượn sách theo tên bạn đọc---");
            System.out.println("----thoát-------");
            System.out.println("-------------------------------------");
            System.out.println("mời bạn chọn chức năng");
            int chon =  sc.nextInt();
            switch(chon){
                case 1:                    
                    nhapSachMoi();
                    break;
                case 2:
                    inSach();
                    break;
                case 3:
                    nhapBanDoc();
                    break;                
                case 4:
                    inDSBanDoc();
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
    public static void nhapSachMoi(){
        System.out.println("moi ban nhap sach moi");
        Scanner sc = new Scanner(System.in);
        
                 
            System.out.printf("ma sach thu " );
            int ma = sc.nextInt();
            System.out.printf("nam san xuat" );
            int namSanXuat = sc.nextInt();
            System.out.printf("tac gia ");
            String tenSach = sc.nextLine();
            System.out.printf("tac gia ");
            String tacGia = sc.nextLine();
            System.out.printf("chuyen nganh la ");
            String chuyenNganh = sc.nextLine();
            
            
            Sach sach = new Sach(tenSach, tacGia, chuyenNganh, ma, namSanXuat);
            listSach.add(sach);
            
        
        
    }
    public static void inSach(){
        for (Sach sach : listSach) {
            System.out.println(sach);
        }
    }
    
    public static void nhapBanDoc(){
        System.out.println("moi nhap ban doc");
        Scanner sc = new Scanner(System.in);
        
        
        do {            
            System.out.printf("ma ban doc thu " );
            int ma = sc.nextInt();
            System.out.printf("so dien thoai:" );
            int SDT = sc.nextInt();
            System.out.printf("ho ten :");
            String hoTen = sc.nextLine();
            System.out.printf("dia chi : ");
            String diaChi = sc.nextLine();
            System.out.printf("loai ban doc la ");
            String loaiBanDoc = sc.nextLine();
            
            BanDoc banDoc = new BanDoc(hoTen, diaChi, loaiBanDoc, SDT, ma);
            listBanDoc.add(banDoc);
            
        } while (true);
        
    }
    public static void inDSBanDoc(){
        for (BanDoc banDoc : listBanDoc) {
            System.out.println(banDoc);
        }
    }
    
}

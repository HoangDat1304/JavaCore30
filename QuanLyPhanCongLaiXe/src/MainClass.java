import entity.BangPhanCong;
import entity.LaiXe;
import entity.LoaiTrinhDo;
import entity.Tuyen;

import java.util.*;

public class MainClass {
    private static List<LaiXe> listLX = new ArrayList<LaiXe>();
    private static List<Tuyen> listTuyen = new ArrayList<Tuyen>();
    private static List<BangPhanCong> listBPC = new ArrayList<BangPhanCong>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.println("--- Quản Lý Phân Công Lái Xe Buýt----");
            System.out.println("--1: Nhập danh sách lái xe ---");
            System.out.println("--2: In ra danh sách lái xe --");
            System.out.println("--3 : Nhập danh sách tuyến ---");
            System.out.println("--4: In ra danh sách tuyến---");
            System.out.println("--5: nhập danh sách phân công cho mỗi lái xe và in ds  ---");
            System.out.println("--6: Sắp xếp ds phân công theo tên lái xe---");
            System.out.println("--7 :Sắp xếp ds phân công theo số lượng tuyến đảm nhận trong ngày ---");
            System.out.println("--8: Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe---");
            System.out.println("----9: thoát-------");
            System.out.println("mời bạn chọn chức năng");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapLaiXe();
                    break;
                case 2:
                    inDSLX();
                    break;
                case 3:
                    nhapTuyen();
                    break;
                case 4:
                    inDSTuyen();
                    break;
                case 5:
                    nhapDSPC();
                    break;
                case 6:
                    sapXepTheoTen();
                    break;
                case 7:
                    sapXepGiamDan();
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void nhapLaiXe() {
        LoaiTrinhDo a = new LoaiTrinhDo();
        a.nhapLoaiTĐ();
        listLX.add(a);
    }

    public static void inDSLX() {
        for (LaiXe a : listLX) {
            System.out.println(a);
        }
    }

    public static void nhapTuyen() {
        Tuyen b = new Tuyen();
        b.nhapTuyen();
        listTuyen.add(b);
    }

    public static void inDSTuyen() {
        for (Tuyen b : listTuyen) {
            System.out.println(b);
        }
    }

    public static Tuyen timKiemTuyen(int id) {
        for (Tuyen t : listTuyen) {
            if (t.getMa() == id) {
                return t;
            }
        }
        return null;
    }

    public static LaiXe timKiemLaiXe(int id) {
        for (LaiXe l : listLX) {
            if (l.getMa() == id) {
                return l;
            }
        }
        return null;
    }

    public static void nhapDSPC() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("mời bạn nhập mã lái xe");
            int maLX;
            boolean check = false;
            LaiXe lx;
            do {
                maLX = sc.nextInt();
                lx = timKiemLaiXe(maLX);
                if (lx == null) {
                    System.out.println(" mời bạn nhâp lại mã lái xe");
                    check = true;
                } else {
                    check = false;
                }
            } while (check);
            //////////
            System.out.println(" mời bạn nhập mã tuyến ");
            int maTuyen;
            Tuyen t;
            do {
                maTuyen = sc.nextInt();
                t = timKiemTuyen(maTuyen);
                if (t == null) {
                    System.out.println("mời bạn nhập lại mã tuyến ");
                    check = true;
                } else {
                    check = false;
                }
            } while (check);
            ////
            BangPhanCong bpc = new BangPhanCong();
            for (BangPhanCong bpc1 : listBPC) {
                if (bpc1.getLaixe().getMa() == maLX && bpc1 != null) {
                    bpc1 = bpc;
                    check = true;
                    break;
                }
            }

            System.out.println(" mời bạn nhập số lượt chạy");
            int soLuotChay = sc.nextInt();
            do {
                if(soLuotChay >=15){
                    System.out.println("bạn k đc chạy quá số lượt chạy");
                    check = true;
                }else {
                    check = false;
                }
            }while (check);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void sapXepTheoTen() {
        Collections.sort(listBPC, new Comparator<BangPhanCong>() {
            @Override
            public int compare(BangPhanCong o1, BangPhanCong o2) {
                return o1.getLaixe().getHoTen().compareTo(o2.getLaixe().getHoTen());
            }
        });
    }

    public static void sapXepGiamDan() {
        Collections.sort(listBPC, new Comparator<BangPhanCong>() {
            @Override
            public int compare(BangPhanCong o1, BangPhanCong o2) {
                return o2.getSoLuong() - o1.getSoLuong();
            }
        });
    }
    
    }


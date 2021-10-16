package entity;

import java.util.Scanner;

public class NhomKhachHang extends KhachHang{
    private String loaiKH;

    public NhomKhachHang(){

    }

    public NhomKhachHang(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public NhomKhachHang(String hoTen, String diaChi, int ma, int sDT, String loaiKH) {
        super(hoTen, diaChi, ma, sDT);
        this.loaiKH = loaiKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public  void nhapLoaiKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập loại khách hàng");
        this.setLoaiKH(sc.nextLine());
        int chon = sc.nextInt();
        switch (chon){
            case 1:
                loaiKH = "mua lẻ";
                break;
            case 2:
                loaiKH = "mua buôn";
                break;
            case 3:
                loaiKH = "mua online";
                break;
            default:
                System.out.println("bạn chưa chọn loại khách hàng");
                break;
        }while (true);
    }
}

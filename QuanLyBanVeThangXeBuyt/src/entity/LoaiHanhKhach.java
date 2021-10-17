package entity;

import java.util.Scanner;

public class LoaiHanhKhach extends HanhKhach{
    private String loaiHK;

    public LoaiHanhKhach(){
    }

    public LoaiHanhKhach(String loaiHK) {
        this.loaiHK = loaiHK;
    }

    public LoaiHanhKhach(int ma, int sDT, String hoTen, String diaChi, String loaiHK) {
        super(ma, sDT, hoTen, diaChi);
        this.loaiHK = loaiHK;
    }

    public String getLoaiHK() {
        return loaiHK;
    }

    public void setLoaiHK(String loaiHK) {
        this.loaiHK = loaiHK;
    }

    public void nhapLoaiKH(){
        try {
            super.nhapHK();
            Scanner sc = new Scanner(System.in);
            System.out.println(" mời bạn chọn loại khách hàng ");
            this.setLoaiHK(sc.nextLine());
            System.out.println("1: HS-SV");
            System.out.println("2: Cán bộ");
            System.out.println("3: Khách thông thường");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    loaiHK ="HS-SV";
                    break;
                case  2:
                    loaiHK = "Cán bộ";
                    break;
                case  3:
                    loaiHK ="Khách thông thường";
                    break;
                default:
                    System.out.println("bạn chưa chọn loại khách hàng nào , mời bạn chọn ^^");
                    break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "LoaiHanhKhach{" +

                "loaiHK='" + loaiHK + '\'' +
                "ma=" + this.getMa() +
                ", sDT=" + this.getsDT() +
                ", hoTen='" + this.getHoTen() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                '}';
    }
}

package entity;

import java.util.Scanner;

public class LoaiTrinhDo extends LaiXe {
    private String loaiTrinhDo;

    public LoaiTrinhDo(){

    }

    public LoaiTrinhDo(String loaiTrinhDo) {
        this.loaiTrinhDo = loaiTrinhDo;
    }

    public LoaiTrinhDo(int ma, int sDT, String hoTen, String diaChi, String loaiTrinhDo) {
        super(ma, sDT, hoTen, diaChi);
        this.loaiTrinhDo = loaiTrinhDo;
    }

    public String getLoaiTrinhDo() {
        return loaiTrinhDo;
    }

    public void setLoaiTrinhDo(String loaiTrinhDo) {
        this.loaiTrinhDo = loaiTrinhDo;
    }
    public void nhapLoaiTĐ(){
        try {
           super.nhapLX();
            Scanner sc = new Scanner(System.in);
            System.out.println(" mời bạn chọn loại trình độ ");
            this.setLoaiTrinhDo(sc.nextLine());
            System.out.println("1: A");
            System.out.println("2: B");
            System.out.println("3: C");
            System.out.println("4:D");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    loaiTrinhDo ="A";
                    break;
                case  2:
                    loaiTrinhDo = "B";
                    break;
                case  3:
                    loaiTrinhDo = "C";
                    break;
                case 4 :
                    loaiTrinhDo ="D";
                    break;
                default:
                    System.out.println("bạn chưa chọn loại trình độ nào , mời bạn chọn ^^");
                    break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "LoaiTrinhDo{" +
                "loaiTrinhDo='" + loaiTrinhDo + '\'' +
                "ma=" + this.getMa() +
                ", sDT=" + this.getsDT() +
                ", hoTen='" + this.getHoTen() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                '}';
    }
}

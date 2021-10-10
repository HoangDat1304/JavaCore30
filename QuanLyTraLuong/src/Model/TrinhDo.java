package Model;

import java.util.Scanner;

public class TrinhDo extends GiangVien{
    private String loaiTrinhDo;

    public TrinhDo(){

    }

    public TrinhDo(String loaiTrinhDo) {
        this.loaiTrinhDo = loaiTrinhDo;
    }

    public TrinhDo(int ma, int sĐT, String hoTen, String diaChi, String loaiTrinhDo) {
        super(ma, sĐT, hoTen, diaChi);
        this.loaiTrinhDo = loaiTrinhDo;
    }

    public String getLoaiTrinhDo() {
        return loaiTrinhDo;
    }

    public void setLoaiTrinhDo(String loaiTrinhDo) {
        this.loaiTrinhDo = loaiTrinhDo;
    }

    @Override
    public String toString() {
        return "TrinhDo{" +
                "loaiTrinhDo='" + loaiTrinhDo + '\'' +
                '}';
    }
     public  void nhapLoaiTrinhDo(){
         Scanner sc = new Scanner(System.in);
         System.out.println(" mời bạn chọn loại trình độ");
         this.setLoaiTrinhDo(sc.nextLine());
         int chon = sc.nextInt();
         switch (chon){
             case 1 :
                 loaiTrinhDo = "GS-TS";
                 break;
             case 2 :
                 loaiTrinhDo = "PGS-TS";
                 break;
             case 3 :
                 loaiTrinhDo = "GV chính";
                 break;
             case 4 :
                 loaiTrinhDo ="Thạc sĩ";
                 break;
             default:
                 System.out.println("bạn chưa chọn loai trình độ ");
                 break;
         }while (true);

     }
}

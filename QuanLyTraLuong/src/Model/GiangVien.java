package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class GiangVien {
    private static final String GS_TS ="giáo sư , tiến sĩ";
    private static final String PGS_TS ="phó giáo sư , tiến sĩ";
    private static final String GV ="giảng viên";
    private static final String TS ="thạc sĩ";
    private static int ID = 100;
    ArrayList<GiangVien> listGV = new ArrayList<>();

    String hoTen , diaChi , trinhDo;
    int maGV , sĐT;

    public GiangVien(){
        this.maGV = this.ID;
        this.ID++;
    }


    @Override
    public String toString() {
        return "GiangVien{" +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", maGV=" + maGV +
                ", sĐT=" + sĐT +
                '}';
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        GiangVien.ID = ID;
    }

    public ArrayList<GiangVien> getListGV() {
        return listGV;
    }

    public void setListGV(ArrayList<GiangVien> listGV) {
        this.listGV = listGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public int getsĐT() {
        return sĐT;
    }

    public void setsĐT(int sĐT) {
        this.sĐT = sĐT;
    }

    public void nhapDSGV(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin :");
        System.out.println("Ma giang vien:" + this.getMaGV());
        System.out.println("Nhap ho ten cua giang vien:");
        String hoten = sc.nextLine();
        System.out.println("Nhap dia chi cua giang vien:");
        String diachi=sc.nextLine();
        System.out.println("Nhap sđt cua giảng vien:");
        int SDT= sc.nextInt();


        System.out.println("nhap  trinh do");
        System.out.println("1: Giao sư , tien si");
        System.out.println("2: Pho Giao sư , tien si");
        System.out.println("3: Giang Vien");
        System.out.println("4: thac si");
        int chon;
        do{
            chon = sc.nextInt();
            System.out.println("Moi ban chon trinh do :");
            switch(chon){
                case 1:
                    this.setTrinhDo(GS_TS);
                    break;
                case 2:
                    this.setTrinhDo(PGS_TS);
                    break;
                case 3:
                    this.setTrinhDo(GV);
                    break;
                case 4:
                    this.setTrinhDo(TS);
                    break;

            }

        }
        while (chon !=1 && chon !=2 && chon !=3 && chon !=4);
    }

    public GiangVien( String hoTen, String diaChi, String trinhDo, int maGV, int sĐT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.trinhDo = trinhDo;
        this.maGV = maGV;
        this.sĐT = sĐT;
    }

    public void Xuat(){
        System.out.println(listGV);
    }

}

package entity;

import java.util.Scanner;

public  class Ve {
    private static int ID =100;
    private  int ma , gia;
    private String moTa;

    public Ve(){
        this.ma =ID++;
    }

    public Ve(int ma, String moTa, int gia) {
        this.ma = ma;
        this.moTa = moTa;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void nhapVe(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập vé " + this.getMa());
            System.out.println(" nhập mô tả");
            this.setMoTa(sc.nextLine());
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    moTa ="tuyến riêng";
                    break;
                case  2:
                    moTa = "tuyến cụ thể";
                    break;
                case  3:
                    moTa ="liên tuyến";
                    break;
                default:
                    System.out.println("bạn chưa chọn loại khách hàng nào , mời bạn chọn ^^");
                    break;
            }
            System.out.println(" nhập giá");
            this.setGia(sc.nextInt());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Ve{" +
                "ma=" + ma +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}

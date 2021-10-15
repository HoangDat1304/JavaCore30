package Model;

import java.util.Arrays;
import java.util.Scanner;

public class BangKeKhai {
    public GiangVien gv;
    public MonHoc mh;
    public int soLop;

    public BangKeKhai(){
    }
    public BangKeKhai(GiangVien gv, MonHoc mh, int soLop) {
        this.gv = gv;
        this.mh = mh;
        this.soLop = soLop;
    }
    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }

    @Override
    public String toString() {
        return "BangKeKhai{" +
                "gv=" + gv +
                ", mh=" + mh +
                ", soLop=" + soLop +
                '}';
    }

    public  void nhapThongKe(GiangVien[] listGV , BangKeKhai[] listBKK , MonHoc[] listMH){
        boolean check = true;
        int soTietDaCo=0;
        MonHoc[] list =new MonHoc[1000];
        int input =0;
        Scanner sc = new Scanner(System.in);

        while(check){
            System.out.println(" mời bạn nhập mã ");
            int maGV = sc.nextInt();
            for (int i=0 ; i<1000 ; i++){
                if(listBKK[i] !=null && listBKK[i].getGv().getMa() == maGV ){
                    check =true;
                    this.gv = listGV[i];                   // lấy danh sách mã trong class Giang viên
                    break;
                }
            }
        }
        for(int i=0;i<1000;i++){
            if(listBKK[i] == null){
                break;
            }else if(listBKK[i].getGv().getMa() == this.gv.getMa()) {
                soTietDaCo = listBKK[i].getSoLop() * listBKK[i].getMh().getTongSoTiet();
            }
        }
        System.out.println("Số tiết giảng viên đã dạy là :"+soTietDaCo);

        for(int i=0;i<1000;i++){
            if(listMH[i] == null){
                break;
            }else{
                if((200-soTietDaCo)>listMH[i].getTongSoTiet()){
                    list[input++] = listMH[i];    // sẽ thêm ds môn mà gv sẽ tiếp tục dạy
                }
            }
        }
        System.out.println("Những môn học mà giảng viên dạy tiếp:");
        for(int i=0;i<input;i++){
            System.out.println(""+i+"."+ list[i].getSoTietLyThuyet());
        }
        if(input == 0){
            System.out.println("môn học k thỏa mãn");
            return;
        }
    }
}


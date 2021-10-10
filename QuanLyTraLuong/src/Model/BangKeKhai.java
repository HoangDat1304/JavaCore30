package Model;

import java.util.Arrays;

public class BangKeKhai {
    public GiangVien gv;
    public MonHoc mh;
    public int[] soLuong;

    public BangKeKhai(){

    }

    public BangKeKhai(GiangVien gv, MonHoc mh, int[] soLuong) {
        this.gv = gv;
        this.mh = mh;
        this.soLuong = soLuong;
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

    public int[] getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int[] soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "BangKeKhai{" +
                "gv=" + gv +
                ", mh=" + mh +
                ", soLuong=" + Arrays.toString(soLuong) +
                '}';
    }
}

package entity;

import java.util.ArrayList;
import java.util.List;

public class BangPhanCong {
    private LaiXe  laixe;
    private List<Tuyen> tuyen = new ArrayList<>();
    private int soLuong;

    public BangPhanCong() {
    }

    public BangPhanCong(LaiXe laixe, List<Tuyen> tuyen, int soLuong) {
        this.laixe = laixe;
        this.tuyen = tuyen;
        this.soLuong = soLuong;
    }

    public LaiXe getLaixe() {
        return laixe;
    }

    public void setLaixe(LaiXe laixe) {
        this.laixe = laixe;
    }

    public List<Tuyen> getTuyen() {
        return tuyen;
    }

    public void setTuyen(List<Tuyen> tuyen) {
        this.tuyen = tuyen;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "BangPhanCong{" +
                "laixe=" + laixe +
                ", tuyen=" + tuyen +
                ", soLuong=" + soLuong +
                '}';
    }
}

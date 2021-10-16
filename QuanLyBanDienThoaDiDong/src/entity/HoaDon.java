package entity;

import java.util.Arrays;

public class HoaDon {
    private KhachHang khachhang;
    private DienThoai[] dienthoai;
    private int[] soLuong;

    public HoaDon() {
    }

    public HoaDon(KhachHang khachhang, DienThoai[] dienthoai, int[] soLuong) {
        this.khachhang = khachhang;
        this.dienthoai = dienthoai;
        this.soLuong = soLuong;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public DienThoai[] getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(DienThoai[] dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int[] getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int[] soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "khachhang=" + khachhang +
                ", dienthoai=" + Arrays.toString(dienthoai) +
                ", soLuong=" + Arrays.toString(soLuong) +
                '}';
    }
}

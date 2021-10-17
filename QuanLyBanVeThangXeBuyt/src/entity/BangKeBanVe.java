package entity;

import java.util.Scanner;

public class BangKeBanVe {
    private HanhKhach hanhkhach;
    private   Ve ve;
    private int soLuong;

    public BangKeBanVe() {
    }

    public BangKeBanVe(HanhKhach hanhkhach, Ve ve, int soLuong) {
        this.hanhkhach = hanhkhach;
        this.ve = ve;
        this.soLuong = soLuong;
    }

    public HanhKhach getHanhkhach() {
        return hanhkhach;
    }

    public void setHanhkhach(HanhKhach hanhkhach) {
        this.hanhkhach = hanhkhach;
    }

    public Ve getVe() {
        return ve;
    }

    public void setVe(Ve ve) {
        this.ve = ve;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "BangKeBanVe{" +
                "hanhkhach=" + hanhkhach +
                ", soLuong=" + soLuong +
                '}';
    }
}
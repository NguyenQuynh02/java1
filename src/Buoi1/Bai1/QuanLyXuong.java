package Buoi1.Bai1;

import javax.sound.midi.Soundbank;

public class QuanLyXuong {
    public static void main(String[] args) {
        XuongXe a =  new XuongXe();
        System.out.print("Nhap thong tin cua xuong: \n");
        a.nhap();
        System.out.print(" Thong tin cua xuong: \n");
        a.xuat();
    }
}

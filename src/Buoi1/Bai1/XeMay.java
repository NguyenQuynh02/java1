package Buoi1.Bai1;

import java.util.Scanner;

public class XeMay {
    private static String maXemay;
    private String tenXe;
    private String loaiXe;
    private int ngaySD;
    private String tinhTrang;

    private static Scanner sc = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhap ma xe may: ");
        maXemay = sc.nextLine();
        System.out.print("Nhap ten xe : ");
        tenXe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Nhap so ngay su  dung: ");
        ngaySD = sc.nextInt();
        System.out.print("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.print("XE MAY\n");
        System.out.print(" Ma Xe may:  " + maXemay + "\n");
        System.out.print("Ten xe may:  " + tenXe  + "\n");
        System.out.print("Loai xe: " + loaiXe  + "\n");
        System.out.print("Ngay su dung: " +  loaiXe + "\n");
        System.out.print("Tinh trang: " + tinhTrang  + "\n");
    }



}

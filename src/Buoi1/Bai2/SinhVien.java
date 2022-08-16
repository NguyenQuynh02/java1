package Buoi1.Bai2;
import java.util.Scanner;
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String monHoc;
    private float Diem;

    private static Scanner sc = new Scanner((System.in));

    public void nhap(){
        System.out.print("Nhap ma sv: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ten Sv: ");
        tenSV = sc.nextLine();
        System.out.print("Nhap mon hoc: ");
        monHoc = sc.nextLine();
        System.out.print("Nhap Diem: ");
        Diem = sc.nextFloat();

    }
    public void xuat(){
        System.out.println("maSV = " + maSV);
        System.out.println("tenSV = " + tenSV);
        System.out.println("monHoc = " + monHoc);
        System.out.println("Diem = " + Diem);
    }

}

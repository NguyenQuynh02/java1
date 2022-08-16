package Buoi1.Bai2;
import java.util.Scanner;
public class ThongTinSV {
    private SinhVien sv = new SinhVien();
    private MonHoc mh =  new MonHoc();

    private static Scanner sc = new Scanner((System.in));

    public void nhap(){
        System.out.printf("NHAP THONG TIN SINH VIEN \n");
        sv.nhap();
        System.out.printf("NHAP THONG TIN MON HOC \n");
        mh.nhap();
    }
    public void xuat(){
        System.out.print("THONG TIN SV\n");
        sv.xuat();
        mh.xuat();

    }

}

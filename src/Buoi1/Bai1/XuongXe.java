package Buoi1.Bai1;
import java.util.Scanner;

public class XuongXe {
    private static String maXuong;
     private Oto oto = new Oto();
     private XeMay xemay = new XeMay();
    private static Scanner sc = new Scanner((System.in));
     public void nhap(){
         System.out.print("Nhap ma xuong: ");
         maXuong = sc.nextLine();
         System.out.print("Nhap thong tin oto: \n");
         oto.nhap();
         System.out.print("Nhap thong tin xe may:\n ");
         xemay.nhap();
     }
     public void xuat(){
        System.out.print("Ma xuong: " + maXuong  + "\n");
        oto.xuat();
        xemay.xuat();
    }

}

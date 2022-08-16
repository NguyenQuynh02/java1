package Buoi1.Bai2;
import java.util.Scanner;
public class MonHoc {
    private static String maMon;
    private String tenMon;
    private String tenGV;
    private int soTC;

    private static Scanner sc = new Scanner((System.in));
    public void nhap(){
        System.out.printf("Nhap ma mon: ");
        maMon = sc.nextLine();
        System.out.printf("Nhap ten mon : ");
        tenMon = sc.nextLine();
        System.out.printf("Nhap teN GV: ");
        tenGV =  sc.nextLine();
        System.out.printf("Nhap so tin chi: ");
        soTC = sc.nextInt();


    }
    public void xuat(){
        System.out.println("maMon = " + maMon);
        System.out.println("tenMon = " + tenMon);
        System.out.println("tenGV = " + tenGV);
        System.out.println("soTC = " + soTC);

    }


}

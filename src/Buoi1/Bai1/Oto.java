package Buoi1.Bai1;

import java.util.Scanner;

public class Oto {
    private static String maOto;
    private String tenXe;
    private double giaTien;

    private static Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap ma oto:  ");
        maOto = sc.nextLine();
        System.out.print("Nhap ten xe: ");
        tenXe = sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giaTien =  sc.nextDouble();
    }

    public void xuat(){
        System.out.print(" O TO \n");
        System.out.print("Ma oto: " + maOto  + "\n");
        System.out.print("Ten oto: " + tenXe + "\n");
        System.out.print("Gia tien: " + giaTien  + "\n");
    }

}
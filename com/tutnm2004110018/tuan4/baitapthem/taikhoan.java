package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class taikhoan 
{
    Scanner in = new Scanner(System.in);
    String tenchutaikhoan;
    int sotaikhoan;
    double sodu;
    taikhoan(){}

    taikhoan (String a, int b, double c)
    
    {
        a = tenchutaikhoan;
        b = sotaikhoan;
        c = sodu;
    }
    
    public void inthongtin ()
    {
        System.out.println("Nhap ten chu tai khoan: ");
        tenchutaikhoan = in.next();
        System.out.println("Nhap so tai khoan: ");
        sotaikhoan = in.nextInt();
        System.out.println("Nhap so du: ");
        sodu = in.nextDouble();
        in.nextLine();
    }

    public void xuatthongtin ()
    {
        System.out.println("Ho va ten: "+tenchutaikhoan+"\nSo tai khoan: "+sotaikhoan+"\nSo du: "+sodu);
    }

}

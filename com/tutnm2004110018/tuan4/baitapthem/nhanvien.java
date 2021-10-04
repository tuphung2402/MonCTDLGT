package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class nhanvien
{
    Scanner in = new Scanner(System.in);
    String ten;
    int luong;
    String diachi;
    String bophan;
    String sinh;

    nhanvien (){}

    nhanvien (String a, String b, String c, String d, int e)
    {
        a = ten;
        b = diachi;
        c = bophan;
        d = sinh;
        e = luong;
    }

    public void inthongtin ()
    {
        System.out.println("Nhap ten nhan vien: ");
        ten = in.next();
        System.out.println("Nhap dia chi: ");
        diachi = in.next();
        System.out.println("Nhap bo phan lam viec: ");
        bophan = in.next();
        System.out.println("Nhap ngay thang nam sinh: ");
        sinh = in.next();
        System.out.println("Nhap tien luong:");
        luong = in.nextInt();
        in.nextLine();
    }

    public void xuatthongtin ()
    {
        System.out.println("Ho va ten: "+ten+"\nDia chi: "+diachi+"\nBo phan lam viec: "+bophan+"\nNgay thang nam sinh: "+sinh+"\ntien luong: "+luong);

    }

    
}

package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class sach
{
    Scanner in = new Scanner(System.in);
    int gia;
    String nhaxb;
    int namxb;
    int giaban;
    int soluong;
    String loai;

    sach(){};

    sach (String a, String b, int c, int d, int e, int f)
    {
        a = nhaxb;
        b = loai;
        c = gia;
        d = namxb;
        e = giaban;
        f = soluong;
    }

    public void inthongtin ()
    {
        System.out.println("Nhap ten nha xuat ban: ");
        nhaxb = in.next();
        System.out.println("Nhap loai sach: ");
        loai = in.next();
        System.out.println("Nhap gia cuon sach: ");
        gia = in.nextInt();
        System.out.println("Nhap gia ban: ");
        giaban = in.nextInt();
        System.out.println("Nhap nam xuat ban:");
        namxb = in.nextInt();
        System.out.println("Nhap so luong:");
        soluong = in.nextInt();
        in.nextLine();
    }

    public void xuatthongtin ()
    {
        System.out.println("Nha xuat ban: "+nhaxb+"\nLoai sach: "+loai+"\nGia goc: "+gia+"\nGia ban: "+giaban+"\nNam san xuat: "+namxb+"\nSo luong: "+soluong);

    }
    
}

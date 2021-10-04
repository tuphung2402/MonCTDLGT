package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class maytinh 
{
    Scanner in = new Scanner(System.in);
    String nhasanxuat;
    int nam;
    String he;
    String ram;
    String cpu;
    int gia;
    int nambh;
    maytinh(){}

    maytinh (String a, String b, String c, String d, int e, int f, int g)
    {
        a = nhasanxuat;
        b = he;
        c = ram;
        d = cpu;
        e = nam;
        f = gia;
        g = nambh;

    }

    public void inthongtin ()
    {
        System.out.println("Nhap san xuat: ");
        nhasanxuat= in.next();
        System.out.println("Nhap he dieu hanh: ");
        he = in.next();
        System.out.println("Nhap ram: ");
        ram = in.next();
        System.out.println("Nhap chip cpu: ");
        cpu = in.next();
        System.out.println("Nhap nam san xuat:");
        nam = in.nextInt();
        System.out.println("Nhap nam bao hanh:");
        nambh = in.nextInt();
        System.out.println("Nhap gia tien: ");
        gia = in.nextInt();
        in.nextLine();
    }

    public void xuatthongtin ()
    {
        System.out.println("Nha san xuat: "+nhasanxuat+"\nHe dieu hanh: "+he+"\nRam: "+ram+"\nCPU: "+cpu+"\nNam san xuat: "+nam+"\nNam bao hanh: "+nambh+"\nGia tien: "+gia);

    }

    
}

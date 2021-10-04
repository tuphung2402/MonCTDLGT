package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class xe 
{
    Scanner in = new Scanner(System.in);
    String tenchuxe;
    String hang;
    String dong;
    String giayphep;
    String dungtich;
    xe(){};

    xe (String a, String b, String c, String d, String e)
    {
        a = tenchuxe;
        b = hang;
        c = dong;
        d = giayphep;
        e = dungtich;

    }

    public void inthongtin ()
    {
        System.out.println("Nhap ten chu xe: ");
        tenchuxe = in.next();
        System.out.println("Nhap hang xe: ");
        hang = in.next();
        System.out.println("Nhap dong xe: ");
        dong = in.next();
        System.out.println("Nhap giay phep lai xe: ");
        giayphep = in.next();
        System.out.println("Nhap dung tich xang:");
        dungtich = in.next();
        in.nextLine();
    }

    public void xuatthongtin ()
    {
        System.out.println("Ho va ten chu xe: "+tenchuxe+"\nHang xe "+hang+"\nDong xe: "+dong+"\nGiay phep lai xe: "+giayphep+"\nDung tich xang: "+dungtich);

    }

}

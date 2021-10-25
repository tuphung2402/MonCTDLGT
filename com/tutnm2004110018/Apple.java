package com.tutnm2004110018.kiemtragiuaky;
import java.util.Scanner;
public class Apple 
{
    Scanner in = new Scanner(System.in);
    String id;
    double khoiluong;
    String mausac;
    
    Apple(){}
    Apple (String a, double b, String c)
    {
        a = id;
        b = khoiluong;
        c = mausac;
    }

    public void nhapthongtin ()
    {
        System.out.println("Nhap ma: ");
        id = in.next();
        System.out.println("Nhap khoi luong: ");
        khoiluong = in.nextDouble();
        System.out.println("Nhap mau sac: ");
        mausac = in.next();    
        in.nextLine();
    }
    public void xuatthongtin ()
    {
        System.out.println("Id: "+id+"\nKhoi luong: "+khoiluong+"\nMau sac: "+mausac);
        
    }
}

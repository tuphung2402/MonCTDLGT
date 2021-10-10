package com.tutnm2004110018.tuan4;
import java.util.Scanner;

public class sp 
{
    String tensp;
    double gia;
    int nhap;
    Scanner n = new Scanner(System.in);

    sp(String t, double g)
    {
        tensp = t;
        gia = g;
    }
    void inThongTin()
    {
        System.out.println("Tên sản phẩm: " + tensp);
        System.out.println("Giá: " +gia);
        System.out.println("__________________________________");
    }
    
}
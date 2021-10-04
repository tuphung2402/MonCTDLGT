package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class nhanvienTestDrive 
{
    public static void main(String[] args) 
    {
        
    
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nhan vien:");
        int n = in.nextInt();
        nhanvien[] nv = new nhanvien[n];
        for (int i = 0;i<n;i++)
        {
            nv[i]= new nhanvien();
            System.out.println("Nhap thong tin nhan vien thu "+(i+1)+" :");
            nv[i].inthongtin();
        }
        System.out.println("Thong tin nhan vien la: \n");
        for (nhanvien navi: nv)
        {
            navi.xuatthongtin();
            System.out.println("*-------------------------------------------------------*");
        }

    }
    
}

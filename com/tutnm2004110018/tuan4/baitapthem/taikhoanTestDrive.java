package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class taikhoanTestDrive 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguoi:");
        int n = in.nextInt();
        taikhoan[] tk = new taikhoan[n];
        for (int i = 0;i<n;i++)
        {
            tk[i]= new taikhoan();
            System.out.println("Nhap nguoi thu "+(i+1)+" :");
            tk[i].inthongtin();
        }
        System.out.println("Thong tin cac tai khoan la: \n");
        for (taikhoan tako: tk)
        {
            tako.xuatthongtin();
            System.out.println("*-------------------------------------------------------*");
        }
        
    }
    
}

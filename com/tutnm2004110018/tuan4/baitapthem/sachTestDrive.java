package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class sachTestDrive
{
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so sach:");
        int n = in.nextInt();
        sach[] sach = new sach[n];
        for (int i = 0;i<n;i++)
        {
            sach[i]= new sach();
            System.out.println("Nhap cuon sach thu "+(i+1)+" :");
            sach[i].inthongtin();
        }
        System.out.println("Thong tin sach la: \n");
        for (sach book: sach)
        {
            book.xuatthongtin();
            System.out.println("*-------------------------------------------------------*");
        }

        
    }
    
}

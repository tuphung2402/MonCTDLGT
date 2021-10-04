package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class maytinhTestDrive 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguoi: ");
        int n = in.nextInt();
        maytinh[] maytinh = new maytinh[n];
        for (int i = 0;i<n;i++)
        {
            maytinh[i]= new maytinh();
            System.out.println("Nhap nguoi thu "+(i+1)+" :");
            maytinh[i].inthongtin();
        }
        System.out.println("Thong tin da nhap la: \n");
        for (maytinh mt: maytinh)
        {
            mt.xuatthongtin();
            System.out.println("*-------------------------------------------------------*");
        }

        
    }
    
}

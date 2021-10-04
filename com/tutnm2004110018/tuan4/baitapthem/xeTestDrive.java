package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class xeTestDrive 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguoi can nhap: ");
        int n = in.nextInt();
        xe[] xe = new xe[n];
        for (int i = 0;i<n;i++)
        {
            xe[i]= new xe();
            System.out.println("Nhap nguoi thu "+(i+1)+" :");
            xe[i].inthongtin();
        }
        System.out.println("Thong tin xe la: \n");
        for (xe car: xe)
        {
            car.xuatthongtin();
            System.out.println("*-------------------------------------------------------*");
        }
        
    }
    
}

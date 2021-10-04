package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class cowTestDrive 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so bo:");
        int n = in.nextInt();
        cow[] cow = new cow[n];
        for (int i = 0;i<n;i++)
        {
            cow[i]= new cow();
            System.out.println("Nhap bo thu "+(i+1)+" :");
            cow[i].inthongtin();
        }
        System.out.println("Thong tin bo la: \n");
        for (cow bo: cow)
        {
            bo.xuatthongtin();
            System.out.println("*-------------------------------------------------------*");
        }
        
        
    }
    
}

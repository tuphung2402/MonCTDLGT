package com.tutnm2004110018.tuan2;
import java.util.Scanner;
public class lab2bai1
{
    public static void main(String[] args) 
    {
        System.out.println("Nhap a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Nhap b");
        int b = in.nextInt();
        if (a == 0)
        {
            if ( b == 0)
            {
                System.out.println("phuong trinh co vo so nghiem");
            }
            else
            {
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else
        {
            float x = (float) -b/a;
            System.out.printf("Nghiem x = %.2f",x);
        }
        
    }
    
}
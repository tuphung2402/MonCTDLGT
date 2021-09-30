package com.tutnm2004110018.tuan3;
import java.util.Scanner;
public class lab3bai1
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = in.nextInt();
        int dem = 0;

        for ( int i = 1; i <= n; i++)
        {
            if (n%i == 0)
            {
                dem++;
            }

        }
        
        if (dem == 2)
        {
            System.out.println("Day la so nguyen to");
        }
        else 
        {
            System.out.println("Day khong phai la so nguyen to");
        }

    
        in.close();
    }
    

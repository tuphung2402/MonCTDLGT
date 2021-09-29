package com.tutnm2004110018.tuan1;
import java.util.Scanner;
public class lab1bai4
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = in.nextInt();
        System.out.println("Nhap b");
        int b = in.nextInt();
        System.out.println("Nhap c");
        int c = in.nextInt();
        double delta = b*b - 4*a*c;
        if (delta >= 0)
        {
            System.out.println("Delta = "+delta);
            System.out.println("Can delta = " + Math.sqrt(delta));
        }
        else
        {
            System.out.println("Delta = "+delta);
        }
        
    }
    
}

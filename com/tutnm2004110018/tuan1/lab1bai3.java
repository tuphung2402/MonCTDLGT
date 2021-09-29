package com.tutnm2004110018.tuan1;
import java.util.Scanner;
public class lab1bai3 
{
    public static void main(String[] args) 
    {
        System.out.println("Nhap canh");
        Scanner in = new Scanner(System.in);
        int canh = in.nextInt();
        double v = Math.pow(canh, 3);
        System.out.println("The tich = "+v);
        
        
    }
    
}

package com.tutnm2004110018.tuan2;
import java.util.Scanner;
public class lab2bai3
{
    public static void main(String[] args) 
    {
        System.out.println("Nhap so dien cua thang");
        Scanner in = new Scanner(System.in);
        double tien;
        int dien = in.nextInt();
        if ( dien > 0 && dien < 50 )
        {
            tien = dien*1000;

        }
        else
        {
            tien = 50*1000 + (dien - 50)*1200;
        }
        System.out.println("So tien la "+ tien);
    }
    
}

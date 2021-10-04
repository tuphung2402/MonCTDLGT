package com.tutnm2004110018.tuan4.baitapthem;
import java.util.Scanner;
public class cow 
{
    Scanner in = new Scanner(System.in);
    double weight;
    cow(){}
    cow (Double a)
    {
        a = weight;
    }
    public void inthongtin ()
    {
        System.out.println("Nhap ten chu tai khoan: ");
        weight = in.nextDouble();
              
        in.nextLine();
    }

    public void xuatthongtin ()
    {
        System.out.println("Can nang: "+weight);
        
    }

    
}

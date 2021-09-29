package com.tutnm2004110018.tuan1;
import java.util.Scanner;
public class lab1bai2
{   
    public static void main(String[] args) 
    {  
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chieu dai ");
        int dai = in.nextInt();
        System.out.println("Nhap chieu rong ");
        int rong = in.nextInt();
        int min = Math.min(dai, rong);
        double chuvi = (dai+rong)*2;
        double s= dai*rong;
        System.out.println("Chu vi = "+chuvi+" Dien tich = "+s+ " Canh nho nhat "+min);


    
    }
    
    
}

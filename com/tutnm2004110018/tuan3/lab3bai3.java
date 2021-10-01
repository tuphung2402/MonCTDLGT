package com.tutnm2004110018.tuan3;
import java.util.Arrays;
import java.util.Scanner;
public class lab3bai3
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int phantu = in.nextInt();
        int [] a = new int[phantu];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0;i < phantu; i++)
        
        {
            System.out.println("Nhap phan tu so ["+i+"]: ");
            a[i] = in.nextInt();

        }
        Arrays.sort(a);
        System.out.println("Mang da duoc sap xep la: ");
        for(int i = 0;i < phantu;i++)
        {
            System.out.printf("%d ; ", a[i]);
        }

        int min = a[0];
        for (int i = 0; i <phantu;i++)
        {
            if (min > a[i])
            {
                min = a[i];

            }

        }
        System.out.println("\nPhan tu nho nhat trong mang la: "+min);

        int count = 0;
        int s = 0;

        for (int i = 0; i < phantu;i++)
        {
            if (a[i]%3 ==0)
            {
                s = s + a[i];
                count ++;
            }

        }
        double kq = s/count;
        System.out.println("Ket qua: "+kq);


        
    }
    
}

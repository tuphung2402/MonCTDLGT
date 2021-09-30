package com.tutnm2004110018.tuan3;
import java.util.Scanner;
public class lab3bai2 
{
    public static void main(String[] args) 
    {   
        System.out.println("Nhap x");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
    
        for (int i = 0; i < 11; i++)
        {
            System.out.printf("%d * %d = %d",x,i,x*i);
            System.out.printf("\n");
        }

        System.out.println("Cac bang cuu chuong tu 1 den 10");
        System.out.println("+------------------------------------------+");
        for (int j =  1; j < 11; j++)
        {
            for (int i = 0; i <= 10; i++ )
            {
                System.out.printf("%d * %d = %d\n",j,i,j*i);
            }
            System.out.println("+------------------------------------------+");
        }

        
    }
    
}

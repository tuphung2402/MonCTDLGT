package com.tutnm2004110018.tuan2;
import java.util.Scanner;
public class lab2bai2
{
    public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = in.nextInt();
        System.out.println("Nhap b");
        int b = in.nextInt();
        System.out.println("Nhap c");
        int c = in.nextInt();
        if ( a==0 )
        {
            if (b == 0 )
            {
                if ( c == 0 )
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
                float x = (float) -c/b;
                System.out.printf("Nghiem x = %.2f",x);
            }
              
        }
        else
        {
            double delta = b*b - 4*a*c;
            if(delta > 0)
            {
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                float x1 = (float)(-b + Math.sqrt(delta))/2*a;
                System.out.printf("+ x1 = %.2f", x1);
                float x2 = (float)(-b - Math.sqrt(delta))/2*a;
                System.out.printf("+ x2 = %.2f", x2);
            }
            else
            {
                if(delta < 0)
                    System.out.printf("Phương trình vô nghiệm");
                else
                {
                    float x0 = (float)-b/2*a;
                    System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", x0);
                }
            }
        }
        
    }
    
}

package com.tutnm2004110018.tuan3;
import java.util.Arrays;
import java.util.Scanner;
public class lab3bai4 
{
    public static void main(String[] args) 
    {
        System.out.println("Nhap so sinh vien: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String hoten [] = new String[n];
        double diem [] = new double[n];
        for (int i =0;i<n;i++ )
        {
            System.out.println("Nhap sinh vien so "+i+": ");
            hoten[i]= in.nextLine();
            System.out.println("Diem: ");
            diem[i]=in.nextDouble();
            if (diem[i]>10)
            {
            System.out.println("Nhap diem khong dung");
                break;
        
            }
        }



        for (int i = 0; i<n;i++)
        {
            System.out.println("Ho va ten sinh vien so "+i+"la: " +Arrays.toString(hoten));
            System.out.println("Diem: "+Arrays.toString(diem));
            if (diem[i]<5)
            {
                System.out.println("Hoc luc: Yeu");

            }
            if (diem[i]<=5 && diem[i]<6.5)
            {
                System.out.println("Hoc luc: Trung binh");
    
            }
            if (diem[i]>=6.5 && diem[i]<7.5)
            {
                System.out.println("Hoc luc: Kha");

            }
            if (diem[i]>= 7.5 && diem[i]<9)
            {
                System.out.println("Hoc luc: Gioi");

            }
            if (diem[i]>=9 && diem[i]<=10)
            {
                System.out.println("Hoc luc: Xuat sac");
            }
        }
        

        
    }
    
}

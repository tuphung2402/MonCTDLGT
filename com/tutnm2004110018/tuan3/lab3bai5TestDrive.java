package com.tutnm2004110018.tuan3;
import java.util.Scanner;
public class lab3bai5TestDrive 
{
    public static void main(String[] args) 
    {
        lab3bai5[] sv = new lab3bai5[2];
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap danh sach sinh vien: ");
        for (int i = 0;i<sv.length;i++)
        {
            System.out.println("Sinh vien thu "+(i+1)+" : ");
            System.out.println("Ho va ten: ");
            String hoten = in.nextLine();
            //in.nextLine();
            System.out.println("Ma so sinh vien: ");
            String mssv = in.nextLine();
            //in.nextLine();
            System.out.println("Tuoi: ");
            int tuoi = in.nextInt();
            //in.nextLine();
            System.out.println("Que quan:");
            String que = in.nextLine();
            in.nextLine();
            sv[i] = new lab3bai5(mssv,hoten,tuoi,que);
            
            
        }

        System.out.println("Danh sach da nhap la: ");
        
        for (lab3bai5 sinhvien: sv)
        {
            sinhvien.inthongtin();
        }

        
        
    }
}

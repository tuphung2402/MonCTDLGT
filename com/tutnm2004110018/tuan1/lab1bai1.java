package com.tutnm2004110018.tuan1;
import java.util.Scanner;
public class lab1bai1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: "); 
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: "); 
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
        System.out.print("HS: " + hoTen + " Diem: " + diemTB);
        System.out.println("HS: "+hoTen);
        System.out.println("Diem: "+ diemTB);


 

    }
    
}

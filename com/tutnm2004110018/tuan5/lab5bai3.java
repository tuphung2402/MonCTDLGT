package com.tutnm2004110018.tuan5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class lab5bai3
{
    static Scanner nhap = new Scanner(System.in);
    static ArrayList<sp> DSSP = new ArrayList<>();
    static double gia;
    public static void main(String[] args)
    {

        int c;
        do
        {
            System.out.println("=====================================================");
            System.out.println("    1. Nhập danh sách sản phẩm.");
            System.out.println("    2. Sắp xếp tăng dần theo giá và xuất ra màn hình.");
            System.out.println("    3. Tìm và xóa sản phẩm.");
            System.out.println("    4. Xuất giá trung bình của các sản phẩm.");
            System.out.print("- Nhập vào sự lựa chọn(1->4): ");
            c = nhap.nextInt();
            switch(c)
            {
                case 1: nhap(); break;
                case 2: sapXepVaXuat(); break;
                case 3: timVaXoa(); break;
                case 4: xuatGiaTriTB(); break;
                default: System.out.println("-Lựa chọn không hợp lệ!");
            }
            System.out.print("- Quay lại MENU(1:yes/0:no): ");
            c = nhap.nextInt();
        }
        while(c == 1);

    } 
    static void nhap()
    {
        int n;
        String ten;
        do
        {
            nhap.nextLine();
            System.out.print("Nhập tên sản phẩm: ");
            ten = nhap.next();
            System.out.print("Nhập giá: ");
            gia = nhap.nextDouble();
            System.out.println("==================================");
            sp sp = new sp(ten, gia);
            DSSP.add(sp);
            System.out.print("nhập thêm? 1/0? có = 1, không = 0 ");
            n = nhap.nextInt();
        }
        while(n == 1);
        
    }  
    static void sapXepVaXuat()
    {
        Comparator<sp> comparator = new Comparator<sp>()
        {

            public int compare(sp o1, sp o2)
            {

                return Double.compare(o1.gia, o2.gia);
            }
            
        };
        Collections.sort(DSSP, comparator);
        System.out.println("============================================");
        for(sp x : DSSP)
        {
            x.inThongTin();
        }

    }
    static void timVaXoa()
    {
        System.out.print("Nhập tên sản phẩm muốn xóa: ");
        nhap.nextLine();
        String ten = nhap.next();
        for(sp x : DSSP){
           if((x.tensp).equals(ten))
           {   DSSP.remove(x); 
               System.out.println("Xóa thành công!");
               break;
           }
        }
        System.out.println("==============================");
        for(sp x : DSSP)
        {
             x.inThongTin();
        }
    }
    static void xuatGiaTriTB()
    {
        double tong = 0;
        for(sp x : DSSP)
        {
            tong += x.gia;
        }
        System.out.println("Giá trị trung bình: "+tong/DSSP.size());
    }
}
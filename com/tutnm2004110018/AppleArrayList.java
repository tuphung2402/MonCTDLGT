package com.tutnm2004110018.kiemtragiuaky;
import java.util.ArrayList;
import java.util.Scanner;
public class AppleArrayList
{   private static final Apple[] Apple = null;
static Scanner in = new Scanner(System.in);
    static ArrayList<Apple> ds = new ArrayList<>();
    public static void main(String[] args) 
    {

        int c;
            System.out.println("-------------------------------------------------------------");
            System.out.println("    1. Nhập danh sách");
            System.out.println("    2. Tìm kiếm");
            System.out.println("    3. Xóa sản phẩm.");
            System.out.print("      Nhập lựa chọn: ");
            c = in.nextInt();
            switch(c)
            {
                case 1: nhap(); break;
                case 2: tim(); break;
                case 3: xuat(); break;
                default: System.out.println("Lua chon khong dung");
            }


    }
    static void nhap()
    {
        int n;
        String id;
        double khoiluong;
        String mausac;
        do
        {
            in.nextLine();
            System.out.print("Nhap id: ");
            id = in.next();
            System.out.print("Nhap khoi luong: ");
            khoiluong = in.nextDouble();
            System.out.println("Nhap mai sac: ");
            mausac = in.next();
            Apple Apple = new Apple(id, khoiluong, mausac);
            ds.add(Apple);
            System.out.print("Nhap them khong? 1=Yes or 0=No ");
            n = in.nextInt();
        }
        while(n == 1);
        
    }  

    static void tim(){
        System.out.print(" Nhap mau sac can tim: ");
        in.nextLine();
        String mausac = in.nextLine();
        for(Apple x: Apple )
        {
                if(x.mausac.contains(mausac))
                {
                        System.out.println("--------------------------------");
                        System.out.println("Thong tin tao cam tim: ");
                        x.xuatthongtin();
                }
        }  
    }

    static void xuat()
    {
        for(Apple x : Apple)
        {
            x.xuatthongtin();
        }
    }

    
}

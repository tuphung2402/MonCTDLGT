package com.tutnm2004110018.tuan4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class lab4bai2
{
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> ds = new ArrayList<String>();
    public static void main(String[] args) 
    {
        System.out.println("+---------------------------------+");
        System.out.println("    1.Nhập danh sách họ tên ");
        System.out.println("    2.Xuất danh sách vừa nhập ");
        System.out.println("    3.Xuất danh sách ngẫu nhiên ");
        System.out.println("    4.Sắp xếp giảm dần và xuất danh sách ");
        System.out.println("    5.Tìm và xóa họ tên nhập từ bàn phím ");
        System.out.println("    6.Kết thúc ");
        System.out.println("+---------------------------------+");
        System.out.println("Mời bạn chọn ");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        
        switch(c)
        {
            case 1: nhapds();
                break;
            case 2: xuatds();
                break;
            case 3: xuatdsrandom();
                break;
            case 4: ssapxepandxuatds();
                break;
            case 5: xoa();
                break;
            case 6: break;
            default: System.out.println("Lựa chọn không đúng!");
        }
            
    }
        static void nhapds()
        {
            while(true){
                System.out.print("Nhập họ và tên: ");
                in.nextLine();
                String hoten = in.next();
                ds.add(hoten);
                System.out.print("Nhập thêm không? yes or no?: ");
                String a = in.next();
                if(a.equals("no"))
                    break; 
            }
        }
        static void xuatds()
        {
            for(String x : ds)
            {
                System.out.printf("Họ và tên: %s\n", x);
                System.out.println("*------------------------------------------------*");
            }
        }
        static void xuatdsrandom()
        {
            Collections.shuffle(ds);
            xuatds();
        }
        static void ssapxepandxuatds()
        {
            Collections.sort(ds);
            Collections.reverse(ds);
            xuatds();
        }
        static void xoa()
        {
            for(String danhsach: ds)
            {
                System.out.println("Nhập tên: ");
                String hoten = in.next();
                if(danhsach == hoten)
                {
                    ds.remove(hoten);
                }
            }
    }    

    
    
}

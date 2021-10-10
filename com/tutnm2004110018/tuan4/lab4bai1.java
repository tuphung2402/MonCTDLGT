package com.tutnm2004110018.tuan4;
import java.util.ArrayList;
import java.util.Scanner;

public class lab4bai1 
{
    public static void main(String[] args) 
    {
        double a;
        String b;
        double tong = 0;
        Scanner n = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true)
        {
            System.out.printf("Nhập phần tử thứ %d: ", list.size());
            a = n.nextDouble();
            list.add(a);
            n.nextLine();
            System.out.println("Nhập thêm không? (Y/N): ");
            b = n.nextLine();
            if(b.equals("N"))
                 break;
        }
        System.out.println("--------------------------");
        for(Double x : list){
            System.out.printf("+ %.2f\n", x);
            tong += x;
        }
        System.out.println("Tổng các phần tử là: " + tong);
        n.close();
    }

    
}
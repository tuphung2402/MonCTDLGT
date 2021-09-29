package com.tutnm2004110018.tuan2;
import java.util.Scanner;
public class lab2bai4 
{
    public static void main(String[] args) 
    {
        System.out.println("+---------------------------------+");
        System.out.println("    1.Giải phương trình bậc nhất ");
        System.out.println("    2.Giải phương trình bậc 2 ");
        System.out.println("    3.Tính tiền điện ");
        System.out.println("    4.Kết thúc");
        System.out.println("+---------------------------------+");
        Scanner in = new Scanner(System.in);
        System.out.println("Mời bạn chọn ");
        int c = in.nextInt();
        
        switch (c)
        {
            case 1: giaiPTBac1();
                break;
            case 2: giaiPTBac2();
                break;
            case 3: tinhTienDien();
                break;
            case 4: exit(0);
            default: System.out.println("Lựa chọn không có trong menu");
            

        }
    }

    private static void exit(int i) {
    }

    public static void giaiPTBac1() 
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Nhập a = ");
            int a = in.nextInt();
            System.out.print("Nhập b = ");
            int b = in.nextInt();
            if(a == 0){
                if(b == 0)
                    System.out.print("Phương trình vô số nghiệm");
                else 
                    System.out.print("Phương trình vô nghiệm");
            } 
            else{
                double x = (double)-b/a;
                System.out.printf("Nghiệm của phương trình %dx + %d = 0 là %.2f", a, b, x);
            }
        }
        public static void giaiPTBac2()
        {
            double x1, x2, delta;
            Scanner in = new Scanner(System.in);
            System.out.print("Nhập a = ");
            int a = in.nextInt();
            System.out.print("Nhập b = ");
            int b = in.nextInt();
            System.out.print("Nhập c = ");
            int c = in.nextInt();
            if(a == 0){
                if(b == 0){
                    if(c == 0)
                        System.out.print("Phương trình vô số nghiệm.");
                    else
                        System.out.print("Phương trình vô nghiệm");
                }
                else{
                    x1 = (double)-c/b;
                    System.out.printf("Phương trình có nghiệm là x = %.2f", x1);
                }
            }
            else{
                delta = Math.pow(b, 2) - 4*a*c;
                if(delta > 0){
                    System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                    x1 = (double)(-b + Math.sqrt(delta))/2*a;
                    System.out.printf("+ x1 = %.2f", x1);
                    x2 = (double)(-b - Math.sqrt(delta))/2*a;
                    System.out.printf("+ x2 = %.2f", x2);
                }
                else{
                    if(delta < 0)
                        System.out.printf("Phương trình vô nghiệm");
                    else{
                        x1 = x2 = (double)-b/2*a;
                        System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", x1);
                    }
                }
            } 
        }

        public static void tinhTienDien()
        {
            int tien;
            Scanner in = new Scanner(System.in);
            System.out.print("Số điện sử dụng trong tháng là: ");
            int dien = in.nextInt();
            if(dien < 50){
                tien = dien*1000;
                System.out.printf("Số tiền điện là %d", tien);
            }
            else{
                tien = 50*1000 + (dien - 50)*1200;
                System.out.printf("Số tiền điện là %d", tien);
            }
                
        }
}

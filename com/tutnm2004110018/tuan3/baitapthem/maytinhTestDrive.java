package com.tutnm2004110018.tuan3.baitapthem;

public class maytinhTestDrive
{
    public static void main(String[] args) 
    {
        maytinh mt;
        mt = new maytinh();
        mt.nhasanxuat = "Asus";
        mt.nam = 2015;
        mt.he = "Window";
        mt.gia = 10000000;
        mt.ram = "8Gb";
        mt.cpu = "Chip Intel Core i5";
        mt.nambh = 3;
        System.out.println("\nNha san xuat: "+mt.nhasanxuat+"\nNam san xuat: "+mt.nam+"\nHe dieu hanh: "+mt.he+"\nGia: "+mt.gia+"\nRam: "+mt.ram+"\nCPU: "+mt.cpu+"\nNam bao hanh: "+mt.nambh);
        
    }
    
}

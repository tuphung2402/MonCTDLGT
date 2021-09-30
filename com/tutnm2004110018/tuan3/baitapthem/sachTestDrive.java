package com.tutnm2004110018.tuan3.baitapthem;

public class sachTestDrive
{
  
    public static void main(String[] args) 
    {
        sach sach;
        sach = new sach();
        sach.xuatban = "Phuong Nam";
        sach.nam = 2012;
        sach.gia = 55000;
        sach.sl = 3;
        sach.loai = "Hanh dong";
        System.out.println("\nNha xuat ban " + sach.xuatban + "\nNam: " + sach.nam + "\nGia: "+sach.gia + "\nSo luong: "+sach.sl+"\nThe loai: "+sach.loai);

        
        
    }
    
}

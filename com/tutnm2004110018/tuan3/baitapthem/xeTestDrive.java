package com.tutnm2004110018.tuan3.baitapthem;

public class xeTestDrive 
{
    public static void main(String[] args) 
    {
        xe x;
        x = new xe();
        x.chu = "Tran Ngoc Minh Tu";
        x.hang = "Toyota";
        x.dong = "Vios";
        x.giay = "Co";
        x.xang = "42 lit";
        System.out.println("\nTen chu xe: "+x.chu+"\nHang xe: "+x.hang+"\nDong xe: "+x.dong+"\nGiay phep lai xe: "+x.giay+"\nDung tich xang: "+x.xang);
    }

    
}

package com.tutnm2004110018.tuan3.baitapthem;

public class nhanvienTestDrive
{
    public static void main(String[] args) 
    {
        nhanvien nv;
        nv = new nhanvien();
        nv.ten = "Tran Ngoc Minh Tu";
        nv.sinh = " 24 - 02 - 2002";
        nv.bophan = "Nhan vien hanh chinh";
        nv.luong = 10000000;
        nv.diachi = "123 duong a, phuong b, quan c";
        System.out.println("\nHo va ten: " + nv.ten + "\n Ngay sinh: " + nv.sinh + "\nBo phan lam viec: " + nv.bophan + "\nLuong:" + nv.luong + "\nDia chi: " +nv.diachi);

        
    }
    
}

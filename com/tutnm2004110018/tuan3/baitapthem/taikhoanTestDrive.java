package com.tutnm2004110018.tuan3.baitapthem;

public class taikhoanTestDrive
{
    public static void main(String[] args) 
    {
        taikhoan tk;
        tk = new taikhoan();
        tk.tenchutaikhoan = "Tran Ngoc Minh Tu";
        tk.sotaikhoan = 2004110018;
        tk.sodu = 0;
        System.out.println("\nTen chu tai khoan: "+tk.tenchutaikhoan+"\nSo tai khoan: "+tk.sotaikhoan+"\nSo du: "+tk.sodu);
        
    }
    
}

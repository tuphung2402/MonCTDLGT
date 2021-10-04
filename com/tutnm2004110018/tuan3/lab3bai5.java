package com.tutnm2004110018.tuan3;

public class lab3bai5 
{
    String mssv;
    String hoten;
    int tuoi;
    String que;

    lab3bai5(){}

    lab3bai5 (String a, String b, int c, String d )
    {
        mssv = a;
        hoten = b;
        tuoi = c;
        que = d;
    }
    

    void inthongtin ()
    {
        System.out.println("Ma so sinh vien: "+mssv+"\nHo va ten: "+hoten+"\nTuoi: "+tuoi+"\nQue: "+que);
        

    }
}

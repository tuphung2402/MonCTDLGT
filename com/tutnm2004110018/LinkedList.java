package com.tutnm2004110018.kiemtragiuaky;
import java.util.Scanner;

public class LinkedList 
{
    Node head = null;
    Node tail = null;
    Scanner in = new Scanner(System.in);


    public LinkedList(){}

    void addTail(int data)
    {
        Node NewNode = new Node(data);

        if(head == null){
            head = NewNode;
            tail = NewNode;
        }else{
            tail.next = NewNode;
            tail = NewNode;
        }
    }
    void addHead(int data)
    {
        Node NewNode = new Node(data);

        if(head == null)
        {
            head = NewNode;
            tail = NewNode;
        
        }
        else
        {
            NewNode.next = head;
            head = NewNode;
        }
    }
    void removeTail()
    {
        Node tam = head;
        if(head == null){
            System.out.println("Danh sach trong ");
            return;
        }
        while(tam != null)
        {
            if(tam.next == tail)
            {
                tail = tam;
                tail.next = null;
                return;
            }
            tam = tam.next;
        }
    }
    
    
}

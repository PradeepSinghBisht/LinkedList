package com.company;

import java.util.Scanner;

public class MiddleElementInLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void displayMiddleElement(int position){
        Node current = head;
        if (head == null){
            System.out.println("Empty");
        }
        else {
            for (int i = 0; i < position; i++){
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MiddleElementInLinkedList s = new MiddleElementInLinkedList();
	    int t = scanner.nextInt();
	    for (int i = 0; i < t; i++){
	        int size = scanner.nextInt();
            getMiddle(s , size);
        }
    }
    public static void getMiddle(MiddleElementInLinkedList s, int size){
        for (int i = 0; i < size; i++){
            s.addNode(scanner.nextInt());
        }
        int position = (size / 2) + 1;
        s.displayMiddleElement(position - 1 );
    }
}

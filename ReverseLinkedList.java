package com.company;

import java.util.Scanner;

public class ReverseLinkedList {
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
    public void reverseList(){
        Node current = head;
        Node previous = null;
        while (current != null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        head = previous;
    }
    public void display(){
        Node current = head;
        if (head == null){
            System.out.println("Empty");
        }
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ReverseLinkedList reverse = new ReverseLinkedList();
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int size = scanner.nextInt();
            for (int j = 0; j < size; j++){
                reverse.addNode(scanner.nextInt());
            }
            reverse.reverseList();
            reverse.display();
        }
    }
}

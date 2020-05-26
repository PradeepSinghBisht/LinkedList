package com.company;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void delete(int data){
        Node current = head;
        Node previous = head;
        if (head == null){
            System.out.println("Empty");
        }
        else {
            while (current.data != data){
                previous = current;
                current = current.next;
            }
            if (current == head){
                head = current.next;
            }
            previous.next = current.next;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.addNode(15);
        s.addNode(20);
        s.addNode(1);
        s.delete(15);
        s.display();
    }
}

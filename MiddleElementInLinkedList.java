/*
Given a singly linked list of N nodes. The task is to find the middle of the linked list. For example, if given linked list is 1->2->3->4->5 then the output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print the second middle element. For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.

Input:
The first line of input contains the number of test cases T. For each test case, the first line of input contains the length of the linked list and the next line contains data of nodes of the linked list.

Output:
For each test case, there will be a single line of output containing data of the middle element of the linked list.

User Task:
The task is to complete the function getMiddle() which takes a head reference as the only argument and should return the data at the middle node of the linked list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 100

Example:
Input:
2
5
1 2 3 4 5
6
2 4 6 7 5 1

Output:
3
7

Explanation:
Testcase 1: Since there are 5 elements, therefore 3 is the middle element at index 2 (0-based indexing).
package com.company;
*/

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

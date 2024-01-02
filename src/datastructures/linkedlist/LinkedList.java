package datastructures.linkedlist;

import org.w3c.dom.Node;

public class LinkedList {
    // Declare private instance variables
    private Node head;
    private Node tail;
    private int length;

    // Declare a Node inner class
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    // Constructor for initializing the linked list with a value
    public LinkedList(int value) {
        // Create a new node called newNode with the given value,
        // and point both the head and tail at it
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1; // The length of the list is 1
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head; // read: newNode.next -> to head  [node set to head]
            head = newNode;  // head -> newNode
        }
        length++;
    }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}

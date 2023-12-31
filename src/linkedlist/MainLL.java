package datastructures.linkedlist;

public class MainLL {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.printAll();

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());


    	/*
        	EXPECTED OUTPUT:
        	----------------
        	1
        	2
        	2
        	1
        	null

     	*/

    }

}
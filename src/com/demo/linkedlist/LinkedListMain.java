package com.demo.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Search for node");
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.display();
		list.search(30);
	}
}

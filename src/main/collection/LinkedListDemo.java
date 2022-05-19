package main.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList foodList = new LinkedList();
		foodList.add("briyani");
		foodList.add("tandoori chicken");
		foodList.addLast("idli");
		foodList.addFirst("kabab");
		
		System.out.println(foodList);
		System.out.println(foodList.getFirst());
		System.out.println(foodList.getLast());
		System.out.println(foodList.removeFirst());
		System.out.println(foodList);

	}

}

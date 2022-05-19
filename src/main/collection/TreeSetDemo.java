package main.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet foodSet = new TreeSet();
		
		foodSet.add("C");
		foodSet.add("X");
		foodSet.add("A");
		foodSet.add(null);
//		foodSet.add(10);
		System.out.println(foodSet);
	}

}

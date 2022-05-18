package main.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(12);
		al.add(true);
		al.add("dosa");
		al.add(12);//duplication allowed
		//		al.clear();//
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		System.out.println(al.contains("pizzA"));
		System.out.println(al);


	}

}

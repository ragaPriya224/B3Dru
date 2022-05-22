package main.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] s = {"ankit" ,"purna","supriya","ganesh"};
		//for(String i:s) {
		//	System.out.println(i);
		//}


		ArrayList al = new ArrayList();
		al.add("bharath");
		al.add("poojesh");
		al.add("shubham");
		al.add("chandrakala");
		al.add(5);
		//		for(Object s: al) {
		//			System.out.println(s);
		//		}
		Iterator i = al.iterator();
		System.out.println(i);
		while(i.hasNext()) {
			//		
			if(i.next().equals(5)) {
				i.remove();
			}else {
				//				System.out.println(i.next());
			}

		}
		System.out.println(al);

	}
	//read, remove operation
	//hasNext(),next(), remove()
	//Limitation:: do read, remove.. not able to replace, addnew obj

}
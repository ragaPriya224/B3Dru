package main.collection;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet snacksSet = new HashSet();
		snacksSet.add("lays");
		snacksSet.add("icecream");
		snacksSet.add("biscuit");
		HashSet vehicleSet = new HashSet(snacksSet);
		vehicleSet.add("A");
		vehicleSet.add("C");
		vehicleSet.add("X");
		vehicleSet.add(null);
		vehicleSet.add(10);
		System.out.println(vehicleSet.add("X"));
		System.out.println(vehicleSet);
	}

}

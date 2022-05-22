package main.collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap foodMap = new HashMap<>();
		foodMap.put("noodles", 50);
		foodMap.put("bread", 40);
		foodMap.put("chickenBurger", 90);
		foodMap.put("omlette", 10);
		System.out.println(foodMap);
		System.out.println(foodMap.keySet());
		System.out.println(foodMap.values());
		System.out.println(foodMap.entrySet());
//		System.out.println(foodMap.containsKey("dosa"));
		System.out.println(foodMap.put("omlette", 20));
		System.out.println(foodMap);
	}

}

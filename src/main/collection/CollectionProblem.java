package main.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionProblem {

	public static void main(String[] args) {
		String text = "bharath";
		char[] charArray = text.toCharArray();
		HashMap<Character,Integer> characterMap = new HashMap();
		//		int variable = 1;
		for (char c : charArray) {

			if(characterMap.containsKey(c)){
				characterMap.put(c, characterMap.get(c)+1);
			}else {
				characterMap.put(c, 1);
			}
		}
		System.out.println(characterMap);
		Set<Entry<Character, Integer>> data = characterMap.entrySet();
		for( Entry<Character, Integer>characterData:data ) {
			if(characterData.getValue()>1) {
				System.out.println("duplicate is : " +characterData);
			}
		}
	}
	//	character, no of times
	//key->character
	//value-> no of times
}

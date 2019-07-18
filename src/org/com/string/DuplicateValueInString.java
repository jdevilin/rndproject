package org.com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateValueInString {
	
	public static void main(String[] args) {
		
		printDuplicateCharacter("Sameeer");
	}
	
	private static void printDuplicateCharacter(String word) {
		char[] chrArray = word.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch :chrArray) {
			if(charMap.containsKey(ch))
				charMap.put(ch, charMap.get(ch)+1);
			else
				charMap.put(ch, 1);
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		 System.out.printf("List of duplicate characters in String '%s' %n", word);
	        for (Map.Entry<Character, Integer> entry : entrySet) {
	            if (entry.getValue() > 1) {
	                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
	            }
	        }
	}

}

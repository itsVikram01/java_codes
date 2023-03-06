package java_codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringCharOccurance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String : ");
		String input = sc.nextLine();
		sc.close();
		
		Map<Character, Long> charCount = input.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println("Character occurences in "+input);
		charCount.forEach((k, v) -> System.out.println(k+" : "+v));
		
		/*
		String str= "vikram kumar";  
	    str = str.replaceAll("\\s", ""); // remove all whitespace characters
        System.out.println("String without whitespace : "+str);
		
		Map<String, Long> result = Arrays
				.stream(str.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
		System.out.println(result);  
		*/
		
		String str1 = "abcdABCDabcd";
		char[] chars = str1.toCharArray();
		Map<Character, Integer> charsCount = new HashMap<>();
		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}
		System.out.println(charsCount); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
		
	    /*
	    TreeMap<Character, Integer> freq = new TreeMap<>();
	    for (int i=0; i<str.length(); i++) {
	        char c = str.charAt(i);
	        freq.put(c, freq.getOrDefault(c, 0) + 1);
	    }

	    System.out.println("str : " + str);
	    for (char c : freq.keySet()) {
	        System.out.println(c + " " + freq.get(c));
	    }
	    */
	    
        //characterCount(str);
	    
		/*
		HashMap <Character, Integer> result = new HashMap<>();  
		for (int i=str.length()-1; i>=0; i--) {  
			if(result.containsKey(str.charAt(i))) {  
				int count = result.get(str.charAt(i));  
				result.put(str.charAt(i), ++count);  
			} else {  
				result.put(str.charAt(i),1);  
			}  
		}  
		System.out.println(result);  
		*/ 
    }  
}

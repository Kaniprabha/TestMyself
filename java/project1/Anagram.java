package project1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean result = isAnagram("heart", "earth");
		System.out.println(result);

	}
	public static boolean isAnagram(String input1, String input2) {
		input1.replaceAll("//s", "");
		input2.replaceAll("//s", "");
		
		if(input1.length() != input2.length())
		return false;
	
		
		char[] charinput1 = input1.toCharArray();
		char[] charinput2 = input2.toCharArray();
		
		Arrays.sort(charinput1);
		Arrays.sort(charinput2);
		
		return Arrays.equals(charinput1, charinput2);
		
	}

}

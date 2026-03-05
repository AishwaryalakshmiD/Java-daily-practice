package programs;

import java.util.Arrays;

public class Anagram {
	
	public static String isAnagram(String s1, String s2) {
		
		if(s1.length()==s2.length()) {
			
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			
		return (Arrays.equals(arr1, arr2))?"is anagram":"not a anagram";
		}
		else {
			return "not a anagram";
		}
	}

	public static void main(String[] args) {
		String s1 ="listen";
		String s2 ="silent";
		
		System.out.println(isAnagram(s1, s2));
		
		
	}

}
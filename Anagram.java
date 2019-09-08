package kuchbhi.io;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1="viral";
		String str2="lariv";
		
		System.out.println(IsAnagram(str1,str2));
				

	}
	public static boolean IsAnagram(String str1,String str2) {
		
		char[] String1=str1.toCharArray();
		char[] String2=str2.toCharArray();
		
		Arrays.sort(String1);
		Arrays.sort(String2);
		
		if (String1.length==String2.length) {
			return Arrays.equals(String1, String2);
			
		}else {
			return false;   
		}
		
		
	}

	
	}
	

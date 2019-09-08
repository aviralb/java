package kuchbhi.io;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		String str="Aviral";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String sortedstring=new String(ch);
		System.out.println(sortedstring);
		

	}

}

package kuchbhi.io;

import java.util.HashSet;
import java.util.Set;


public class RemoveString {

	public static void main(String[] args) {
		
	
	
	String str="Aviraaaaal";  // take the string

	System.out.println(Remove(str));
	
	
	}

public static String Remove(String str){ //Create remove Method
    
    Set<Character> set =new HashSet<>(); //Create hash Set method
    
    StringBuffer sf =new StringBuffer();  //Create String Buffer For Editing Method
    
    for (int i=0;i<str.length();i++){     //
        
        Character c=str.charAt(i);
        
        if(!set.contains(c)){
            set.add(c);
            sf.append(c);
        }
        
    }
    return sf.toString();
}
}

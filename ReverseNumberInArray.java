package kuchbhi.io;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;;

public class ReverseNumberInArray {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Before Reversing "+list);
		
		Collections.reverse(list);
		
		System.out.println("After Reversing "+list);

	}

}

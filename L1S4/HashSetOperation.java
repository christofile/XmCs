package L1S4;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetOperation {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Lily");
		hs.add("Donnie");
		hs.add("Kevin");
		hs.add("Todd");
		
		System.out.println("Original HashSet:");
		System.out.println(hs);
		
		//a.  copy Set content to another HashSet.
		HashSet<String> hs2 = new HashSet<String>();
		for(String s:hs)
			hs2.add(s);
		
		System.out.println("Copied HashSet:");
		System.out.println(hs2);
		//b.  copy all elements from HashSet to an array.
		 String[] strArr = new String[hs.size()];
	     hs.toArray(strArr);
		
		System.out.println("Copied Array:");
		System.out.println(Arrays.toString(strArr));
			
		//c.  Compare two sets and retain elements which are same on both sets.
		HashSet<String> hs3 = new HashSet<String>();
		hs3.add("Lily");
		hs3.add("Aaron");
		hs3.add("Kevin");
		hs3.add("Todd");
        hs2.retainAll(hs3);
        System.out.println("HashSet content:");
        System.out.println(hs2);
		
		//d. eliminate duplicate user defined objects from HashSet.
        hs.add("Lily");
        System.out.println("Duplicate Lily:");
        System.out.println(hs);
        
	}
}

package L1S4;

import java.util.*;

public class ArrayListComparison {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Lily");
		al1.add("Donnie");
		al1.add("Kevin");
		al1.add("Todd");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Lily");
		al2.add("Aaron");
		al2.add("Miya");
		al2.add("Todd");
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		for(String s:al1) {
			al3.add(al2.contains(s)?"True":"False");
		}
		
        System.out.println(al3);
		//System.out.println(al);
		//System.out.println(al2);
		
	}
}

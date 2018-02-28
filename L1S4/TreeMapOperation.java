package L1S4;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOperation {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
		tm.put(1,"Lily");
		tm.put(12,"Donnie");
		tm.put(6,"Kevin");
		tm.put(8,"Todd");
		
		System.out.println("Original TreeMap:");
		System.out.println(tm);
		
		//a. Search a value in Treemap.
		System.out.println("Please enter a string for searching");
		Scanner sc = new Scanner(System.in);
		String searchString=sc.nextLine();
		if(tm.containsValue(searchString))
			System.out.println(searchString+" exists!");
		else
			System.out.println(searchString+" not exists!");
		
		//b. get sorted sub-map from TreeMap.
		System.out.println("Sorted sub-map:");
		Map<Integer, String> sm = tm.subMap(1,12);
		System.out.println(sm);
		
		//c. Reverse sorted keys in a TreeMap.
		Map<Integer, String> rm = tm.descendingMap();
	    System.out.println("Reverse Map Content: ");
	    System.out.println(rm);
	    
		//d. sort keys in TreeMap by using Comparator with user define Objects.
	    System.out.println("Sorted keys in TreeMap: ");
		Set<Integer> ks=tm.keySet();
		for(Integer key:ks) {			
			System.out.print(key+"="+tm.get(key)+' ');
		}
	
		
	}
}

package sorting;

import java.util.*;
import java.util.stream.Collectors;

public class StringSorting {

	void show()
	{
		//List<String> s =Arrays.asList("Aram","Shyam", "Heena","Riya");
		List<Integer> s = Arrays.asList(45,45,45,12,45,12,45,454,45,1);
		List<Integer> sorted = s.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
	}
	
	public static void main(String[] args) {
		
		StringSorting c=new StringSorting();
		c.show();
		
	}
}

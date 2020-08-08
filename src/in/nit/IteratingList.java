package in.nit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingList {

	public static void main(String[] args) {
		
    // List<String> list = Arrays.asList("java","spring","hibernate","boot","JPA");
		List<String> list = List.of("java","Spring","hibernate","boot","JPA");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------");
		for(String element:list) {
			System.out.println(element);
		}
		System.out.println("---------------------");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------------");
		
		list.forEach(element->System.out.println(element));
		
		System.out.println("---------------------");
		list.stream().forEach(element->System.out.println(element));
		
	}

}

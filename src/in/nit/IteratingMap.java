package in.nit;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingMap {

	public static void main(String[] args) {
		Map<Integer,String> map = Map.of(101,"java", 102, "spring", 103, "hibernate", 104, "Jpa", 105, "boot");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
                
	}

}

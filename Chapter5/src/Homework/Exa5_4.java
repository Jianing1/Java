package Homework;

import java.util.HashMap;
import java.util.Map;

public class Exa5_4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 3);
		map.put("b", 4);
		map.put("c", 2);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String Mapkey = entry.getKey();
			Integer Mapvalue = entry.getValue();
			System.out.println("key:" + Mapkey + " " + "value:" + Mapvalue);
		}
	}
}

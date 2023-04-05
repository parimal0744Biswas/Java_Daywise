package com.parimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1
{
	public static void main(String[] args)
	{
		Map<Object, Object> map = new HashMap<>();
		map.put(1, "Sachine");
		map.put(2, "Mama");
		map.put(3, "Kaka");
		map.put(4, "Jiju");

		System.out.println(map);

		Set<Entry<Object, Object>> entrySet = map.entrySet();
		System.out.println(entrySet);
	}

}

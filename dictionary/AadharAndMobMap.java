package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharAndMobMap {

	public static void main(String[] args) {
		Map<Integer, Integer> aadharNumAndmobNum = new HashMap<Integer, Integer>();
		aadharNumAndmobNum.put(1234567890, 782983549);
		aadharNumAndmobNum.put(908765432, 765432189);
		aadharNumAndmobNum.put(353465466, 777875435);

		System.out.println(aadharNumAndmobNum.size());

		System.out.println("\nContains key:");
		System.out.println(aadharNumAndmobNum.containsKey(908765432));

		System.out.println("\nContains value:");
		System.out.println(aadharNumAndmobNum.containsValue(777875435));

		System.out.println("\nvalue set:");
		Collection<Integer> values = aadharNumAndmobNum.values();
		Iterator<Integer> itrValues = values.iterator();
		for (Integer str : values) {
			System.out.println(str);
		}

		System.out.println("\nKey Set: ");
		Set<Integer> keySet = aadharNumAndmobNum.keySet();
		Iterator<Integer> itr = keySet.iterator();
		for (Integer string : keySet) {
			System.out.println(string);
		}
		System.out.println("\nKey and value:");
		while (itr.hasNext()) {
			Integer string = itr.next();

			Integer value = aadharNumAndmobNum.get(string);
			System.out.println(string + " - " + value);
		}

	}

}

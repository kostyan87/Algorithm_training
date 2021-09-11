package lection1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class NumberEqualMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int num = 1;

		while (num != 0) {
			num = in.nextInt();
			list.add(num);
		}

		if (list.size() != 0) list.remove(list.size() - 1);

		System.out.println(getEqualToLargestElement(list));
	}

	public static int getEqualToLargestElement(List<Integer> list) {
		if (list.size() == 0) return 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxElem = list.get(0);

		for (Integer num: list) {
			if (!map.containsKey(num)) map.put(num, 1);
			else map.put(num, map.get(num) + 1);
			if (num > maxElem) maxElem = num;
		}

		return map.get(maxElem);
	}
}

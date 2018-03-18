package my.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	public static int searchArray(Integer[] a, int key) {
		Arrays.sort(a);
		Arrays.stream(a).forEach(item -> System.out.print(item + " "));
		return Arrays.binarySearch(a, key);
	}

	public static int searchReverseArray(Integer[] a, int key) {
		Arrays.sort(a, Collections.reverseOrder());

		Arrays.stream(a).forEach(item -> System.out.print(item + " "));
		return Arrays.binarySearch(a, key, Collections.reverseOrder());
	}
	public static void insertValue(List<Integer> a,Integer value) {
		Collections.sort(a);
		int pos=Collections.binarySearch(a, value);
		
		
		if (pos<0)
		{
			System.out.println("Item not found should be inserted at "+pos);
			a.add(Math.abs(pos)-1, value);
		}
	}

	public static void main(String args[]) {
		Integer[] a = { 24, 2, 6, 7, 9, 10 };

		System.out.println(" Index for key 7 is " + searchArray(a, 7));
		System.out.println(" Index for key 7 is " + searchReverseArray(a, 7));
		List<Integer> numbers = new ArrayList<>(
		        Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        insertValue(numbers, 8); 
        numbers.forEach(item->System.out.print(item + " "));
	}
}

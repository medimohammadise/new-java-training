package my.javatraining.java8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateItems {
	public static List<String>  removeDuplicateJava8(List<String> originalList){
		return originalList.stream().distinct().collect(Collectors.toList());
	}
	public static List<String>  removeDuplicateJava7(List<String> originalList){
		Set<String> set=new LinkedHashSet<String>(originalList);
		originalList.clear();
		originalList.addAll(set);
		return originalList;
	}
	public static void main(String[] args) {
		List<String> originalList=Arrays.asList("a","b","b","c","c");
		System.out.println(removeDuplicateJava8(originalList));
		List<String> arrayList = new java.util.ArrayList<String>(originalList);
		System.out.println(removeDuplicateJava7(arrayList));
	}
}

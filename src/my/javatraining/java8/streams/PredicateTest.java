package my.javatraining.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	public static List<Integer>  predicateTest(List<Integer> myList) {
		return myList.stream().filter(getGreatherThan()).collect(Collectors.<Integer>toList());
				
        
	}
	public static Predicate<Integer> getGreatherThan() {
		return i->i>4;
		
	}
	public static long elementRank(List<Integer> myList,int Rank) {
		return myList.stream().filter(item->item<Rank).count();
	}
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 20, 15, 3, 4, 4, 1);
		System.out.println(predicateTest(myList));
		System.out.println("Element rank in list is "+elementRank(myList,4));
	}
	
}

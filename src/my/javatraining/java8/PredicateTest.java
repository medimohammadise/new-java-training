package my.javatraining.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	public static void predicateTest() {
		List<Integer> myList = Arrays.asList(1, 3, 5,3,5, 7, 9);
		System.out.println(myList.stream().filter(getGreatherThan()).collect(Collectors.<Integer>toList())
				);
        
	}
	public static Predicate<Integer> getGreatherThan() {
		return i->i>4;
		
	}
	public static void main(String[] args) {
		predicateTest();
	}
	
}

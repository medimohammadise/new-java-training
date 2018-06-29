package my.javatraining.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReducePattern {

	public static void main(String[] args) {
		List<String> friends=Arrays.asList("Bob","Nicole","Jhony","Tom");
		//TODO check how we can do usig this
		//friends.stream().mapToInt(c->c.length()).max();
		Optional<String> longName=friends.stream().reduce((name1,name2)->(name1.length()>name2.length()?name1:name2));
		longName.ifPresent(name ->
		System.out.println(String.format("A longest name is %s ",name))); //strategy pattern
		
		//return names longer than Bob
		String nameLonggeThanBob=friends.stream().reduce("Bob",(name1,name2)->(name1.length()>name2.length()?name1:name2));
		System.out.println(String.format("A longest name is %s ",nameLonggeThanBob));
	}

}

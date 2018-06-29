package my.javatraining.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {
  public static void main (String[] args) {
	  
	 Arrays.asList("a","b","b","c","c").forEach(c->System.out.println(c));
	 System.out.println("------Via consumer function -----");
	 Arrays.asList("a","b","b","c","c").forEach(new Consumer<String>(){

		@Override
		public void accept(String t) {
			System.out.println(t);
			
		}
		 
	 });
	 System.out.println("------More consinced -----");
	 Arrays.asList("a","b","b","c","c").forEach(System.out::println);
	 
	 System.out.println("------Upper Case -----");
	 Arrays.asList("a","b","b","c","c").stream().map(String::toUpperCase).forEach(System.out::println);
	 
	 System.out.println("------Find by N -----");
	 Arrays.asList("Nominee","Mark","Nithan","Rock","K").stream().filter(c->c.startsWith("N")).forEach(System.out::println);
	 DRYPattern();
	 
  }
   public static void DRYPattern() {
	   List<String> friends=Arrays.asList("Brayan","Marco","Weight","Nicole");
	   List<String> colleagues=Arrays.asList("Monika","Rafaella","Noreta","Norman");
	   friends.stream().filter(name->name.startsWith("N")).count();
	   colleagues.stream().filter(name->name.startsWith("M")).count();
	  
	   
	   //DRY pattern - Lexical scoping (colsure)
	   friends.stream().filter(checkStartWith("N"));
	   friends.stream().filter(checkStartWith("M"));
	   
	   Function<String,Predicate<String>> startWithLetter=(String letter)->
	   {
		   Predicate<String> checkStartWith=name->name.startsWith(letter);
		   return checkStartWith;
			   
	   };
	   
	   System.out.println(" Number of frinds found starting with letter R "+friends.stream().filter(startWithLetter.apply("B")).count());
	   
   }
   private static Predicate<String> checkStartWith(final String letter) {
	   return name->name.startsWith(letter);
	   
   }
   
}

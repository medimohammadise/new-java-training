package my.javatraining.java8;

import java.util.Arrays;
import java.util.function.Consumer;

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
  }
  
}

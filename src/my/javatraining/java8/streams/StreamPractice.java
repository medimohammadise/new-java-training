package my.javatraining.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
  public static String concat(List<String> a)
  {
	  return a.stream().collect(Collectors.joining(" ","START","END"));
  }
  public static List<String> allTheNamsStartingWith(List<String> a,String startWith){
	  return a.stream().filter(s->s.startsWith(startWith)).collect(Collectors.toList());
  }
  public static void main(String args[]) {
	  List<String> a=Arrays.asList("a","b","c");
	  System.out.println(concat(a));
	  List<String> b=Arrays.asList("Allen","Baron","Alice","Ong","Phani","Zaher");
	  System.out.println(allTheNamsStartingWith(b,"P"));
	  
  }
}

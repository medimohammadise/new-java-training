package my.test;

import static java.util.Collections.reverseOrder;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class IntegerRepeatingElement {
  private static Map<Integer,Integer> convertToMap(int[] a) {
	  Map<Integer,Integer> map=new HashMap();
	  for (int item:a)
		  map.put(item, (map.get(item)==null?1:map.get(item)+1));
	  return map;
  }
  public static Integer fisrtRepeatingElement(int[] a) {
	 
	  Map<Integer,Integer> map=convertToMap(a);
	  for (Entry<Integer,Integer> entry:map.entrySet())
		  if (entry.getValue()>1) return entry.getKey();
	  return 0;	  
		  
  }
  public static Integer topRepeatingElement(int[] a) {
		 
	  Map<Integer,Integer> map=convertToMap(a);
	  Map<Integer,Integer> sortedMap= map.entrySet().stream().sorted(reverseOrder(Entry.comparingByValue())).collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	  for (Entry<Integer,Integer> entry:sortedMap.entrySet())
		  System.out.println(entry.getKey()+" "+entry.getValue());
	  return sortedMap.entrySet().iterator().next().getKey(); 
		  
  }
  public static void main(String[] args) {
	  int[] a={1,3,7,4,3,2,3,4,5,7};
	  System.out.println("First repeating element : " +fisrtRepeatingElement(a));
	  System.out.println("Last  repeating element : " +topRepeatingElement(a));
  }
  
}

package my.test;

import static java.util.Collections.reverseOrder;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
/*
 * We have this as tweet , we want to find topMost tweets by Hashtag
 */
public class TopTweetSort {
	
	public LinkedHashMap getTopTweets(String tweetString) {
		
		List<String>  tweet=Arrays.stream(tweetString.split("#")).collect(Collectors.toList());
	    LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
		for (String newTwiit:tweet)
		{
			if (!"".equals(newTwiit))
			{
				newTwiit= (newTwiit.indexOf(" ")>-1? newTwiit.substring(0, newTwiit.indexOf(" ")):newTwiit) ;
				int count=(linkedHashMap.get(newTwiit)!=null?linkedHashMap.get(newTwiit):0);
				linkedHashMap.put(newTwiit,count+1);
			}
		}
		
		return linkedHashMap.entrySet().stream().sorted(reverseOrder(Entry.comparingByValue())).collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
	}
	public static void main(String[] args) {
		TopTweetSort topTweetSort=new TopTweetSort();
		LinkedHashMap topTweets =topTweetSort.getTopTweets("#java #scala #java is the most beatifull one but #scala is different. test #scala");
		System.out.println(topTweets.toString());
		
			
	}
}

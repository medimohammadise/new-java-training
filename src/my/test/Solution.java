package my.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) {
		
	}

	

	public static String[] braces(String[] values) {
		String[] outputString = new String[values.length];
		int i = 0;

		for (String s : values) {
			outputString[i] = checkStringBrace(s);
			i++;

		}
		return outputString;
	}

	public static String checkStringBrace(String s) {
		if (null == s) {
			return "";
		}

		Stack<Character> myCheckStatck = new Stack<>();

		int length = s.length();

		if (length < 1 || length > 100) {
			return "NO";
		}

		for (int i = 0; i < length; i++) {
			Character c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				myCheckStatck.push(c);
			} else {
				if (!myCheckStatck.isEmpty()) {
					char popedChar = myCheckStatck.pop();

					if (c == ']' && popedChar != '[') {
						return "NO";
					}

					if (c == ')' && popedChar != '(') {
						return "NO";
					}

					if (c == '}' && popedChar != '{') {
						return "NO";
					}
				} else {
					return "NO";
				}

			}
		}

		if (myCheckStatck.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	static int numberOfPairs(int[] a, long k) {
		int count = 0;

		for (int index1 = 0; index1 < a.length; index1++) {
			for (int index2 = 0; index2 < a.length; index2++) {
				if (index1 != index2 && a[index1] + a[index2] == k)
					count++;
			}

		}
		return count;
	}
    public  static int spawn(int[] a)
    {
    	 boolean notOut=true;
    	 int i=0;
    	 int jump=0;
    	 int jumpCount=0;
    	 Map<Integer,Integer> visited=new HashMap<>();
    	 int j=0;
    	  while (notOut) {
    		  
    			 
    		    jump=i+a[i];
    		    if (visited.containsKey(i))
    		    	 return -1;
    		    else
    		    visited.put(i, a[i]);
    		   
    		    //System.out.println(jump);
    		  
    		  if (jump>a.length)
    		  {

    			  notOut=false;
    			  jumpCount++;
    			  return jumpCount;
    			  
    		  }
    		  else
    		  {
    		  i=jump;
    		  jumpCount++;
    		  }
    		   
    		   
    	  }
    	  return -1;
    }
    public  static int transform(int A[]) {
    	int sum=0;
    	   for (int item :A )
    	   {
    		  sum= sum+item;
    	   }
    	   int av=sum/A.length+1;	
    	   int c=0;
    	   boolean notFound=true;
    	   do 
    	   {
    		   for (int i=0;i<A.length;i++ )
    		   {
    			   if (A[i]>av) 
    				   A[i]=A[i]-1;
    			   else
    			   if (A[i]<av) 
    				   A[i]=A[i]+1;
    			   else
    				   A[i]=A[i]-1;
    			  
    			   
    		   }
    		   notFound=false;
    		   for (int i=0;i<A.length;i++ )
    			   if (A[i]!=av) notFound=true;
    		  
    		   
    		  c++;
    		  if (c>av)  return -1;
    	   }
    	   while(notFound);
    	   return c;
    	   
    }
    
}

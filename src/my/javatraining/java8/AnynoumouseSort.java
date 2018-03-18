package my.javatraining.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;
class ComparatorSample{
	Comparator<String> comparator = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return (o1.length() < o2.length() ? 1 : -1);
		}

	};
	void printSort(){
		String[] a= {"test","cake","rest","check"};
		Arrays.sort(a,comparator);
		for (String item :a)
			System.out.println(item);
	}
}
class ComparatorSampleWithLambda{
	
	void printSort(){
		String[] a= {"test","cake","rest","check"};
		Arrays.sort(a,(o1, o2)-> (o1.length() < o2.length() ? 1 : -1));
		for (String item :a)
			System.out.println(item);
	}
}

class RunnableSample{
	Runnable r=new Runnable(){

		@Override
		public void run() {
			int i=0;
			while(i<10)
			{
				i++;
				System.out.println(i);
			}
			
		}
		
	};
	void runThread(){
		Executors.newSingleThreadExecutor().execute(r);
	}
}
class RunnableSampleWithLambada{
	
	void runThread(){
		Executors.newSingleThreadExecutor().execute(()->{
			int i=0;
			while(i<10)
			{
				i++;
				System.out.println(i);
			}
		});
	}
}
public class AnynoumouseSort {
	
	public static void main(String[] args) {
		ComparatorSample comparatorSample=new ComparatorSample(); 
		comparatorSample.printSort();
		RunnableSample runnableSample=new 	RunnableSample();
		runnableSample.runThread();
		
		ComparatorSampleWithLambda comparatorSampleWithLambda=new ComparatorSampleWithLambda();
		comparatorSampleWithLambda.printSort();
		
		RunnableSampleWithLambada runnableSampleWithLambada=new RunnableSampleWithLambada();
		runnableSampleWithLambada.runThread();
	}
}

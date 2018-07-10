package my.javatraining.java8;

import java.util.HashMap;
import java.util.Map;

public class TwoArityFunction {
    public static void main(String[] args){
        //BiFunction sample
        Map<String,Integer> slaries=new HashMap();
        slaries.put("Jhon",60000);
        slaries.put("Ben",50000);
        slaries.put("Alen",40000);
        slaries.replaceAll((name,oldvalue)->name.equals("Ben")?oldvalue:oldvalue+1000);
        slaries.entrySet().forEach(item->System.out.println(item.getKey()+" : "+item.getValue()));

        slaries.computeIfAbsent("Monica",s->s.length());
        //use function type
        slaries.entrySet().forEach(item->System.out.println(item.getKey()+" : "+item.getValue()));
    }
}

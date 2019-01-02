package my.javatraining.EPamTest;


import java.util.ArrayList;
import java.util.List;

public class MissingWords {
    public static void main(String[] args){

        String s = " Programmer Programmer Programmer ";
        String t = " Programmer Programmer";
        List<String> str = missingwords2(s,t);
        for(int i=0;i<str.size();i++)
            System.out.println(str.get(i));

    }

    public static List<String> missingwords2(String s, String t){

        String[] a = s.split(" ");
        String[] b = t.split(" ");
        List<String> missing = new ArrayList<String>();
        for(int i=0;i<a.length;i++){
            boolean isMatched=false;
            for(int j=0;j<b.length;j++){
                if(a[i].equals(b[j])) {
                    isMatched = true;
                    b[j]="";
                    break;
                }
            }
            if(!isMatched){
                missing.add(a[i]);

            }
        }
        return missing;

    }
}

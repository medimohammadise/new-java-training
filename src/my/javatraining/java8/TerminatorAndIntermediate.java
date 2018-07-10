package my.javatraining.java8;

import java.util.Arrays;


public class TerminatorAndIntermediate {
    public static void main(String[] atgs){
        System.out.println("IntStream without terminator");
        Arrays.stream(new int[]{1,2,3}).map(i->{
          System.out.println("doubling "+i);
          return i*2;
                }
        );

        System.out.println("IntStream with terminator");
        Arrays.stream(new int[]{1,2,3}).map(i->{
                    System.out.println("doubling "+i);
                    return i*2;
                }
        ).sum();

    }
}

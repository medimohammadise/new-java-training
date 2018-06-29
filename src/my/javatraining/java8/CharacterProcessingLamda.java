package my.javatraining.java8;

public class CharacterProcessingLamda {

    public static void main(String[] args)
    {
        String test="abcd123";
        test.chars().forEach(System.out::println);
        System.out.println("only characters I want");
        //Note mapToObj is a must , map is not working
        test.chars().mapToObj(c->(char)c).forEach(System.out::println);
        System.out.println("only didgit charater I want");
        //Note mapToObj is a must , map is not working
        test.chars().filter(c->Character.isDigit(c)).mapToObj(c->(char)c).forEach(System.out::println);
    }
}

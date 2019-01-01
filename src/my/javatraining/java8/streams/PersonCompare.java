package my.javatraining.java8.streams;

import com.sun.tools.javah.Gen;

public class PersonCompare {
    static Person  person1=new Person("Ali",56, Gender.MALE);
    static Person person2=new Person("Zahra",56, Gender.MALE);

    public static void main(String[] args){
       System.out.println(person1.equals(person2));
    }

}

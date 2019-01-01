package my.javatraining.java8;

import my.javatraining.model.Person;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingByUsingStreams {
    final List<Person> persons= Arrays.asList(
            new Person("James",40),
            new Person("Sara",26),
            new Person("Mahsa",26),
            new Person("Jennifer",51),
            new Person("Susan",36)
    );
    Comparator<Person> ageComparatorAscending = ((person1, person2) -> person1.getAge()-person2.getAge());
    Comparator<Person> nameComparatorAscending = ((person1, person2) -> person1.getName().compareTo(person2.getName()));

    Function<Person,Integer> byAge= Person::getAge;// or  (person -> person.getAge());
    Function<Person,String> byName= Person::getName;// or (person -> person.getName());


    public List<Person> doAgeAsendingSort(){
        //more civilised way to do this is using collect method
        return persons.stream().sorted(ageComparatorAscending).collect(Collectors.toList());
    }
    public List<Person> doNameAsendingSort(){
        return persons.stream().sorted(nameComparatorAscending).collect(Collectors.toList());
    }
    public List<Person> doAgeDecsendingSort(){
        return persons.stream().sorted(ageComparatorAscending.reversed()).collect(Collectors.toList());
    }
    public Person findYoungestPerson(){
        return persons.stream().min(ageComparatorAscending).get();
    }
    public Person findEldestPerson(){
        return persons.stream().max(ageComparatorAscending).get();
    }

    public List<Person> doMultipleAndFLuentSorting(){
        return persons.stream().sorted(Comparator.comparing(byAge).thenComparing(byName)).collect(Collectors.toList());
    }

    public Map<Integer,List<Person>> doGroupByAgeReturnPersonList(){
        return persons.stream().collect(Collectors.groupingBy(person1->person1.getAge()));
    }
    public Map<Integer,List<String>> doGroupByAgeReturnPersonNames(){
        return persons.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
    }
    public Map<Character,Optional<Person>> doGroupByOldestPersonByAlphabet(){
        return persons.stream().collect(Collectors.groupingBy(person->person.getName().charAt(0),Collectors.reducing(BinaryOperator.maxBy(ageComparatorAscending))));
    }
    public static void main(String args[]){
        SortingByUsingStreams sortingByUsingStreams=new SortingByUsingStreams();
        System.out.println("Ascending order person list : ");
        sortingByUsingStreams.doAgeAsendingSort().forEach(System.out::println);
        System.out.println();
        System.out.println("Descending order person list : ");
        sortingByUsingStreams.doAgeDecsendingSort().forEach(System.out::println);
        System.out.println();
        System.out.println("Youngest person: "+sortingByUsingStreams.findYoungestPerson());
        System.out.println();
        System.out.println("Oldest person: "+sortingByUsingStreams.findEldestPerson());
        System.out.println();
        System.out.println("Descending order person list by name: ");
        sortingByUsingStreams.doNameAsendingSort().forEach(System.out::println);

        //High order function Comparing accepts one function and return Comparator function
        System.out.println();
        System.out.println("Multiple and fluent sorting by age and name : ");
        sortingByUsingStreams.doMultipleAndFLuentSorting().forEach(System.out::println);

        System.out.println();
        System.out.println("Group by age print Person List : ");
        System.out.println(sortingByUsingStreams.doGroupByAgeReturnPersonList());

        System.out.println();
        System.out.println("Group by age print Person names: ");
        System.out.println(sortingByUsingStreams.doGroupByAgeReturnPersonNames());

        System.out.println();
        System.out.println("Group by oldest person in alphabet : ");
        System.out.println(sortingByUsingStreams.doGroupByOldestPersonByAlphabet());

    }
}

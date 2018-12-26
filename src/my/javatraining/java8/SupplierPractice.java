package my.javatraining.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
class MyClass{
    public MyClass(){
        System.out.println("Createing");
    }
}
public class SupplierPractice {

    public static void main(String[] args){
        //simple supplier, light weight factory, we postpond creating object
        Supplier<Integer> factory=()-> 2;
        System.out.println(factory.get());

       use(2);
       use(()->2);
        use(new MyClass(),6);
        use(new MyClass(),3);

        use(()->new MyClass(),6);
        use(()->new MyClass(),3);

        //Use in optional
        List<String> names= Arrays.asList("Jack","Jill");
        System.out.println(names.stream().filter(name->name.length()==5).findFirst().orElseGet(()->"none"));

    }
    public static  void use(int value){
        System.out.println("using value "+value);
    }
    public static  void use(Supplier<Integer> value){
        System.out.println("using value with supplier "+value.get());
    }
    public static void use(MyClass myClass, int value){
        if (value>5)
            System.out.println("using from non factory");
    }
    public static void use(Supplier<MyClass> factory, int value){
        if (value>5)
            System.out.println("using from factory"+factory.get());
    }

}

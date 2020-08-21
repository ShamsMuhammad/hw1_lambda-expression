package lambdaexpression.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateList {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("lambda.expression.anonymous.Laptop", "Tablet", "Television", "Monitor");
        System.out.println("Classic enhanced for loop");
        for (String items : electronicsList) {
            System.out.println(items);
        }

        //Please implement Anonymous class to iterate through
        System.out.println("Using Anonymous class");
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };


        //Please implement lambda expression to iterate through electronicsList
        System.out.println("Lambda Expression");
        electronicsList.forEach(s -> System.out.println(s));


        //Please implement lambda Method Reference to iterate through electronicsList
        System.out.println("Lambda Method Reference-1");
        electronicsList.forEach(System.out::println);


        //Please implement lambda Method Reference from Electronics class to iterate through electronicsList
        System.out.println("Lambda Method Reference-2 using Electronics class");
        //electronicsList.forEach(st -> Electronics.countWordLength("Length fro Lambda Method Reference-2: " + st));
        electronicsList.forEach(Electronics::countWordLength);

        //Please implement stream iteration through electronicsList
        System.out.println("iterate using Stream for each loop");
        electronicsList.stream()
                .forEach(Electronics-> System.out.println(Electronics));
    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Arrays;

class Test{
    public static void main(String[] args) {
        List<Integer> one = new Random()
        .ints(5, 1, 6)
        .boxed()
        .collect(Collectors.toList());

        List<Integer> two = new Random()
        .ints(5, 1, 6)
        .boxed()
        .collect(Collectors.toList());

        List<String> three = Arrays.asList("Он", "Она", "Мы", "Ты");
        List<String> four = Arrays.asList("Он", "Она", "Мы", "Ты");
        // List<String> four =  Arrays.asList("Она", "Мы", "Вы", "Оно", "Я");
        
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(four);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(one.stream().filter(aObject -> { return !two.contains(aObject);}).collect(Collectors.toList()));
        System.out.println(two.stream().filter(aObject -> !one.contains(aObject)).collect(Collectors.toList()));
        System.out.println(three.stream().filter(aObject -> { return !four.contains(aObject);}).collect(Collectors.toList()));
        System.out.println(four.stream().filter(aObject -> !three.contains(aObject)).collect(Collectors.toList()));
    }
}
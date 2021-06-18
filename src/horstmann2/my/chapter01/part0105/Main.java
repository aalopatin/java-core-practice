package horstmann2.my.chapter01.part0105;

import horstmann2.my.chapter01.util.StreamsUtil;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> words = StreamsUtil.listFromFile("D:\\text.txt");

        //distinct
        System.out.printf(
                "Count origin: %d \nCount distinct: %d\n",
                words.size(),
                words.stream().distinct().count()
        );

        //sorted
        words.stream().map(String::toLowerCase).distinct().sorted(Comparator.comparing(String::length)).limit(10).forEach(System.out::println);


        System.out.println(
                words.stream().sorted(
                        Comparator.comparing(String::length).reversed()
                ).limit(10).toList()
        );

        //peek
        System.out.println(words);
        System.out.println(words.stream().peek(s -> System.out.println(s)).limit(10).toList());

        System.out.println(
                Stream.iterate(1, p -> p * 2).peek(
                        integer -> System.out.println("Fetching " + integer)).limit(20)
                        .toList()
        );

        System.out.println(
                Stream.iterate(1, p -> p).peek(
                        integer -> System.out.println("Fetching " + integer * 2)).limit(20)
                        .toList()
        );

    }
}

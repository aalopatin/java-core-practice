package horstmann2.my.chapter01.part0112;

import horstmann2.my.chapter01.util.StreamsUtil;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = Stream.iterate(0, i -> i + 1 ).limit(100).toList();
        Optional<Integer> sum = integerList.stream().reduce((a, b) -> {
            System.out.printf("a = %d, b = %d, sum = %d\n", a, b, a + b);
            return a + b;
        });
        System.out.println(sum.orElse(0));

        Integer sum1 = integerList.stream().reduce(0, (integer, integer2) -> integer + integer2);
        System.out.println(sum1);

        List<String> words = StreamsUtil.listFromFile("D:\\text.txt");

        int result = words.parallelStream().reduce(0,
                (total, word) -> total + word.length(),
                (total1, total2) -> total1 + total2);

        System.out.println(result);

    }
}

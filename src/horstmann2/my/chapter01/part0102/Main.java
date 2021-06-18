package horstmann2.my.chapter01.part0102;

import java.math.BigInteger;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.iterate(0, n -> n + 1);
        long count = integerStream.limit(1000).filter(integer -> integer % 23 == 0).count();
        System.out.printf("1000 numbers: %d\n", count);

        for (int i = 0; i < 20; i++) {
            Stream<Integer> doubleStream = Stream.generate(() -> new Random().nextInt(1000));
            count = doubleStream.limit(1000).filter(integer -> integer % 23 == 0).count();
            System.out.printf("Random 1000 numbers: %d\n", count);
        }

    }
}

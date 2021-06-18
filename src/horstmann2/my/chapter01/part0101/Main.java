package horstmann2.my.chapter01.part0101;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {
        try {
            var content = Files.readString(Paths.get("D:\\text.txt"));
            List<String> words = List.of(content.split("\\PL+"));
            Predicate<String> predicate = s -> {
                count++;
                System.out.printf("run %d\n", count);
                return s.length() > 5;
            };


            System.out.println(words.stream().filter(predicate).limit(1).count());
            count = 0;
            System.out.println(words.stream().filter(predicate).limit(2).count());
            count = 0;
            System.out.println(words.stream().filter(predicate).limit(3).count());
            count = 0;
            System.out.println(words.stream().filter(predicate).limit(4).count());
            count = 0;
            System.out.println(words.stream().filter(predicate).limit(5).count());
            count = 0;

            System.out.println(words.stream().limit(1).filter(predicate).count());
            count = 0;
            System.out.println(words.stream().limit(2).filter(predicate).count());
            count = 0;
            System.out.println(words.stream().limit(3).filter(predicate).count());
            count = 0;
            System.out.println(words.stream().limit(4).filter(predicate).count());
            count = 0;
            System.out.println(words.stream().limit(5).filter(predicate).count());
            count = 0;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

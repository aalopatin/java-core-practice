package horstmann2.sources.chapter01.part0101.streams;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class CountLongWords {
    public static void main(String[] args) {
        try {
            var contents = Files.readString(
                    Paths.get("D:\\text.txt"));
            List<String> words = List.of(contents.split("\\PL+"));

            long count = 0;
            for (String w : words) {
                if (w.length() > 12) count++;
            }
            System.out.println(count);

            count = words.stream().filter(w -> w.length() > 12).count();
            System.out.println(count);

            count = words.parallelStream().filter(w -> w.length() > 12).count();
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

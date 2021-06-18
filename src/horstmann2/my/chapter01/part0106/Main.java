package horstmann2.my.chapter01.part0106;

import horstmann2.my.chapter01.util.StreamsUtil;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> words = StreamsUtil.listFromFile("D:\\text.txt");

        //max
        Optional<String> largest = words.stream().max(Comparator.comparing(String::length));
        System.out.println("Longest: " + largest.orElse(""));

        //findFirst
        Optional<String> startsWithS = words.stream().filter(s -> s.startsWith("s")).findFirst();
        System.out.println("Starts with Q: " + startsWithS.orElse(""));

        boolean anyMatchStartsWithQ = words.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("Any match starts with Q: " + anyMatchStartsWithQ);
    }
}

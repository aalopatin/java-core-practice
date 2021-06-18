package horstmann2.my.chapter01.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsUtil {
    public static Stream<String> codePoints(String s)
    {
        var result = new ArrayList<String>();
        int i = 0;
        while (i < s.length())
        {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result.stream();
    }

    public static List<String> listFromFile(String strPath) throws IOException {
        Path path = Paths.get(strPath);
        var contents = Files.readString(path);
        return Arrays.stream(contents.split("\\PL+")).toList();
    }
}

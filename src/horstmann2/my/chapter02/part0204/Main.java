package horstmann2.my.chapter02.part0204;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");
        Path userPath = Paths.get(userDir);
        System.out.println(userPath);

        Path relativePath = Paths.get("\\files\\data.dat");

        Path resolvedUserRelativePath = userPath.resolve(relativePath);

        Path resolvedRelativeUserPath = relativePath.resolve(userPath);

        Path absolutePath = Paths.get(userPath.toString(), relativePath.toString());

        Path fromToAbsolutePath = relativePath.toAbsolutePath();

        Path rootAbsolutePath = absolutePath.getRoot();
        Path rootRelativePath = relativePath.getRoot();

    }
}

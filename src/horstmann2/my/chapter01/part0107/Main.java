package horstmann2.my.chapter01.part0107;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hello, word");

        Optional<String> transformed = optionalString
                .filter(s -> s.startsWith("H"))
                .map(String::toUpperCase);

        System.out.println(transformed.orElse(""));

        Optional<String> nonTransformed = optionalString
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase);

        System.out.println(nonTransformed.orElse("nonTransformed"));

        Optional<Double> result = inverse(0.0).flatMap(Main::squareRoot);

        System.out.println(result.orElseGet(() -> {
            System.out.println("null value");
                    return 0.0;
        }));
    }

    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1/x);
    }

    public static Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }
}

package horstmann2.my.chapter01.part0109;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, String> languageNames = locales.collect(
                Collectors.toMap(
                        Locale::getDisplayLanguage,
                        loc -> loc.getDisplayLanguage(loc),
                        (existingValue, newValue) -> existingValue));
        System.out.println(languageNames);

        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> countryLanguageSets = locales.collect(
                Collectors.toMap(
                        Locale::getDisplayCountry,
                        l -> Collections.singleton(l.getDisplayLanguage()),
                        (a, b) -> { // Union of a and b
                            var union = new HashSet<String>(a);
                            union.addAll(b);
                            return union;
                        },
                        TreeMap::new));

        System.out.println(countryLanguageSets);
    }
}

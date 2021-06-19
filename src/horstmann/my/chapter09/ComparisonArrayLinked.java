package horstmann.my.chapter09;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.function.BiConsumer;

public class ComparisonArrayLinked {

    public static int COUNT = 10000;

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>() {{
            add("String0");
            add("String1");
            add("String2");
            add("String3");
            add("String4");
            add("String5");
            add("String6");
            add("String7");
            add("String8");
            add("String9");
        }};
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        ArrayList<String> emptyArraylist = new ArrayList<>(10000);
        LinkedList<String> emptyLinkedList = new LinkedList<>();

        perform("Add in empty",
                emptyArraylist,
                emptyLinkedList,
                (i, list) -> list.add(i, "String" + i)
        );

        perform("Index of",
                emptyArraylist,
                emptyLinkedList,
                (i, list) -> list.indexOf("String" + i));

        perform("Contains",
                emptyArraylist,
                emptyLinkedList,
                (i, list) -> list.contains("String" + i));

        perform("Add index 5",
                arrayList,
                linkedList,
                (i, list) -> list.add(5, "String4_" + i)
        );

        perform("Add",
                arrayList,
                linkedList,
                (i, list) -> list.add("String9_" + i));

        perform("Add index 0",
                arrayList,
                linkedList,
                (i, list) -> list.add(0, "String0_" + i)
        );

        perform(
                "Get",
                arrayList,
                linkedList,
                (i, list) -> list.get(5 + i)
        );
        perform("Remove",
                arrayList,
                linkedList,
                (i, list) -> list.remove(5)
        );

    }

    private static void performOperation(BiConsumer<Integer, List> consumer, List<String> list) {
        for (int i = 0; i < COUNT; i++) {
            consumer.accept(i, list);
        }
    }

    private static void perform(String operation, ArrayList<String> arrayList, LinkedList<String> linkedList, BiConsumer<Integer, List> consumer) {
        Instant startArray = Instant.now();
        performOperation(consumer, arrayList);
        Instant endArray = Instant.now();

        Instant startLinked = Instant.now();
        performOperation(consumer, linkedList);
        Instant endLinked = Instant.now();

        printMessages(operation, startArray, endArray, startLinked, endLinked);
    }

    private static void printMessages(String operation, Instant startArray, Instant endArray, Instant startLinked, Instant endLinked) {
        System.out.printf("%s elements: %d\n", operation, COUNT);
        System.out.printf("arrayList time: %d\n", Duration.between(startArray, endArray).toMillis());
        System.out.printf("linkedList time: %d\n", Duration.between(startLinked, endLinked).toMillis());
        System.out.println();
    }

}

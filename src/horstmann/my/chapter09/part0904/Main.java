package horstmann.my.chapter09.part0904;

import java.util.*;

public class Main {
    private static int index = 6;
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("String1", "12345");
        System.out.println(map.put("String1", "54321"));

        var counts = new HashMap<String, Integer>();
        counts.put("word", 0);
        System.out.println(counts.get("word"));
        counts.merge("word", 1, Integer::sum);
        System.out.println(counts.get("word"));
        counts.merge("word", 5, Integer::sum);
        System.out.println(counts.get("word"));
        counts.merge("new", 10, Integer::sum);
        System.out.println(counts.get("new"));

        var hashMap = new HashMap<Integer, String>();
        for (int i = 0; i < 9; i++)
            hashMap.put(i, Integer.toString(i));
        Set<Integer> keySet = hashMap.keySet();
        for (int i = 0; i < 3; i++)
            keySet.remove(i);
        Collection<String> values = hashMap.values();
        for (int i = 3; i < 6; i++)
            values.remove(Integer.toString(i));
        var entries = hashMap.entrySet();

        entries.removeIf(entry -> entry.getKey() == index++);

//        entries.removeIf(entry -> entry.getKey() == 6);
//
//        var iter = entries.iterator();
//        while (iter.hasNext()) {
//            iter.next();
//            iter.remove();
//        }
    }
}

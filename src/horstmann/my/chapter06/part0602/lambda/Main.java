package horstmann.my.chapter06.part0602.lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static int i = 1;
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>(){{
            add(" str ");
            add(" str");
            add("str ");
            add("str ");
            add("str  ");
            add("   str");
            add("    str");
        }};

        System.out.println(strs);

        strs.replaceAll(String::trim);

        System.out.println(strs);

        strs.replaceAll(s -> s.concat(Integer.toString(i++)));

        System.out.println(strs);

        strs.removeIf("STR1"::equalsIgnoreCase);
        strs.removeIf("str3"::equals);
        strs.removeIf("str5"::contains);
        strs.removeIf(s -> "str2".equals(s));
        strs.removeIf(s -> s.contains("4"));
        System.out.println(strs);


    }
}

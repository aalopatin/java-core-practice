package horstmann.my.chapter03.part0306strings;

public class Main {
    public static void main(String[] args) {

        //String literals
        String empty = "";
        String greeting = "Hello";
        String specialSymbols = "Java\u2122";
        String strangeSpecialSymbols = "Word\u0923";
        String blackBlocks = "\u2581\u2582\u2583" +
                                "\u2584\u2585\u2586" +
                                "\u2587\u2588\u2589" +
                                "\u258A\u258B\u258C" +
                                "\u258D\u258E\u258F";

        System.out.println(empty);
        System.out.println(greeting);
        System.out.println(specialSymbols);

        for (char ch :
                specialSymbols.toCharArray()) {
            System.out.print(ch);
        }
        System.out.println();

        System.out.println(strangeSpecialSymbols);
        System.out.println(blackBlocks);

        //Substring
        String newGreeting = greeting + " "
                            + strangeSpecialSymbols.substring(0,3)
                            + greeting.substring(2,3)
                            + strangeSpecialSymbols.substring(3,4);

        System.out.println(newGreeting);


        String world = strangeSpecialSymbols.substring(0,3)
                        + greeting.substring(2,3)
                        + strangeSpecialSymbols.substring(3,4);
        String otherNewGreeting = String.join(" ", greeting, world);

        System.out.println(otherNewGreeting);

        //Changing string's value
        String oldString = strangeSpecialSymbols;

        strangeSpecialSymbols = "w" + strangeSpecialSymbols.substring(1,4);
        System.out.println("Is it the same object? "+ (oldString == strangeSpecialSymbols) );

        oldString = "w" + oldString.substring(1,4);
        System.out.println("Is it the same value? "+ (oldString.equals(strangeSpecialSymbols)) );

        //Equality
        String strA = "This is A Long String For Matching";
        String strB = "this is a long string for matching";

        System.out.println("String literal: " + "This is A Long String For Matching".equals(strA));
        System.out.println("String parameters: " + strA.equals(strB));
        System.out.println("String parameters with ignored case: " + strA.equalsIgnoreCase(strB));

        System.out.println("It is still different: " + "String literal" == "String literal");

        //Code point and Code Units
        String strWithEmoji = "String with emoji \u1F37A";
        System.out.println(strWithEmoji);

        String octonionsStr = "𝕆 symbol";
        System.out.println(octonionsStr);
        System.out.println("Pair of code units string length " + octonionsStr.length());
        System.out.println(octonionsStr.codePointAt(0));

        System.out.println(octonionsStr.toCharArray());

        //String API
        System.out.println("Comparing lexicographically strA.compareTo(strB): " + strA.compareTo(strB));
        System.out.println("Comparing lexicographically strB.compareTo(strA): " + strB.compareTo(strA));
        System.out.println("Comparing lexicographically \"123\".compareTo(\"234\"): " + "123".compareTo("234"));
        System.out.println("Comparing lexicographically \"234\".compareTo(\"123\"): " + "234".compareTo("123"));
        System.out.println("Comparing lexicographically \"123\".compareTo(\"123\"): " + "123".compareTo("123"));

        System.out.println("Comparing lexicographically \"123\".compareTo(\"245\"): " + "123".compareTo("245"));

        //StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append(123);
        builder.append(" ");
        builder.append("apples");
        builder.append(" ");
        builder.append("and");
        builder.append(" ");
        builder.append("1.5");
        builder.append("kg");
        builder.append(" ");
        builder.append("of");
        builder.append(" ");
        builder.append("oranges");
        System.out.println(builder.toString());
    }
}

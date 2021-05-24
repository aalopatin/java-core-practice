package codewars.strings.statisticsforanathleticassociation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stats = new ArrayList<>();
        stats.add("01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17");
        stats.add("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17");
        stats.add("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41");
        for (String stat :
                stats) {
            System.out.println(stat);
            System.out.println(Solution.stat(stat));
            System.out.println();
        }

    }
}

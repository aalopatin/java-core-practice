package codewars.strings.statisticsforanathleticassociation;

import java.util.Arrays;

public class Solution {
    public static String stat(String strg) {
        if(!strg.equals("")) {
            String[] runners = strg.split(", ");
            int count = runners.length;
            int[] times = new int[count];

            for (int i = 0; i < count; i++) {
                String[] runnerTime = runners[i].split("\\|");
                times[i] = Integer.parseInt(runnerTime[0]) * 60 * 60 + Integer.parseInt(runnerTime[1]) * 60 + Integer.parseInt(runnerTime[2]);
            }

            Arrays.sort(times);

            int range = times[count - 1] - times[0];
            int average = (int) Arrays.stream(times).average().getAsDouble();
            int median = count % 2 == 0 ? (times[count / 2 - 1] + times[count / 2]) / 2 : times[count / 2];

            return getStatistic("Range", range) + " " + getStatistic("Average", average) + " " + getStatistic("Median", median);
        } else {
            return "";
        }
    }

    private static String getStatistic(String name, int value) {
        int hour = value / 3600;
        int minutes = (value % 3600) / 60;
        int seconds = (value % 3600) % 60;

        return String.format(name + ": %02d|%02d|%02d", hour, minutes, seconds);
    }
}

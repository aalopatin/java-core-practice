package horstmann2.my.chapter06.part0602;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020,01,01);
        long period = localDate.until(localDateNow, ChronoUnit.MONTHS);
        System.out.println(period);
    }
}

package workwithdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        /*
        LocalDate
        LocalTime
        LocalDateTime

        DateTimeFormatter
         */

        LocalDate d1 = LocalDate.now();
        System.out.println( d1 );

        LocalDate d2 = LocalDate.of(1997, 11, 06);
        System.out.println(d2);

        System.out.println( d1.getDayOfYear() );
        System.out.println(d1.getDayOfWeek());
        System.out.println(d1.getDayOfMonth());

        System.out.println( d1.plusDays(23) );
        System.out.println( d1.plusMonths(2) );
        System.out.println( d1.plusYears(5) );
        System.out.println("=============");
        System.out.println( d1.plusWeeks(3) );

        System.out.println(d1.minusDays(500));

//        System.out.println("=======");
//        System.out.println(d1.getDayOfMonth());
//        System.out.println(d1.getMonthValue());
//        System.out.println(d1.getYear());
//        System.out.println(d1.getEra());
//        System.out.println( "=======" );
//        System.out.println( d1.plusYears(1000000).getEra() );
//
//        System.out.printf("Cегодня - %d %d %d\n", d1.getDayOfMonth(), d1.getMonthValue(), d1.getYear());


        LocalTime t1 = LocalTime.now();

        System.out.println( t1 );

        LocalTime t2 = LocalTime.of(14, 30);
        System.out.println( t2 );
        System.out.println( t2.plusMinutes(85) );

        System.out.println( t1.getNano() );


        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println( dt1 );

        LocalDateTime dt2 = LocalDateTime.of(d2, t2);
        System.out.println(dt2);

        DateTimeFormatter patternDate = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        DateTimeFormatter patternDate1 = DateTimeFormatter.ofPattern("dd.MMM.yyyy hha:mm:ss");
        String formatDate = dt2.format(patternDate1);
        System.out.println(formatDate);

    }
}

package day20stringbuilderstringbuffer;


import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {

    public static void main(String[] args) {

//Example 1 : Tom Ali'den 3 yil 9 ay 13 gun sonra dogdu. Ali ise Veli'den 1 yil 15 gun once dogdu.
// Tom'un dogum tarihi 18 kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz.

        LocalDate doboTom = LocalDate.of(2011, Month.NOVEMBER, 18);
        System.out.println("Tom'un dogum gunu " + doboTom);
        System.out.println();

        LocalDate doboAli = doboTom.minusYears(3).minusMonths(8).minusDays(13);
        System.out.println("Ali'nin dogum gunu " + doboAli);
        System.out.println();

        LocalDate doboVeli = doboAli.plusYears(1).plusDays(15);
        System.out.println("Veli'nin dogum gunu " + doboVeli);


    }


}

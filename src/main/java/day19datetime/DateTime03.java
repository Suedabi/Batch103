package day19datetime;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {


    public static void main(String[] args) {


//Example 1 : Japonya ile Almanya ile arasindakizman farkini saat olarak hesaplayan kodu yazdiriniz.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(germany, japan);
        System.out.println(fark);

//Example 2 : Sabit bir tarih olusturunuz.

        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);
        System.out.println(myDate);

        System.out.println();
        System.out.println();

/*
Java'da abit datalari(Gun isimleri , Ay isimleri , Amerika'daki eyalet isimleri...) depolamak ve gerektiginde kullanmak icin
depolar olustururuz. Bu depolara "Enum" denir.
 */

//EXAMPLE 3 : USA icic "Woow!" yazin , UK icin "Big" , CANADA icin "Cold" , TURKIYE icin "Vatan", GERMANY icin "Araba" , RWANDA icin "Cay" yazin.

        Countries country = Countries.TURKIYE;
        switch (country) {
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKIYE:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }


    }

}

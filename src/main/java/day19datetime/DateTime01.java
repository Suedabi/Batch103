package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {


//Example 1 : "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz.
        LocalDate currentDay = LocalDate.now();

        System.out.println(currentDay);

//Example 2 : "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

//Example 3 : "Anlik tarihi " (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

//Exaple 4: Japonya'daki anlik tarihi ve anilk zamani ekrana yazdiran kodu yazini
//          Japonya'daki Current date and Current time ı ekrana yazdiran kodu yaziniz.

        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japonya);

        LocalDateTime istanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(istanbul);

//Example 5 : Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihinş hesaplayan kodu yaziniz.

        LocalDate countDate = LocalDate.of(2022, 11, 17);
        System.out.println("Bugun " + countDate);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println();
        System.out.println("Emeklilik tarhi " + retireDate);

//Example 6 : Ikı cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.

        LocalDate dobAli = LocalDate.of(2005, 05, 17);
        LocalDate dobVeli = LocalDate.of(2013, 02, 8);

//between (dobAli , dobVeli) mothod'u kullanildiginda daha eski olan tarih once yazilmalidir.
        long diffrence = ChronoUnit.MONTHS.between(dobAli, dobVeli);
        System.out.println(diffrence);

//Example 7 : Istanbul'un Fethi ile , Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
//            29 Mayis 1453 ==>    Istanbul'un fethi      29 Ekim 1923 ==> Cumhuriyet'in kurulusu

        LocalDate istanbulFethi = LocalDate.of(1453, 05, 29);
        LocalDate cumhuriyetIlani = LocalDate.of(1923, 10, 29);
        long fark = ChronoUnit.MONTHS.between(istanbulFethi, cumhuriyetIlani);
        System.out.println(fark);

//Example 8 : Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.

        LocalDate myDate = LocalDate.of(2009, 12, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();


        if (day >= 21 && month == 3) {
            System.out.println("Koc");
        } else if (day <= 21 && month == 4) {
            System.out.println("Koc");

        } else if (day >= 21 && month == 4) {
            System.out.println("Boga");
        } else if (day <= 21 && month == 5) {
            System.out.println("Boga");

        } else if ((day >= 21 && month == 5) || (day <= 21 && month == 6)) {
            System.out.println("Ikizler");
            //Boyle de bir kullanim mevcuttur.
        } else if (day >= 22 && month == 6) {
            System.out.println("Yengec");
        } else if (day <= 22 && month == 7) {
            System.out.println("Yengec");

        } else if (day >= 23 && month == 7) {
            System.out.println("Aslan");
        } else if (day <= 23 && month == 8) {
            System.out.println("Aslan");

        } else if (day >= 24 && month == 8) {
            System.out.println("Basak");
        } else if (day <= 23 && month == 9) {
            System.out.println("Basak");

        } else if (day >= 24 && month == 9) {
            System.out.println("Terazi");
        } else if (day <= 23 && month == 10) {
            System.out.println("Terazi");

        } else if (day >= 24 && month == 10) {
            System.out.println("Akrep");
        } else if (day <= 22 && month == 11) {
            System.out.println("Akrep");

        } else if (day >= 23 && month == 11) {
            System.out.println("Yay");
        } else if (day < 21 && month == 12) {
            System.out.println("Yay");

        } else if (day >= 21 && month == 1) {
            System.out.println("Kova");
        } else if (day <= 19 && month == 2) {
            System.out.println("Kova");

        } else if (day >= 20 && month == 2) {
            System.out.println("Balik");
        } else if (day <= 20 && month == 3) {
            System.out.println("Balik");

        } else if (day >= 22 && month == 12) {
            System.out.println("Oglak");
        } else if (day <= 20 && month == 1) {
            System.out.println("Oglak");
        }


    }

}

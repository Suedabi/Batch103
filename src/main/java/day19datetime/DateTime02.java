package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateTime02 {

    public static void main(String[] args) {

//Example 1 : Java 2dan aldiginiz bir Date'i "ay/gun/yil" olarak  yaziniz

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //"MM" 10'dan kucuk aylari 01,02,03, diye yazar
        String formattedDay1 = dtf1.format(currentDate);
        System.out.println(formattedDay1);//11/18/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDay2 = dtf2.format(currentDate);
        System.out.println(formattedDay2);//Kas/18/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDay3 = dtf3.format(currentDate);
        System.out.println(formattedDay3);//Kasim/18/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");// "M" 10'dan kucuk aylari 1,2,3, seklinde yazabiliriz
        String formattedDay4 = dtf4.format(currentDate);
        System.out.println(formattedDay4);//11/18/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDay5 = dtf5.format(currentDate);
        System.out.println(formattedDay5);//11/18/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yyyy");//"d" 10'dan kucuk gunleri 1,2,3, seklinde yazar , 01,02,03 kullanmaz
        String formattedDay6 = dtf6.format(currentDate);
        System.out.println(formattedDay6);//11/18/2022


//Example 2 : Jva'dan aldiginiz time'nin formatini degistiriniz.
        LocalTime myTime = LocalTime.of(16, 23, 54, 2345);
        System.out.println(myTime);

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini "hh" 12 saat sistemini kullanir.
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);//16:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("HH:mm a ");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23 ÖS


    }

}

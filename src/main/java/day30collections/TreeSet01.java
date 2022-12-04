package day30collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {

/*
   TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge" (Natural Order)dizer.
   TreeSet coooook yavas calisir.

   Note: Tekrarsiz elemanlari natural order'da depolamak icin TreeSet kullanmak sagliklidir ama  TreeSet'ler cooook yavas calistigi icin biz,
         elemanlari once HashSet depolariz sonra HashSet'i TreeSet'e cevirerek TreeSet'in yavas olma problemini asmis oluruz.
 */


//Example 1 :Sekiz tane unique String elemani alfabetik sirada depolayiniz.

        TreeSet<String> emails = new TreeSet<String>();

        Long start1 = LocalTime.now().toNanoOfDay();
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("y@gmail.com");
        emails.add("r@gmail.com");
        emails.add("m@gmail.com");
        emails.add("p@gmail.com");
        emails.add("n@gmail.com");
        emails.add("s@gmail.com");
        System.out.println(emails);
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1 - start1);

        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("t@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("r@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("p@gmail.com");
        myEmails.add("n@gmail.com");
        myEmails.add("s@gmail.com");

        TreeSet myEmailsSorted = new TreeSet(myEmails);//HashSet'i TreeSet'e cevirmek icin bu kodu yazdik.
        System.out.println(myEmailsSorted);

        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end2 - end1);

    }


}

package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    public static void main(String[] args) {

       /*
          LinkedHashSet'ler elemanlari ekleme sirasina(Insertion Order) gore yerlestirirler.

          LinkedHashSet elemanlari siralamada zaman harcadigi icin HashSet'lere gore yavas calisir.
        */

        LinkedHashSet<String> emails = new LinkedHashSet<String>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");
        System.out.println(emails);//[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]


    }


}

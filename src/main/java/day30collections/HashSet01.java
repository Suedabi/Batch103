package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
       Hash bir tekniktir,birbirine benzemeyen code'lar uretir bu code'lar data'yi unique yapar.
       Set'lere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz.(Ogrenci numaralari gibi)

       HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz.Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir.

       HashSet'ler index kullanmazlar.Cunku siralama ratgele yapildigi icin index manali olmaz.

       HashSet'ler :

          1)Tekrarsiz elemanlarda
          2)Siralama onemli degilse
          3)Hız onemliyse   HashSet'ler kullanilir.
     */

    public static void main(String[] args) {


        HashSet<String> emails = new HashSet<String>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemani eklerseniz hata vermez,son ekleneni var olan data'nin ustune yazar(overwrite).
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]


    }


}

package day20stringbuilderstringbuffer;

public class StringBuilder01 {


    public static void main(String[] args) {

        /*
        1)StringBuilder Java'da bir Class'dır.
        2)StringBuilder String oluşturmaya yarar
        3)String Class varken ne için StringBuilder'e ihtiyaç duyarız?
          Cunku "String Class" "Immutable Class" 'dir , ama biz bazen "Mutable Stringlere ihtiyac duyariz
          StringBuilder bize "Mutable" String verir.
        4)"Immutable Clas" 'larda var olan deger degistirilemez. Siz var olan bir degeri degistirmek istediginizde
           i)Memory'de yeni bir variable yeni dgerle olusturulur.
          ii)Eski variable'in pointer'i yeni variable'a dondurulur.
         iii)Eger bir variable'i hicbir pointer gostermyorsa o variable "Garbage Collector" tarafindan silinir.

         "Muttable Class" 'larda var olan orijinal deger degistirilebilir. Orijinal deger korunmaz.

        5)"String Class" 'larin "immutable" yapisi "security" icin onemlidir.
           Ayni degere sahip birden fazla String oldugunda Java bir tane container olusturur ve ayni degere sahip Strin'lerin bu containir'leri
           kullanmasini temin eder. Bu memory'i kullanmak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
           etiketlenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat bir variable'in
           degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in ponter'ini bu
           yeni variable'a yonlendirir. Boylelikle hem degisim saglamis hem de digerini etkilenmemis olabilir.

         */

        String str = "Java";
        str = "Super Java";
        System.out.println(str);

        StringBuilder strb1 = new StringBuilder("Java");
        strb1 = new StringBuilder("Super Java");
        System.out.println(strb1);

        //StringBuilder nasil olusturur?

        //1.yol
        StringBuilder strb2 = new StringBuilder("Java");
        System.out.println(strb2);

        //2.yol
        StringBuilder strb3 = new StringBuilder();

        //yol a
        strb3.append("Java");
        strb3.append(" is easy");
        strb3.append(" !!!");
        System.out.println(strb3);


        //yol b
        strb3.append(" learn").append(" Java earn ").append(" money");//Method Chain
        System.out.println(strb3);

        //StringBuilder'larda character sayilari nasil bulunur? ==length(9 method'u ile bulunur

        StringBuilder strb4 = new StringBuilder();
        strb4.append("car");
        strb4.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb4.length();
        System.out.println(numOfChar);//18

        //Capacity asimlarinlarinda capacity var olanin iki katinin iki fazlasina cikar.
        int capacity = strb4.capacity();
        System.out.println(capacity);//36 ==> 16*2 +2 =36

        strb4.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int capacityzrt = strb4.capacity();
        System.out.println(capacityzrt);//70  ==> 34*2 + 2 = 70

        //setCharAt(2,'r'); == > Index 2' deki character'i ye cevirir.
        strb4.setCharAt(2, 'r');
        System.out.println(strb4);

        //delete(3,18); ==> Index 3(dahil) den index 18(haric) e kadar tum characterleri siler
        strb4.delete(3, 18);
        System.out.println(strb4);

        //deleteCharAt(2); ==> Index 2 deki characteri siler
        strb4.deleteCharAt(2);
        System.out.println(strb4);

        //reverse(); ==> method'u StringBuilder'i ters cevirir. Ali ==> ilA
        //"mutable" 'larda sadece method kullanmak orijinal degeri degistirmek icin yeterlidir.
        strb4.reverse();
        System.out.println(strb4);

        //"immutable" 'larda orijinal degeri degistirmek icin method'u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz.
        // atama yapmadan orijinal degeri degistiremessiniz.
        String abc = "Java";
        abc = abc.replace("a", "e");
        System.out.println();//Java

        //toString() method'u StringBuilder'lari String'e cevirir.
        String stringStrb4 = strb4.toString();
        System.out.println(stringStrb4);

        //String'den de StringBuilder'a asagidaki gibi donebiliriz.
        StringBuilder strb5 = new StringBuilder(stringStrb4);
        System.out.println(strb5);

        //insert(3,"XXXX"); 3. character den "XXXX" leri koyar.
        strb5.insert(3, "XXXX");
        System.out.println(strb5);

        //insert(3, "KLMOPQRSTU", 5, 8); ==> 3. character'den sonra, "KLMOPQRSTU" String'inin index 5,6,7 deki character'lerini yerlestirir.
        strb5.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb5);

        StringBuilder a = new StringBuilder("Iava");
        StringBuilder b = new StringBuilder("Java");

        //a.compareTo(b); method'u  i) StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                         ii) "a" alfabetik sirada "b" 'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir.
        //                        iii) "a" alfabetik sirada "b" 'den sonra gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);


    }

}

package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;

public class Arrays01 {


    public static void main(String[] args) {


 /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */

        //Array nasıl oluşturulur?
        int stdAges[] = new int[7];

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Arraylere elemanlar nasıl eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges));

        //Arraydekiher hangi bir elemanı nasıl yazdıabiliriz?
        System.out.println(stdAges[4]);


        //Example 1 : Arraydeki en küçük ve en büyük elemanı ekrana yazdırınız.
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //Length parantezli şekilde Stringlerde kullanılır. Leng parantezssiz Arraylerde kullanıır.
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);


        //Example 2 : stdAges Array'i içineki tum elemanların toplamini ekrana yazdıran kodu yazınız.

        //1.yol:

        int sum = 0;

        for (int i = 0; i < stdAges.length; i++) {

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.yol   (while-loop):

        int i = 0;
        int top = 0;

        while (i < stdAges.length) {

            top = top + stdAges[i];
            i++;
        }
        System.out.println(top);

        //3. yol (do-While) :

        int k = 0;
        int to = 0;

        do {

            to = to + stdAges[k];

            k++;
        } while (k < stdAges.length);
        System.out.println(to);

        //4.Yol: for each loop Array'lerde ve Collections'larda kullanilir

        int t = 0;

        for (int w : stdAges) {
            t = t + w;
        }
        System.out.println(t);

        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

      String stdName[] = new String[5];

      stdName[0]="Ali";
      stdName[1]="Tom";
      stdName[2]="Veli";
      stdName[3]="Kemal";
      stdName[4]="Cem";

      int karakterSayilariToplami =0;

      for (String w:stdName ){

       karakterSayilariToplami= karakterSayilariToplami+w.length();

      }
        System.out.println(karakterSayilariToplami);

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz


        char chName[]={'A','c','D','k','M'}; // Array oluşturma ve veri atamanın kısa yolu.

        for (char w :chName){
            if (w>='A'&& w<='Z'){
                System.out.print(w);
            }
        }



    }


}

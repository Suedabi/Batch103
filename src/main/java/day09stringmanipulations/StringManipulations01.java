package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara düşünme Ankara ";

        //Indexof methodu verilen karakterlerin ilk görünümün indeksini verir.
        int iA= str.indexOf("kara");
        System.out.println(iA);

       //lastIndexof() method'uverilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
       int lIdo = str.lastIndexOf("a");
        System.out.println(lIdo);

        String s= "Mississipi";

        int iO2 =s.indexOf('i');//indexof hem string hemn de char ile oluşturulabilir.
        System.out.println(iO2);

        int idxIss1 = s.indexOf("iss");//Ilk ground "ilk" caharacter'inin indexini verir
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");//Son gorunumun "ilk" caharacter'inin indexini verir
        System.out.println(idxIss2);

        //Example : Bir stringdeki bir karakterin tekrarlı veya tekrarsız olduğunu gösteren kodu yazınız.
        //         "Helllooooo" ==> H -> tekrarsız e -> tekrarsız  l-> tekrarlı  o -> tekrarlı

        String t = "Helloooo";
        char c = 'H';
        if (t.lastIndexOf(c)==t.indexOf(c)){
            System.out.println("Tekrarsız ");
        } else{
            System.out.println("Tekrarlı ");
        }

        String u ="Learn Java earn money   ";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder.

        int sonuc =u.indexOf("r", 4);
        System.out.println(sonuc);

       //lastIndexOf() iki parametre ile kullanılırsa iki parametrede verilen sayiyi index olarakkabul edip en bastan
       // bu indexe kadar olan karakterleri bir kutu içine aliriz ve lastIndexOf() method'unu sadece kutu içindeki String için kullaniniz.


        String m = "Hello everyone ";
        int e= m.lastIndexOf("e",10);
        System.out.println("e" +e);


        int son =  u.lastIndexOf("a" , 5);
        System.out.println("son" +son);

        String v =" ";
        boolean bo =v.isEmpty();
        System.out.println(bo);

        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin

        String x = "    ";

        //isBlank() hem "bos String" için hem de "sadece space" içeren String'ler için true return eder.

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        //Example 2 : Kullanıcıdan alınan isim mutlaka space den farklı en az bir karakter içermelidir.

        Scanner input=new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz ...");
        String ilk =input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim gerizekalı  ");
        }else{
            System.out.println(ilk);
        }




    }
}

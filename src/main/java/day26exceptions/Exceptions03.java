package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("null");
        System.out.println(d);

        divideStringByTheNumOfTheChar(null);


    }


//String'deki charachter sayisini bulunuz. String'i integer'a ceviriniz. Integer'i character sayisina bolunuz.

    //1.yol
    public static double divideStringByTheNumOfTheChar(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {

            length = str.length();//NullPointerException : "null" String ile "length()" kullanildiginda alinir

            i = Integer.valueOf(str);//NumberFormatException:Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildigiinda

            sonuc = i / length;//AritmeticException: Bolen sayi sifir oladugunda alinir.

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    //2.yol
    public static double divideStringByTheNumOfTheCharacter(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {

            length = str.length();//NullPointerException : "null" String ile "length()" kullanildiginda alinir

            i = Integer.valueOf(str);//NumberFormatException:Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildigiinda

            sonuc = i / length;//AritmeticException: Bolen sayi sifir oladugunda alinir.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sonuc;


    }

    //3.yol
    public static double divideStringByTheNumOfTheCharacters(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {

            length = str.length();//NullPointerException : "null" String ile "length()" kullanildiginda alinir

            i = Integer.valueOf(str);//NumberFormatException:Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildigiinda

            sonuc = i / length;//AritmeticException: Bolen sayi sifir oladugunda alinir.

        } catch (NullPointerException e) {
            System.out.println("NullPointer'a ozel.");
        } catch (Exception e) {
            System.out.println("Diger tum Exception'lar icin...");
        }
        return sonuc;
    }
/*
Note: 1) Aralarinda "Parent - Child" Relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz
         "child" olan once kullanilmalidir aksi taktirde hata verir.
      2) Aralarinda "Parent - Child" Relationship olmayan Exception Class'larda multiple catch'lerde kullanmak iserseniz
         siralamanin bir onemi yoktur.

 */

}

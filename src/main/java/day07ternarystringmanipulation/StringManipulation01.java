package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

                    /*
                               String Class Methodlari

        1) equals() : i) iki tane String'in aynı olup olmadığını anlamamıza yarar.
                     ii) equals method'u "boolean" return eder.

        2) equalsIgnorCase() : i) iki tane String'in aynı olup olmadıını büyük harf küçük harfe dikkat etmeden anlamamıza yarar.
                              ii) equalsIgnorCase() method'u "boolean" return eder.

        3)toLowerCase() : i) bir Stringdeki tum harfleri küçük harfe çevirmek için kullanılır.
                         ii) toLowerCase() methodu "String" return eder.

        4) toUpperCase() : i)  Stringdeki tüm harfleri büyük harfe çevirmek için kullanılır.
                           ii) toUpperCase() method'u "String" return eder.

        5)  charAt() : i) Bir String'den belli bir index'deki karakteri almak için kullanılır.
                      ii) charAt() methodu "char" return eder.

        6) length() : i) Bir Stringde kaç tane karakter kullanıldığını öğrenmek için kullanılır.
                      ii) length() methodu "int" return eder.

       7) contains() : i) Bir String de bir carachterin veya characterlerin var olup olmadığını anlamak için kullanılır.
                      ii) contains() methodu "booleans" return eder.

       8) split()   : i) Bir Stringi istediğimiz karakterden parçalamaya yarar.
                     ii) split() methodu "Array" return eder.


                     */

   /*
   Bir password'un geçerli olup olmadığınıaşağıdaki kurallara göre kontrol eden kodu yazınız.

   i)En az 8 karakter içermeli.
  ii)Space karakteri içermeli.
 iii)Ilk harf "m" eya "M" olmalı.
  iv)Son karakteri "?" olmalı.
    */

String pwd = "melike12?";

//En az 8 karakter içermeli.

boolean sifre = pwd.length()>7;

//Space karakteri içermemeli

boolean sifre2 = !pwd.contains(" ");

//Ilk harf "m" veya "M" olmalı.

 boolean sife3 = pwd.charAt(0)== 'm' || pwd.charAt(0)== 'M';

 //Son karakteri "?" olmalı.

 boolean sifre4 = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(sifre && sifre2 && sife3 && sifre4 );


    }

}

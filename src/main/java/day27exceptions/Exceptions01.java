package day27exceptions;

public class Exceptions01 {


    public static void main(String[] args) {

        double r1 = compareNumOfCharacter("Java", "xy");
        System.out.println(r1);//2.0

        double r2 = compareNumOfCharacter(null, "xy");
        System.out.println(r2);//0.0

        double r3 = compareNumOfCharacter("Selenium", "");
        System.out.println(r3);
    }


//Verilen iki String'den birinin character sayisinin digerinin kaçta kaçı oldugunu veren methıd olusturunuz.

    public static double compareNumOfCharacter(String s, String t) {
        double result = 0;

        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("lenght() method'u null ile kullanilamaz");
        } catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        } finally {
            System.out.println("Database ile connection kesildi");
        }
        return result;

    }

    /*

    "final" ,"finally", "finalize" aciklayiniz.
1)"final" bir keyword'dur , Variable ,Class , ve Method'lar icin kullanilir. ...
       "final" keyword   i)Variabl'larda kullanilabilir.
                 public final int age =12;
                 a)Atanan deger degistirlemez.
                 b)Deger atamasi yapilmak zorundadir.

             ii)Method'larda kullanilabilir.
             public final int add() {
             return a+b;
             }
                      a)Bir method olustururken "final" olarak olusturulmus ise
                      o method'un body'si asla degistirlemez. Dolayisiyla o method override edilemez.


             iii)Class'larda kullanilabilir.
             Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
             Bir Class "final" ise o Class'a extend edilemez
             "final" Class Child olabilir.



2)"finally" bir kod block'dur.
  "try-catch" veya sadece "try" ile kullanilir.
  "finally code block icine yazilan code'lar her halukarda calisir.
  Mesela Databese ile connection'i kesmek herhalukarda yapilmasi gerej-ken bir fiildir. Bunu "finally" ile yapabiliriz.
3)"finalize" bir method'dur. Bu method Java tarafindan data'lar imha edilmeden once cagirilir,bu method data'lari
imha edilecek hale getirir ve daha sonra "Garbage Coolector" bu data'lari imha eder.

"finalize" method'unu Java Developer'lar da cagirabilir ma Java kendi bildigini yapar.

     */


}

package day25exception;

public class E01 {

    /*
    1)"Exeption" (istisnayi hata) Java'da kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
    2)Exeption'lar ile calismanin iki yolu vardir
       a)try-catch block yolunu kullanma ve exeption olussa bile calismayi devam ettirme.
       b)throw exeption kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz
         gerekiyor ise bu dosyamiz eger silinmis ise java dosyayi bulmaz ve uygulamanin devam etmesi gerekmez.
    3)Eger exeption'i handle etmez isek (sorunu halletmez isek) java calismayi durdurur.
    4)try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
    5)try-catch olmaz ise kullanilamaz.
    6)Eger yazmis oldugunu herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch block icine koymalisiniz.
    7)catch block parantezi icerisine olmasi muhtemel exeption Class ismi yazilir.  AritmeticWxeption
    8)e.getMassage(), methodunu kullanarak teknik mesasage'lar elde edebiliriz.
      System.out.println(); Burada yazmis oldugum message'lar benim yazdigim teknik olmayan message'ler dir.
      e.printStackTrace(); methodu Exaption ile ilgili detaylica teknik message verir.Kod calismaya devam eder.
      System.err.println(); icine yazdigimizi renkli bir sekilde verir. Genellikle hata message'larini ayirt etmek icin kullanilir.
    9)Eger try body icindeki kod sorunsuz calisirsa catch block devreye girmez.

     */

    public static void main(String[] args) {
        //    divide(6, 2);//3
        //  divide(0, 2);//0
        //divide(6, 0);// Matematikte bir sayi sifir ile bolunemez.

        //divide2(5, 0);
        divide2(12, 0);
    }

//1.yol Tavsiye edilmez.
//Bir Developer icin tum matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez.");
        } else System.out.println(a / b);
    }

    //2. yol try-catch kullanarak exception'i handle etmek tavsiye edilir.
    public static void divide2(int a, int b) {

        try {
            System.out.println(a / b);
            System.out.println("hi exception");
            System.out.println("bye exeption");

        } catch (ArithmeticException e) {
            System.out.println("Bolme isleminde bir problem olustu ==> " + e.getMessage());
            e.printStackTrace();
            System.err.println("Bolme isleminde bir problem olustu");
        }
    }

//Java matematik ile ilgili karsilisilmasi muhtemel tum istisnalari,hatalari AritmeticException Class'ina koymustur.
//Matematikteki tum istisnalari detaylari bilmek zorunda degiliz.


}










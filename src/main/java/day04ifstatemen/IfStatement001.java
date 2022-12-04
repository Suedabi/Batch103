package day04ifstatemen;

public class IfStatement001 {

    public static void main(String[] args) {

        //ıf it rain I will cancel the picnic( eğer yağmur yağarsa pikniği iptal edeceğim)
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.

        int s = 12;

        if (s>0) {
            System.out.println("positive");
        }

//Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin

        char c = 'S' ;
        if (c>='S' && c <='Z'){
            System.out.println("Büyük harf");
        }

/*
            && islemi sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
            && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.
        */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli" yazdiriniz.

        int i = 857 ;

        if (i>99 && i <1000){
            System.out.println("Uc basamaklı");
        }


        int n = -857 ;

        n=Math.abs(n);   // burda n sayısını mutlak değere aldık çünkübir sayının üç basamaklı olması negatif olmasına engel değildir.

        if (n>99 && n <1000){
            System.out.println("Uc basamaklı");
        }

     // Example 4 : Verilen bir sayı çift ise ekrana çift yazdıralım.

        int b = 18;

        if (b%2==0){
            System.out.println("Çift sayı");
        }


        int g = 17;

        if (g%2==0){
            System.out.println("Çift sayı");
        }

        // "=" işareti atama operatörüdür. matematikteki eşittir anlamaına gelmez.
        // matematikteki eşittir sembolu Java'da "==" şeklindedir.
        //2+3== 5

        // Example 5: Verilen sayı 300 den küçük veya 1200 den büyük ise ekrana "Harika sayı " yazdıralım.

        int h = 250;

        if (h<300 ||  h>1200){
            System.out.println("Harika sayı");
        }

       /*
        || işlemi sadce boolean ile kullanılır.
        true  || true = true
        true  || false= true
        false || true = true
        false || false = false

        Note: || işleminde false alabilmek için haer şeyin false olması gerekir.
              || işleminde sadece bir tane true sonucu true yapmaya yeter.
        */

    }

}

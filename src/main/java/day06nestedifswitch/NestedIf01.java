package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        pasword'un ilk harfi buyuk harf ise
          'A' olursa gecerli passwordaksi halde gecersiz pssword

          password'un ilk harfi kucuk harf ise
          'z2 olursa gecerli password aksi halde gecersiz password

Note: Java "Nested" kodları çalıştırırken çok zaman harcar. buna "Time complexity" denir
      bu yüzden mümkün ise "nested" kod yazmamaya çalışırız.

         */

        String pwd = "5xy12";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf<= 'Z') {

        }
        if (ilkHarf == 'A') {
            System.out.println("Gecerli password");
        } else {
            System.out.println("Geçersiz password");


        }
        if (ilkHarf >= 'a' && ilkHarf <= 'z') {

            if (ilkHarf == 'z') {
                System.out.println("Gecerli password");

            } else {
                System.out.println("Gecersiz password");
            }
        }else{
            System.out.println("İlk karakter harf olmalıdır.");
        }


    }

}

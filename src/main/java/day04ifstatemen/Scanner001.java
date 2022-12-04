package day04ifstatemen;

import java.util.Scanner;

public class Scanner001 {

    public static void main(String[] args) {

        /*
        kullanıcıdan ilk ismini orta ismini ve soy ismini alınız ve asağıdaki formatta ekrana yazdırınız.

        Ali Mert Can
        123456789

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz... ");

        String ilkİsim =input.next();// next methodu kullanıcıdan string datatsı almak için kullanılır.

        System.out.println("Soy isminizi giriniz  ... ");

        String soyİsim = input.next();

        System.out.println("Orta isminizi giriniz... ");
        String ortaİsim =input.next();

        System.out.println("TC kimlik numaranızı giriniz... " );
        String tcKimlikNumarsı =input.next();

        System.out.println(ilkİsim + " " + ortaİsim+ " " +soyİsim );
        System.out.println(tcKimlikNumarsı);

        //2. yol :

        System.out.println("Ilk orta ve soy ısmınızı ve de kimlik numaranızı giriniz gırınız... ");
        String ilk =input.next();
        String orta = input.next();
        String soy = input.next() ;
        String kimlik =input.next();

        System.out.println(ilk+" " + orta+ " " + soy);
        System.out.println(kimlik);

        // 3. yol :

        System.out.println("ilk orta ve soy isilerinizi giriniz  ");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("kimlişk numaranızı girniz ");
        String kimlikNumarası = input.next();
        System.out.println(kimlikNumarası);

    }

}

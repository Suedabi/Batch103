package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner002 {

    public static void main(String[] args) {

        //Example 1: Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız.

        //1. adım : Scanner Class'ından object oluştur.

        Scanner input = new Scanner(System.in);

        // 2. adım: Kullanıcıya ne yapacağını söyle.

        System.out.println("Ilk sayıyı giriniz...");
        double sayı1 =input.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz...");

        double sayı2 = input.nextDouble();

        System.out.println(sayı1+sayı2);

    }

}

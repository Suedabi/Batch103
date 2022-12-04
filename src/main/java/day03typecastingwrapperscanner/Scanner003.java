package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner003 {

    public static void main(String[] args) {

//Example 1 : Kullanıcıdan bir dikdörtgenin en ve boy ölçülerini alalım ve kullanıcıdan çlçülerini aldığımız dikdörtgenin alanını bulalım.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenarını girinizi ... ");

        int en = input.nextInt();


        System.out.println("Dikdörtgenin uzun kenarını giriniz...");

int boy =input.nextInt();

        System.out.println("Alan  "  +en*boy);

        System.out.println("Cevre  10" + 2*(en+boy));
    }


}




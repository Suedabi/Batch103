package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
        kullanıcıdan gün sayısını alınız ve gün ismini ekrana yazdırınız.
            1==> pazar     2==>pazartesi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz  : ");

        byte gunNo = input.nextByte();

        //1. yol : if ile cozunuz.

        if (gunNo == 1) {
            System.out.println("Pazar");
        } else if (gunNo == 2) {
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Salı");
        } else if (gunNo == 4) {
            System.out.println("Çarşamba");
        } else if (gunNo == 5) {
            System.out.println("Perşembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            ;
            System.out.println("Cumartesi");
        } else {
            System.out.println("Lütfen geçerli bir gün sayısı giriniz");

        }

        //2. yol: switch ile çözünüz

        switch (gunNo) {
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Salı");
                break;
            case 4:
                System.out.println("Çarşamba");
                break;
            case 5:
                System.out.println("Perşembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Lütfen 1-7 aralığında bir sayı giriniz");

        }






    }
}
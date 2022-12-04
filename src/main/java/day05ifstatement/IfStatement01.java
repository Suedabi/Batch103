package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

//Example 1: Kullanıcıdan alinan sayinin tek mi cift mi olduğunu ekrana yazan kodu yazınız.

        //1. yol:

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int ts = input.nextInt();

        if (ts % 2 == 0) {
            System.out.println("Çift sayı ");
        }

if(ts%2!=0){
            System.out.println("Tek sayı ");
        }

//2. yol:

        if (ts % 2 == 0) {
            System.out.println("Çift sayı ");
        }

        else {
            System.out.println("Tek sayı ");
        }
 // Example 2: Bir sayının negatif , pozitif veya nötr oldupunu söyleyen kod yazınız.

        System.out.println("Lütfen bir sayı giriniz  ");

        double d = input.nextInt();
        if (d>0) {
            System.out.println("Pozitif tam sayı  ");
        }
        if (d<0){
            System.out.println("Negatif tam sayı  ");

        }

   else if (d==0){

            System.out.println("Nötr ");
        }




    }

}

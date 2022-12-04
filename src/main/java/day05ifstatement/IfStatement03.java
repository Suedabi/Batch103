package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
    Iki tane String'in birbirine esit olup olmadiğini anlamak için "==" degil , "equals ()" kullaniniz.
    Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanılabilir
       i) equals() ==> Buyuk harf ve kucuk harfi onemser
       ii)equalsIgnorCase() ==> Buyuk harf ve kucuk karfi onemsemez. "A" ile "a" aynidir.

     */



    public static void main(String[] args) {

        //Example 1: Kullanıcıdan gün isimlerini alınız o günün hafta sonu mu hafta içimi olduğunu yazdırınız.
        //      Pzartesi==> hafta içi    Pazar==> hafta sonu

        Scanner input  = new Scanner(System.in);

        System.out.println("Bir gün isimi giriniz : ");

        String gun = input.next();

        //1. yol:

        if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu ...");
        }

        else if (gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta içi ...");
        }

        else if (gun.equalsIgnoreCase("Salı")){
            System.out.println("Hafta içi...");
        }

        else if (gun.equalsIgnoreCase("Çarşamba")){
            System.out.println("Hafta içi...");
        }

        else if (gun.equalsIgnoreCase("Perşembe")){
            System.out.println("Hafta içi...");
        }

        else if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta içi...");
        }

        else if (gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta içi...");
        }

        else {
            System.out.println("Lütfen geçerli bir gün giriniz...");
        }

        //2. yol:

        if (gun.equalsIgnoreCase("Pazar")  || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu ...");
        }

        else if (gun.equalsIgnoreCase("Pazartesi") ||
                 gun.equalsIgnoreCase("Salı")      ||
                 gun.equalsIgnoreCase("Çarşamba")  ||
                 gun.equalsIgnoreCase("Perşembe")  ||
                 gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hfta içi ...");
        }
         else {
            System.out.println("Lütfen geçerli bir gün giriniz");
        }


        }


    }




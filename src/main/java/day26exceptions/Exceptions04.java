package day26exceptions;

import java.util.Scanner;

public class Exceptions04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas = input.nextInt();

        System.out.println("Vermis oldugunuz bilgilere gore " + yas + " ysinizda oldugunuzu anladik");

        int age = (250);

        try {
            printAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    //Yasi ekrana yazdiran bir method olusturunuz.

    public static void printAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Java negatif olamaz veya 200 den buyuk olamaz");
        }
        System.out.println(age);

    }


}
package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner001 {

    //Scanner kullanıcıdan adata almaya yarar, Scanner kullanıcı ile etkileşimi sağlar.
    //Scanner bir Java classıdır.Bu class' ı kullanabilmek için import etmek gereki.


    public static void main(String[] args) {

        // Kullanıcıdan data almak icin yapilmasi gerekenler

        //1) Scanner Class'ından object oluşturun

      Scanner input = new Scanner(System.in);

        // 2) kullanıcıya ne yapacağını söyle
        System.out.println("Hey kullanıcı yasını gir...");

       //3) kullanıcıdan alınan data'yı bir veriable'nin icine koyun

        byte age =input.nextByte();
        System.out.println("Hey kullanıcı senin yasin  " + +age);


    }

}

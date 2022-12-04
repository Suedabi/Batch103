package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanıcıdan yas bilgisi alalım ve yasın hani evre oldugunu söyleyelim.
        //0-4  => baby
        //5-12 =>child
        //13-20=> teenager
        //21-30=> adult
        //else (not expert age)


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yasınızı giriniz : ");
        byte yas = input.nextByte();

        if (yas<0 ){
            System.out.println("Gecerli yas giriniz");
        }
        else if(yas<=4){
            System.out.println("Bebek");
        } else if (yas<=12) {
            System.out.println("Cocuk");
        } else if (yas <=20) {
            System.out.println("Genç");
        } else if (yas<=30) {
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tamamlanmamış evre");
        }


    }


}

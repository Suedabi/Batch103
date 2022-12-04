package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //Kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdiran basit bir hesap makinası yapiniz
        //Note: Switch de sadece int, byte,short,char,String data tipleri kullanılabilir.
        // Note: Eger 3 den fazla durum varsa switch() tercih edilmesi daha iyi olur.


        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi giriniz: '+','-','*','/','%'");
        char islem = input.next().charAt(0);

        System.out.println("Lütfen ilk sayıyı giriniz");
        double ilk = input.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        double ikinci = input.nextDouble();

        switch (islem) {

            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println((ilk * ikinci) / 100);
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır");


        }

    }

}

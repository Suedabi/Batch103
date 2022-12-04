package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        // Example 1: Kullanıcı gün numarasını girsin kod ismini yazssın
        // 2 == pazartesi  4== çarşamba

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarsı giriniz  ");


        byte gunNo = input.nextByte();

        if (gunNo==1){
            System.out.println("Pazar");
        }

        else if (gunNo==2){
            System.out.println("Pazartesi");
        }

        else if (gunNo==3){
            System.out.println("Salı");
        }

        else if (gunNo==4){
            System.out.println("Çarşamba");
        }

        else if (gunNo==5){
            System.out.println("Perşembe");
        }

        else if (gunNo==6){
            System.out.println("Cuma");
        }

         else if (gunNo==7){
            System.out.println("Cumartesi");
        }
         else  {
          System.out.println("Geçersiz gün numarası" );
      }


    }


}

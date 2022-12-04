package day12loops;

import java.util.Scanner;

public class NesteedForLoop01 {


    public static void main(String[] args) {


//Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
//          ****
//          ****
//          ****

        Scanner input =new Scanner(System.in);
        System.out.println("Satır sayisi giriniz");
        int i = input.nextInt();
        System.out.println("Lutfen sutun saisini giriniz");
        int k =input.nextInt();
        System.out.println("Karakter seciniz");
        char ch = input.next().charAt(0);

for (int a = 1; a<=i; a++){
for (int b = 1; b<k; b++){
System.out.print(ch);
}
    System.out.println();
    }

/*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */


        for (int x = 1 ; x<6 ;x++){
            for (int y =1 ; y <=x ; y++){
                System.out.print(y);
            }
            System.out.println();
        }





        /*
                Example 3: Asagidaki sekil cizen kodu yaziniz

                            * * * *
                            * * *
                            * *
                            *
         */

        System.out.println();
int satir = 4 ;

for (int r=1; r<=satir; r++){
    for(int t=satir; t>=r; t--){
        System.out.print("* ");
    }
    System.out.println();
}



    }


}

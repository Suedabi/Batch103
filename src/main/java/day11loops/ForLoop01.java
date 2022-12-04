package day11loops;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {

//Example 1: 3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz.

int sum =0;
for( int s =3 ; s<7 ; s++){
sum=sum+s ;
System.out.println(sum);
}
//Note: System.out.println(sum); loop'un disina yazilirsa "sum"'in son degerini ekrana yazdirir.
//      System.out.println(sum); loop'un içine yazilirsa her bir loop için " sum" 'ın hangi degerleri aldığını yazdirir.
 System.out.println(sum);

//Example 2 : 6 dan 3 e kadar tamsayilarin çarpımını bulan kodu yaziniz.

int mul = 1;

for (int i = 6 ; 2<i ; i-- ){
mul=mul*i;
System.out.println(mul);

}

//Example 3 : Size verilen  bir tamsayinin rakamlari toplaini bulunuz.

int num = 385;
num=Math.abs(num);
int sonuc = 0;

for (int b = 358 ; b> 0 ; b=b/10){
sonuc=sonuc+b%10;
System.out.println(sonuc);

}

//Example 4 : Size verilen String'i ters çeviren kodu yaziniz.
//            "Kaba" ==> "abaK"

String str = "Kaba";

//Concatenation yapacaksaniz "" kullanin

String ters = "";

for (int c =str.length()-1; c>-1 ;c--  ){
char n = str.charAt(c);
ters=ters+n;
System.out.println(ters);
}


    }


}

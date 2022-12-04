package day12loops;

import java.util.Scanner;

public class WhileLoop01 {


    public static void main(String[] args) {



        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

//1.yol

   for (int i = 3  ;i<11   ;i++  )    {
       System.out.print( i + " " );
   }
        System.out.println();
        System.out.println();

   //2.yol

        int i=3;
        while (i<11){

            System.out.print(i+ " ");

            i++;

        }
        System.out.println();
        System.out.println();


//Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

int p = 17;
        while (p>3){
            if (p%2==0) {
                System.out.print(p + " ");
            }
        p--;

        }
        System.out.println();
        System.out.println();


 //Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz


   int sum = 0;
   int l = 12;
        while (l<68){
            sum = sum+l;
     l++;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println();


//Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

        int s = 0;

        int z = 358;
while (z>0){
    s=s+z%10;
    z=z/10;
}
        System.out.println(s);
        System.out.println();
        System.out.println();



   int m=0;
   int n= 852;

   while (n>0){
       m=m+n%10;

   n=n/10;

   }
        System.out.println(m);
        System.out.println();
        System.out.println();

        int k =0;
        int j =963;

        while (j>0){
            k=k+j%10;
            j=j/10;
        }
        System.out.println(k);
        System.out.println();
        System.out.println();

//Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
//          3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30


        Scanner input = new Scanner(System.in);

        System.out.println("Carpim tablosunu gormek icin lütfen bir sayi giriniz");


        int f = input.nextInt();
        int g =1;
        while (g<11){


            System.out.println(f+"*"+g+"="+f*g);

            g++;
        }















    }

}

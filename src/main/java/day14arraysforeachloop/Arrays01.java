package day14arraysforeachloop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {


    public static void main(String[] args) {

//Arrays'lerin icine "primitive data type" leri ve "reference"(adres) lar konabilir.

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "Did";
        str[2] = "Supraised you";
        System.out.println(Arrays.toString(str));

//Example 1: String bir Array oluşturun ve "Tom" ve ondan öncekileri ekrana yazdırınız.

        String arr[] = {"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;
            }


        }
        System.out.println();
        System.out.println();

//Example 2 : String bir Array oluşturunuz "Tom" ve "Jane" hariç tüm elemanlari ekrana yazdiriniz.

        String brr[] = {"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};

        for (String w : brr) {

            if (w.equals("Jane") || w.equals("Tom")) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println();


//Example 3 : Kullanıcıyla beraber bir Array oluşturunuz ve icine data ekleyiniz
//            Bir öğretmenin sınıfındaki öğretmenlerin sinifindaki öğrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen sinifinizdaki ogrenci saysini giriniz");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println("Girisi sonlandirmak icin 'Q'harfine basınız, devam etmek icin herhangi bir tusa basiniz");

        for (int i = 1; i <= numOfStd; i++) {

            System.out.println("Lütfen " + i + ". ogrenci ismini giriniz");

            String stdName = input.next();

            if (stdName.equalsIgnoreCase("q")) {
                break;
            }

            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));


    }


}

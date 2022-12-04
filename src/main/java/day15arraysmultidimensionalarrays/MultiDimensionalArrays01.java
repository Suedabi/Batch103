package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {


    public static void main(String[] args) {


        //Bir Array'in elemanlari Array ise bu Array'ler "Multidimensional Array" dir.

        //Multidimensional Array nasil olusturulur?
        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));


        //Multidimensional Array'lere eleman ekleme nasil yapilir?
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        //Multidimensional Array consol'a nasıl yazdırılır?
        System.out.println(Arrays.deepToString(arr));


        //Multidimensional Array'lerde Array elemanlardan biri nasil yazdirilir.
        System.out.println(Arrays.toString(arr[1]));

        // Multidimensional Array'lrde ic Array elemanlari nasli yazdirilir.

        System.out.println(arr[1][0]);

        //Example 1 : String bir Multidisioanal Array oluşturunuz eleman ekleyiniz ve sonra toplam eleman sayisini ekrana yazdiran kodu yazdiriiz.

        String arr2[][] = new String[4][3];

        arr2[0][0] = "A";
        arr2[0][1] = "B";
        arr2[0][2] = "C";

        arr2[1][0] = "D";
        arr2[1][1] = "E";
        arr2[1][2] = "F";

        arr2[2][0] = "G";
        arr2[2][1] = "H";
        arr2[2][2] = "I";

        arr2[3][0] = "J";
        arr2[3][1] = "K";
        arr2[3][2] = "L";

        System.out.println(Arrays.deepToString(arr2));

        int sum = 0;
        for (String[] w : arr2) {

            sum = sum + w.length;

        }
        System.out.println(sum);

    }

}

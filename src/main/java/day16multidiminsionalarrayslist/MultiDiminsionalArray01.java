package day16multidiminsionalarrayslist;

import java.util.Arrays;

public class MultiDiminsionalArray01 {


    /*

    Array veya Collaction varsa "for-each-loop" kullanmak ilk tercihininizi olsun
    Array veya Collaction var ama "index" kullanmak zorundaysanız o zmn "for-each-loop" çalışmaz, "for-loop" veya "while-loop"veya "do-while-loop" kullanmalısınız.

     */


    public static void main(String[] args) {

//Bir tane integer multidiminsional array olusturunuz
//Bu array'deki tum sayilarin toplamini veren kodu yazniz.

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;

        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
            }
        }
        System.out.println(sum);

        //Bir multidisional array'i normal array'e çevien kodu yaınız.
        //{{2, 5, 1}, {32, 75}}==> {2, 5, 1 ,32, 75}


        int brr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int toplam = 0;

        for (int[] w : brr) {
            toplam = toplam + w.length;
        }
        System.out.println(toplam);


        int idx = 0;

        int crr[] = new int[toplam];
        for (int[] w : brr) {
            for (int k : w) {
                crr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));


    }


}

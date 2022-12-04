package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

//binarySearch () Method : Bu method'u kullanarak bir elemanının Array'de olup olmadıgını anlarız.
//                         binarySearch Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
//                         binarSearch() Method2u aradiginiz eleman Array'de varsa o elemanin indexini return eder.
//                         binarySearh() Method'u aradiginiz eleman Array'de yoksa "-a " seklinde bir negatif sayi aliriz .
//                         Bu sayidaki"-" isaretinin anlami bu eleman Array'de yok demektir."a" nin anlami olsaydi kacinci sirada olurdu demektir.
//                         binarySearch() Method'u tekrarlayan elemanlar için kullamilmaz.

        int arr[] = {12, 31, 43, 14};
        int sayi = 43;

        Arrays.sort(arr);//[12,14,31,43]
        int idx1 = Arrays.binarySearch(arr, sayi);
        System.out.println(idx1);



        int sayi2= 58;
        int sonuc =Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc); //-5



    }

}

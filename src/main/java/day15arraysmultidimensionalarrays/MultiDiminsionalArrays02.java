package day15arraysmultidimensionalarrays;


import java.util.Arrays;

public class MultiDiminsionalArrays02 {

    public static void main(String[] args) {

//Multidiminsional Array kisa yoldan nasil olusturulur.
        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};
        System.out.println(Arrays.deepToString(arr));

//Bir String Multidiminsional Array'de icinde "a" olan elemanlari concal'a yazdiriniz.

        String brr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for (String [] w: brr){

            for (String k : w ){

                if (k.contains("a"))
                    System.out.print(k+ " ");

            }
        }


    }


}

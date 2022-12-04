package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {


    public static void main(String[] args) {

// Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
//            [2, 3, 12, 0,  0,  0]

        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];
        int ind = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                yeni[ind] = original[i];
                ind++;
            }
        }
        System.out.println(Arrays.toString(yeni));
        System.out.println();
        System.out.println();

        //Example 2: Bir Array'in icinde herhangi bir elemanı olup olmadıgını ve kac kere tekrarlandıgını kontrol eden kodu yaziniz.
        //           [2,1,2,-3,2] ==> Kullanici 2^yi sordu ==> 2 elemani 3 kere tekrarlandi.
        //                        ==> Kullanici 6' yi sordu==> 6 elemani yok ve 0 kere tekrarlandi


        int arr[] = {2, 1, 2, -3, 2};

        int eleman = 8;

        int counter = 0;


        for (int w : arr) {
            if (w == eleman) {
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println(eleman + " Arrayde " + counter + " defa var . ");
        } else {
            System.out.println(eleman + " Array'de yok ");
        }


//Example 3 : Size verilen bir cümledeki en uzun kelimeyi bulunuz.
//           "Java kolaydir calisana, ne kolay ki calismayana."==> calismayana

        String sentence = "Java kolaydir calisana, ne kolaydir ki calismayana.";
        System.out.println(sentence);
        sentence = sentence.replaceAll("\\p{Punct}", "");
        Scanner input = new Scanner(System.in);
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);













    }

}

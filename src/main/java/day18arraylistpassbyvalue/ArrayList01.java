package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {


    public static void main(String[] args) {

//Example 1 : Bir Integer ArrayList'deki 7 haric tum
// elemanlari 2 arttiriniz

        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages) {

            if (w == 7) {
                continue;
            }
//w =w+2; ==> age   List'ler boyle update edilemezler
            ages.set(ages.indexOf(w), w + 2);
        }
        System.out.println(ages);


//Example 2 : Size verilen ArrayList'de 8(inclusive) ve 8'den
// onceki tum elemanlari iki katina cikartiniz.


        List<Integer> heights = new ArrayList<>();

        heights.add(12);
        heights.add(7);
        heights.add(21);
        heights.add(8);
        heights.add(9);

        for (Integer w : heights) {

            if (w == 8) {
                break;
            }
            heights.set(heights.indexOf(w), w * 2);

        }
        System.out.println(heights);


    }
}
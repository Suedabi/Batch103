package day16multidiminsionalarrayslist;

public class MultiDiminsioanlArray02 {

    public static void main(String[] args) {

//Bir multidiminsionaşl array'deki en büyük ve en küçük elemanın toplamını veren kodu yazınız.

        int arr[][] = {{2, 5, 1}, {83, 75}};

        int maxElemant = arr[0][0];

        for (int[] w : arr) {
            for (int k : w) {

                maxElemant = Math.max(maxElemant, k);

            }

        }
        System.out.println(maxElemant);

        int minElemant = arr[0][0];
        for (int[] w : arr) {
            for (int k : w) {

                minElemant = Math.min(minElemant, k);
            }
        }
        System.out.println(minElemant);
        System.out.println(maxElemant + minElemant);


    }

}

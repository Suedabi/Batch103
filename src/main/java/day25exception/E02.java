package day25exception;

public class E02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};
        getElemantFromArray(arr, 2);//Veli
        getElemantFromArray(arr, 0);//Ali
        getElemantFromArray(arr, 4);//ArrayIndexOutOfBoundsException
    }

//Bir String Array'den Index girerek eleman elde edebilmek icin bir method olusturun.

    public static void getElemantFromArray(String arr[], int idx) {
        try {
            System.out.println(arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {
//Bu benim teknik olmayan aciklamam.
            System.out.println("Array index'de bir problem meydana geldi=======> " + e.getMessage());

//Exeption ile ilgili detaylica teknik message verir
            e.printStackTrace();

//Hata message'nin diger message'ler ayirmak icin yazdim
            System.err.println("Array index'de bir problem meydana geldi");
        }


    }


}

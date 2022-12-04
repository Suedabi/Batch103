package day25exception;

public class E03 {

    public static void main(String[] args) {

        String str = "Ali";
        getNumOfChars(str);//3

        String s = "";
        getNumOfChars(s);//0

        String t = null;
        getNumOfChars(t);//NullPointerExeption
        //Eger length() method'unda "null" kullanirsaniz bu exeption'i alirsiniz.

    }

//Bir String'de bulunanan karakterlerin sayisini bulabilmek icin bir method olusturunuz.

    public static void getNumOfChars(String str) {

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.err.println("lenght() method'unda bir problem olustu");

            e.printStackTrace();
//Bu method'u kullandiginiz zaman System.out.println(); kullanmaya gerek yoktur. Cunku print zaten method'un icinde var.
        }


    }

}

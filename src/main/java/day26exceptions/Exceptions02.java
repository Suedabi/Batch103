package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);//'v'
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium", 8);//StringIndexOutOfBoundsException: Eger bir String'den character'ler alirken olmayan bir index kullanirsa
        //                                 StringIndexOfBoundsException alinir.
        System.out.println(ch2);

    }

    public static char getCharFromString(String str, int idx) {
        char cr = ' ';

        try {
            cr = str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index ile ilgili bir problem olustu " + e.getMessage());
            e.printStackTrace();//Detayli "log" icin (Developper'lar daha detayli hata bilgisi almak icin bunu kullanirlar)
        }
        return cr;

    }


}

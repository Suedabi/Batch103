package day18arraylistpassbyvalue;

public class PassByValue01 {

    /*
    1)Java varible'lerin orjinal degerlerini korumak ister.
    2)Variable method'lar icinde kullanildiginda ,Java method'un
      icine orjinal degeri koymaz o degerin kopyasini uretir
      ve method'a o kapyayi yollar. Method kopya ustunde degisiklik
      yapar dolayisiyla variable'nin orjinal degeri korunmus olur
      Bu SisTeme " Pass By Value " denir.
      Note : Java "Pass By Value"  kullanir. "Pass By Reference" kullanmaz.
      Note: Bazi programla dilleri orjinal deger koruma altina
            almamistir. Bu isi developer'lara birakmitir.
            Bu tarz diller "Pass By Reference" kullanir.
     */


    public static void main(String[] args) {

        int x = 5;//Gomlek
        System.out.println(x);//5;

        //static method olan "main method" ' un icindeki her sey
        //static olamlidir.

        change(x);//Ogrenci gomlegi
        System.out.println(x);//Gomlek ==> 5

        int ucret = 100;
        ucret = indirim(ucret);
        System.out.println(ucret);//100
    }

    public static void change(int a) {
        System.out.println(a * 3);

    }
//void dışındaki "return" type'larda method body'si icerisinde
//"return" keyword kullanilmalidir.

    public static int indirim(int gomlekUcreti) {
        return gomlekUcreti - 10;
    }

}

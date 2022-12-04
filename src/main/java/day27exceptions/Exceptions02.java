package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*

    1) FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
       "new" den sonraki "FileInputStream" hata verir.Cunku biz Java'ya verilen adresteki dosya'ya git dedik, Java
       iki endiseye kapildi  i) Ya adres yanlissa   ii) Ya verilen adreste dosya yoksa
       Biz "method isminden" sonra, "throws FileNoFoundException" yazarak Java'ya bu iki endise duydugun dudrum
       olusursa "Exception At" dedik.

    2) while(( k= fis.read()) !0 -1{} yazdigimizda "read()" methodu hata verir. Cunku biz Java'ya dosya'daki
       karakterleri oku dedik. Java bir endiseye kapildi  i) Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
       Biz method isminden sonra "throws IOException" yazarak Java'ya bu durumla karsilastiginda "Exception At" dedik.

    3) Method isiminden sonra "throws IOException" yazarsaniz Java "FileNotFoundException" 'i siler.Cunku;
       "IOException" , "FileNotFoundException" 'i kapsar ."IOException", "FileNotFoundException" 'in parent'idir, onun yaptigi
        her seyi yapabilir o yuzden  "IOException" varken "FileNotFoundException" ' a gerek yoktur.

       "IOException" ," Input Output Exception" demektir.

     4) Gordugunuz gibi "IOException" ve "FileNotFoundException biz kod yazarken daha "run" butonuna basmadan ortaya cikti.
        bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" 'dir .

        "Compile Time Exception" 'lar kesinlikle halledilmelidir (Exception Handing) , halletmeden kod yazmaya devam etmeyiniz.

     */


    public static void main(String[] args) throws IOException {

        readTheTextFromFile();
        readTheText();

    }

    //Bir text file'deki text'i okuyan kodu yaziniz.
//1.yol
    public static void readTheTextFromFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k = 0;

        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }


    }

//2.yol

    public static void readTheText() {
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

            int k = 0;

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varlıgı ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayn bir karakter var.");
        }
    }


}

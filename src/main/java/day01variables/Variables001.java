package day01variables;

public class Variables001 {

    //Variables nasil oluşturulur?

    // 1)Access Modifier 2)Data Type 3) Variables ismi  4) =     5)Deger

    // java'da noktalı virgül cümle sonuna konulan nokta gibidir.
    // java'da "cümle" olarak "statement" kelimesini kullanırız.

    // "=" sembolü "Assignment( Atama) Operatör" olarak adlandırılır.
   // "Assignment (atama) Operator" sağdaki değeri alır soldaki variable'in içine koyar

    public int age = 18;
    public int height = 170 ;


                                  // Java' Data Type'leri
/*

                                       Primite Data Types

1) int: Integer'in kisaltılması. Integer tam sayı demektir.  32 bit bullanır.
        Matematikte tam sayıların bası ve sonu yoktur. Java' tam sayıların başı ve sonu vardır.
        En küçük int: -2,147,483,648
        En büyük int:  2,147,483,647

2) byte : Tam sayılarr için kullanılır.  8 bit kullanır.
          En küçük byte : -128
          En büyük byte :  127

3) short: Tam sayılar için kullanılır  16 bit kullanır.
          En küçük short = -32768
          En büyük short =  32767

4) long : Tam sayılar için.  64 bit kullanır.
          En küçük long = -9,223,372,036,854,755,808
          En büyük long =  9,223,372,036,854,755,807

5)float: Ondalıklı sayılar için kullanılır.   32 bit kullanılır.
         "float" virgülden sonra  16 basamak içerebilir.
         "float" degerlerinden sonra  "f" veya "F" kullanılması gerekir.

6) double : Ondalıklı sayılar için kullanılır.  64 bit kullanılır.
            "double" virgülden sonra 16 basamak içerebilir.

7)boolean: "true" veya "false" degerleri için kulanılır.  1 bit kullanılır.
          Note: Java büyük ve küçük harflere duyarlıdır. Bu yüzde kod yazarken büyük ve küçük harflere dikkat etmeliyiz.

8) char : Tek karekterler için kullanılır
          A, c ,2, ?, -, =
          Note: "char" lara deger verirken , degeri tek tırnak içine almalıyız yoksa Java hata veriri.

Note: Numeric Dta Types : byte< short< int< long< float< double
      Numeric olmaya Data Types : boolean - char



                             Non - primite Data Types
String: isim,adres,kimlik numarası gibi bir veya birden faza karakter içeren degerlerde kullanılır.
        String degerleri mutlaka cift tırnak içine yazılmalıdır.
        String non- primite dir.Yani bir string oluşturduğumuzda Java size bir sürü method veriri.

        Primitive ile Non-primitive lerin farkı nedir?
        1)Non-primitive data type'larınında degerin yanında method'lar vardır.
          Primitive Data typlerinde ise sadece değer vardır method yoktur.
        2)Primitive data type'ları java tarafından oluşturulmuştur ,toplam 8 tane vardır.biz oluşturamayız.
          Non-primitive'ler Java tarfından oluşturulmuştur biz de oluşturabiliriz. Non-primitiveler sayılamayacak kadar çoktur çünkü her developper Non-primitive data type oluşturabilir.
        3)Primitive data type isimleri kucuk harfle başlar.
          Non-primitive data type isimleri büyük harfle başlar.
        4)Primitive data type'lar memory'de farklı büyüklükte yerler kullnırlar.
          Non-Primitive'lerin hepsi memory'de aynı büyüklükte yer kaplarlar.
 */

 public byte gomlek = 12;
 public short populationOfVillage = 23000;

public float priceOfShirt = 13.8567f;
public double weightOfCell = 0.5549558;


    // siz "long" demeniz ragmen Java sayıyı "int" kabul eder.
    // bu yüzden, long bir veriable' "int" aralıgının dışında bir sayı verirseniz mutlaka sonuna "L" veya "l" koyunuz.!!

    public long populationOfWorld = 700000000L ;

    // Burada "L" koymadıgımız halde problem yok çünkü "1234" int aralıgına uyar.
    public long x = 13345;

    public boolean isOld = true ;
    public boolean isRich = false;

    public char initial = 'S' ;

    public String name = "sueda" ;

    public static void main(String[] args) {

        // Note : "main method" arabanın motoru gibidir. Main method olmassa kod çalışmaz.Aynı arabanın motou olmadan çalışmayacapı gibi.
        //        "main method" olmadan hiçbir şey çalışmaz.


    }

}

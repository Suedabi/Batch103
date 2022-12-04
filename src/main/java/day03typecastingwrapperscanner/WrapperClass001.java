package day03typecastingwrapperscanner;

public class WrapperClass001 {

    public static void main(String[] args) {

    /*
            Note: Java primitive lere method'lar ekleyerek yeni bir
                  yapi olusturdu, bu yapiya "Wrapper Class"


              PRİMİTİVE                    WRAPPER

                 byte           ==>          Byte
                 short          ==>          Short
            **   int            ==>          Integer
                 long           ==>          Long
                 float          ==>          Float
                 double         ==>          Double
                 boolean        ==>          Boolean
            **   char          ==>          Character
 */

      byte primitiveByte = 12 ; //  "primitiveByte" yazıp nokta koyduğumuzda hiç byte göremeyiz çünkü primitive'ler method içermezler.

      Byte wrapper = 12;// "wrapperByte" yazıp nokta koyduğumuzda bir çok method görürüz çünkü wrapper'lar çok fazla method içerirler.


        //Example :Byte data type'nşn en küçük ve en büyük degerlerini ekrana yazdırınız.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //Example 2: short,int,long data type'larının en büyük ve en küçük degerlerini ekrana yazdırınız.

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

//"primitive'ler " nasıl "wrapper'lara "cevrilir. (Autoboxing)
        float f1 = 13.99f;
        Float wrapperF1 = f1;

//"wrapper'lar" nasıl   "primitive'lere" cevrilir  (Unboxing)

      Character w1 = 's' ;
      char primitiveW1 = w1;
  //Note: "Autoboxing" ve "Unboxing" Java tarafından otomatik olarak yapılır.

    }

}

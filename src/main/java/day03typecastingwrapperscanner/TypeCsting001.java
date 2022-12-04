package day03typecastingwrapperscanner;

public class TypeCsting001 {

    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //              byte < short < int < long < float < double

    //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
    //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir


    public static void main(String[] args) {

        byte age= 23 ;
        int newAge =age;

        long population = 1234;
        int newPopulation = (int)population ;

        //Example 1: short'u double 'a çeviren kodu yazınız.
        //Example 2: float'ı byte yapan kodu yazınız.


        short villagePopulation = 1200;
        double newVillagePopulation = villagePopulation;  //Auto Widening

        float hucreSayisi = 12.99F ;
        byte newHucreSayisi = (byte) hucreSayisi; // Explicit Norrowing

        System.out.println(newHucreSayisi); //12 ==> Java ondalik sayiyi ,tam sayiya cevirirken yuvarlama islemi yapmaz.
                                            //   ==> Java ondalik sayiyi , ytam sayiya cevirirken ondalik kismini siler.
int number = 515 ;
byte newNumber = (byte) number ;

System.out.println(newNumber); // 3 ==> Java 515 i 256 ya bölfü ve bizekalanı verdi.

  int num = 510 ;
  byte newNum = (byte) num;

        System.out.println(newNum);//-2
    }


}

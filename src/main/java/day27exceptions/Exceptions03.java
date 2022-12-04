package day27exceptions;

public class Exceptions03 {

    /*

    1)Java Exception'lar olusturarak Developer'larin Java kurallarina uymalarini temin etmistir.
    2)Biz de Application uretirken kendi Exception'larimizi olusturarak diger Developer'larin bizim ortaya koydugumuz kurallara uymalarini temin ederiz.
    3)Bizim urettigimiz Exception'lara "Custom Exception" denir.
    4)"Custom Exception" 'lar da "RunTimeException" ve "CompileTimeException" olabilir.
    5)Custom "RunTimeException" uretmek icin "extends RunTimeException" deriz.
    6)Custom "CompireTimeException" uretmek icin "extend Exception" deriz.

     */


    public static void main(String[] args) throws IllegalGradeException {
        printGrades(-60);

        checkNameFormat("Ali");

    }

    // Ogrencilerin notlarini yazdiran bir method olusturunuz.
    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade < 0 || grade > 100) {
            throw new IllegalGradeException("Grade 0'dan az 100'den cok olamaz");
        } else {
            System.out.println(grade);
        }


    }

    //Verilen ismin ilk harfinin buyuk harf olmamamasi durumunda Exception atan method yaziniz.

    public static boolean checkNameFormat(String name) {

        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            System.out.println(name);
            return true;
        } else {
            throw new IlleagalNameException("Isimler buyuk harfle baslamalidir");
        }

    }


}
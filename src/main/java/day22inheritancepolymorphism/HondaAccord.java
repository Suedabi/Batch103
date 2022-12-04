package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    /*
    1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir,cunku
      Java Class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
      constructor'in sart oldugunu bilir.
    2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "defoult constructor" denir.
    3)Siz kendiniz herhangi bir conctructor olusturdugunuzda Java "defoult constructor"'i siler.
    4)Bir Class'da birden fazla constructor olabilir.Fakat bu constructor'larin parametre'lri farkli olmalidir.
    5)"this" keyword "Bu Class" anlamindadir "this.price" demek bu Class'daki "price" isimli variable demektir.
        "this.price" syntax'i constructor'larin icinde kullanilir.
    6)Constructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
      Class'daki variable degerlerini degistiremez...
     */

    public int price;
    public int year;
    public String model;
    public String make;

    public HondaAccord() {

    }

    public HondaAccord(int price) {
        this.price = price;
    }

    public HondaAccord(int price, int year) {
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String model, String Make) {
        this.price = price;
        this.year = year;
        this.model = model;
        this.make = model;
    }


}

package day29abtractioncollections;

/*

    "abstract method"'lar sadece ne yapilacagini soyler. (what to do).
    "concrete moethod"' ne yapilacagıyla birlikte nasil yapilacagini da soyler.(How to do).

    "interface" 'ler bir yapiacak ister listesidir.(to do list).

    "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu method'larin
    return type'lari ayni olmalidir. Aksi taktirde hata verir.

    "interface" 'lerde constructor olmadigi icin interface'lerden object olusturulamaz.
    "abstract class"'larda class olduklari icin constructor vardir. Ama constructor class'larda object olusturulamaz.

    Soru : "Abstract Class" ile "Interface" 'nin farklari nelerdir.
           1)Method
                "Abstract Class" hem abstract hem de concrete method'lar icerebilir.
                "Interface" 'ler ise sadece abstract methodlar icerir.
                Ama istersek interface'ler icinde de "defoult" ve "static" keyword'lar kullanarak concrete method'lar olusturabiliriz.

           2)Variable
                "Abstract Class" 'larda normal Class'lardaki gibi her turlu variable olusturulabilir.
                "Interface" 'ler ise variable'lar public static ve final olmak zorundadir.'

           3)Inheritance
                "Abstract Class" 'lar class olduklari icin multiple inheritance'a musade etmezler.
                "Interface"'ler ise multiple inheritance'i desteklerler.

           4)Object Creation
                "Abstract Class" 'larda constructor vardir ama object olusturmada kullanilmazlar.
                "Interface" 'lerde ise constructor olmadigindan object olusturulamazlar.

Soru : Object Oriented Programing Language prensipleri nelerdir?
        i)Inheritance  ii) Polymorphism   iii)Encapsulation  iv)Apstraction

 */


public class Civic implements Engine, Ac {


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}

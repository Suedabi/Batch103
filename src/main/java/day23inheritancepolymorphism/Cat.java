package day23inheritancepolymorphism;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cats meow");
    }

    @Override   //@Overright annotation'ini kullanara , Java'nin yaptigimiz Override islemini kontrol etmesini saglariz.
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a + b + 1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b + 1;
    }

    //Asagidaki method"Overiding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }


    /*
         1)Override yaparken sadece "method'un body'si" degistirilir.
         2)Override yaparken ASLA "method signature'a (isim ve parametre)" degistirlemez.
         3)Override yaparken "Inheritance" olmak zorundadir.
         4)Override yaparken "Acces Modifier'lar" belirli kurallara gore farklilastirilabilirler.
          i)"Private" methodlar Override edilemezler
          ii)Child Class'daki "Override edilen" method'un Acces Modifier'i Parent Class'daki
             method'un Acces Modifier'i ile ayni veya daha kapsayici (genis) olmalidir.
     NOTE:Child Class'daki method'un Acces Medifier'i daha dar olamaz.
         iii)defoult method'lar ayni package icindeyse Override edilebilirler,
             farkli package icindeyse Override edilemezler.
          5)Parent Class'daki method'un "return type'i" void ise "return type" degistirilemez
          6)Parent Class'daki method'un "return type'i" primitive ise "return type" degistirilemez.
          7)Parent Class'daki method'un "return type'i" Wrapper Class ise "return type" degistirilemez.
          8)Parent Class'daki method'un "return type'i" Parent Class ise "return type" Child'lardan biri olabilir.
     NOTE:Child Class'daki return type Parent Class'dakinden genis (daha kapsayici) olamaz.
     NOTE:Aralarinda Parent Child iliskisi olmayan Class'lar Overriding'de Return Type degisiminde
          kullanilamazlar. Mesela "Short","Integer'dan" kucuktur, fakat aralarinda "Parent Child" iliskisi
          olmadigindan "Integer" yerine "Short" kullanamazsiniz.
     NOTE:Child'daki metod'un Return Type'indan Parent'daki method'un Return Type'ina gidiste
          "IS A"Relationship olmali.
     NOTE:Parent'daki method'un Return Type'indan Child'daki method'un Return Type'ina gidiste
          "HAS A" Realitionship olmali.
     NOTE:Aralarinda "IS A" ,"HAS A" Realitionship olan Data Typle'lara "Covariant" denir.
          9)Child<Parent ==>IS A (Her kedi hayvandir ama her hayvan kedi degildir.)
                            HAS A ==> Hayvanlar kedileri icerir ama kediler tum hayvanlari icermez.
         10)"final" Method'lar Override edilemzler, cunku "Overriding" de method body degistilir.
            "final" method body degistirilmesine musade etmez.
         11)Polymorphism = Overloading + Overriding
    NOTE:Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin
    12)Overloading ile Overriding'in arasindaki farklar nelerdir?
       a)Overloading icin "Inheritance" gerekmez fakat Overriding icin gerekir.
       b)"private" method'lar Overload edilebilir. Override edilemezler.
       c)"final" method'lar Overload edilebilir. Override edilemezler.
       d)"Overloading" "static polymorphism" olarak, "Overloading" "dynamic polymorphism" olarak adlandirilir.
          Cunku "static" method'lar Overload edilebilir, Override edilemezler.
       e)"Overloading"'de method signature degisirama "Overloading " method signature'a dokunulmaz.

     */


}

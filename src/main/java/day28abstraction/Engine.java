package day28abstraction;

public interface Engine {

    /*

      1)Atomic olsun diye "parent"'i parcaladim ama bir "Child Class" 'in birden fazla "parent"'i olsu,
      bu ise Jva'da mumkun degildir.Cunku Java "multiple Inheritance" 'i destedklemez.

      "multiple Inheritance" Class'larda mumkun degildir fakat Java "Inheritance" isimli yeni bir yapiolusturdu
      bu yapida "multiple Inheritance" 'a musade etti.

      2)Interface'lerdki tum method'lar "apstract" oldugu icin "interface" 'lere "fully abstraction" denir.
        "Abstract Class'larda" abstarct method ve  "concrete method" bir arad kullanildigi icin
        "Abstract Class'lara "fully abstarction " denmez.

     */

    //Interface'lerdeki tum method'lar "abstract" olmak zorundadir.
    //Interface'lerde abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
    //Cunku Java o method'un abstract oldugunu bilir.

    //Interface'lerdeki method'lar otomatik olarak "public" olarak kabul edilir. Bu yuzden
    //o method'lar icin "public" yamaya gerek yoktur.

    //"public abstract void eco();" ile "void eco();" ayni anlama gelir.
    void eco();

    void gas();

    void tsi();

    //defoult keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    //Asagidaki non-static method'dur.
    public default int add(int a, int b) {
        return a + b;
    }

    //static keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    //Asagidaki methos static method'dur.
    public static String update(String str) {
        return str + "!";
    }

}

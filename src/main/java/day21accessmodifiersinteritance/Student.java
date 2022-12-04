package day21accessmodifiersinteritance;

public class Student {


    /*
        Acces Modifier
        1)public   2)protected  3)default(Access Modifier'i default yapmak icin access modifier yazmayiz)    4)private

    Note: Acces Modifier'lari en genisten dara dogru sayiniz.
          public > protected > default > private
    Note: Acces Modifier'lari birer birer aciklayiniz.
          public olanlar her class'dan kullanilabilir.
          protected olanlar baska package'lerden kullanilamazlar ancak baska package'de "child class" icinden kullanilabilir
          default olanlar baska package'dan kullanilamazlar
          private olanlar sadece olusturulduklari Class icinde kullanilabilir.
    Note: protected ile default'un farkini soyleyiniz
          protected olanlara package'in dısında cikildiginda "child class" ile ulasabiliyoruz
          default olanlara package'in disina ciktigimizda asla ulasamiyoruz.
    Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
          public,default kullnilabilir ama protected ve private kullanilamaz.

     */

    //public her class'dan kullanilabilir
    public String stdName = "TomHanks";

    //protected olanlar baska packege'lerden kullanilamaz. ancak baska package'de "child class" icinde kullanilabilir.
    protected String address = "Miami";

    //default olanlar baska package'den kullanilamazlar
    String email = "tomhanks@gmail.com";

    //private olanlar sadce olusturduklari Class icinde kullanilabilirler.
    private String stdId = "20206517004";


}

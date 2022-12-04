package day02methodcreation;

public class CarNew {

    public String marka = "Honda";

    public int fiyat = 20000;

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //1)Class ismini yaziniz     2)Objeye bir isim veriniz     3) =        4)new keyword'unu kullan        5)Class ismi parantezle beraber(Constructor)
        Car myHonda = new Car();

        System.out.println(myHonda.fiyat);

        System.out.println(myHonda.marka);
myHonda.dur();
myHonda.hareketEt();


MethodCreationNew obj = new MethodCreationNew() ;
        System.out.println(obj.toplamaYap(8,6));

    }


    public void hareketEt() {
        System.out.println("honda çpk güzel hareket eder...");
    }

    public void dur() {
        System.out.println("Honda çok hızlı bir şekilde durabilir.");
    }
}




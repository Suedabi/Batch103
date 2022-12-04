package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {

//Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.
//Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
//O Class'bulamazsa Parent Class'da arar.
//Hicbir Class'da bulamazsa hata verir.

        Cat cat1 = new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45


        Mammal cat2 = new Cat();
        System.out.println(cat2.a);

        Animal cat3 = new Cat();
        System.out.println(cat3.a);

//Object olusturken Object'in data type'i Child Class'lardan secilmez.

//Inheritance'da variable'lar secilirken Java Constructor'a bajar
//Oncelikle istediginiz method'u Constructor'i kullanilan Class'dan alir.
//O Class'da bulamazsa Parent Class'lara bakar
// Hiçbir Class'da method'u bulmamazsa hata verir.

        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();

        Animal cat6 = new Animal();
        cat6.eat();


    }


}

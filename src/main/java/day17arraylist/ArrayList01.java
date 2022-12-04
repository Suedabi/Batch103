package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);
        System.out.println(names);


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsine");

        boolean sonuc1 = names.containsAll(myNames);//Bir list'in icinde coklu elemanlarin olup olmadigini kontrol eder.
        System.out.println(sonuc1);              //Hepsi varsa true , en az biri yoksa false verir.


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);
//Example 1 : "a" Liast'inde "Shoes" elamninin ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a);

//Example 2 : "Shoes" elemaninin tum gorunumlerinini siliniz.

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);

//Example 3 : Bir tane salary listi olusturun eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz.,

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);

//Example 4 : iki Array'İn eşit olup olmadıgını kontrol eden kodu yaziniz.
//Note : iki ArrayList'in esit olabilmesi icin, elemanlar esit olmali ve ayni elemanlar ayni index'te esit olmali.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');


        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');


//1.yol:
        int counter = 0;  //flag
        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler eşit değil");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler eşit değil");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Listler esşittir");
        }


        //2.yol
        boolean esitMi = m.equals(n);

        if (esitMi) {
            System.out.println("Listeler esittir");
        } else System.out.println("Listeler esit degildir");


    }


}

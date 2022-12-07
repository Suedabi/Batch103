package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*

       1)HashTable bir map'dir.
       2)HashTable EntrySet'leri herhangi bir siralamaya tabi tutmaz.
       3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchranized'dir
       4)HashTable'larda key null olamaz. Kry'i null yaparsaniz NullPointerException atar.
       5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.


      Note: toString() method2u obje'leri konsolda detayli olarak gorebilek icin class'larin icinde olusturulur.
            toString() method'unu olusturmadan object'i consol'a yazdirirsaniz Java o objec'nin adresini yazdirir.

     */


    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);//{USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null,90000000);//HashTable'larda key null olamaz, NullPointerException veririr.
        //countryPopulations.put("France",null);//HashTable'larda value null olamaz ,NullPointerException atar.


        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "themail.com", 21, true));
        System.out.println(myStudents);


        String name = myStudents.get("Math").name;
        System.out.println(name);//null

        Integer age = myStudents.get("Math").age;
        System.out.println(age);


    }


}

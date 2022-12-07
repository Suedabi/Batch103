package day32maps;

import java.util.*;

public class TreeMap01 {

    /*
       1)TreeMap'ler entrySet'leri key'lere gore "natural order" 'da siralar.
       2)TreeMap mapler arasindaki en yavas map'dir.
       3)TreeMap'ler thread-safe ve syncronized degildir.

     */


    public static void main(String[] args) {


        TreeMap<String, Double> salarys = new TreeMap<>();
        salarys.put("Tom Hanks", 3000.00);
        salarys.put("Mary Star", 1000.00);
        salarys.put("Jimmy Jones", 5000.00);
        salarys.put("Kevin Bridgeman", 6000.00);

        System.out.println(salarys);//{Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailMap() verilen key'den baslayarak sona kadar tum entry'leri size verir.
        SortedMap<String, Double> map1 = salarys.tailMap("Kevin Bridgeman");
        System.out.println(map1);//{Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailMap(String,Boolean) verilen key'den baslayarak sona kadar tum entry'leri size veririr ama sizin verdiginiz key'i haric tutar.
        SortedMap<String, Double> map2 = salarys.tailMap("Kevin Bridgeman", false);
        System.out.println(map2);//{Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String, Double> map3 = salarys.subMap("Kevin Bridgeman", true, "Tom Hanks", false);
        System.out.println(map3);//{Kevin Bridgeman=6000.0, Mary Star=1000.0}

        //lowerEntry("Paris Hilton") Paris Hilton'dan bir oncesini verir,Paris Hilton olmasa da sanki varmis gibi davranir.
        Map.Entry<String, Double> map4 = salarys.lowerEntry("Mary Star");
        System.out.println(map4);//Kevin Bridgeman=6000.0

        Map.Entry<String, Double> map5 = salarys.ceilingEntry("Mary Star");
        System.out.println(map5);//Mary Star=1000.0

        //higerEntry("Mary Star") Mary star'dan bir sonrakini verir.
        Map.Entry<String, Double> map6 = salarys.higherEntry("Mary Star");
        System.out.println(map6);//Tom Hanks=3000.0

        //ceilingEntry(); var olan key ile kullanilirsa o key'i verir.Var olmayan bir key ile kullanilirsa bir sonrakini verir.
        Map.Entry<String, Double> map7 = salarys.ceilingEntry("Paris Hilton");
        System.out.println(map7);//Tom Hanks=3000.0

        Map.Entry<String, Double> map8 = salarys.higherEntry("Tom Hanks");
        System.out.println(map8);//null  ==> Cunku Tom Hanks'den sonra eleman yok

        //floorEntry() methodu kendisinden bir onceki degeri veririr. Eger kendisinden once yoksa kendisini verir.
        Map.Entry<String, Double> map9 = salarys.floorEntry("Mary Star");
        System.out.println(map9);//Mary Star=1000.0

        //Burada deger olmadıgı icin eger deger olaysı nerde olurdu ve bundan onceki ne ona gore deger yazdirir.
        Map.Entry<String, Double> map10 = salarys.floorEntry("Paris Hilton");
        System.out.println(map10);//Mary Star=1000.0


    }


}

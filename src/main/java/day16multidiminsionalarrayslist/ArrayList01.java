package day16multidiminsionalarrayslist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    /*
    ArrayList'ler aynı data tipine sahip birden fazla data tipini depolamak için kullanılır.
    Array ile ArrayList'in farkı nedir ?
    1)Array oluştururken Array'in icine kac tane eleman koymamız gerektigini söylemeliyiz ve söyledigimiz eleman sayisindan fazla elaman koyamayız.
        Array'ler eleman sayisindan "fixed" dirler
        ArrayList'leri oluştururken eleman sayisinin söylemeye gerek yok cünkü ArrayList'ler eleman sayisinda "flexible"(esnek) dirler .
    2)Array'lerin icine "primitive" ve "reference"'ler konabilir
      ArrayList'lerin icine ise sadece "non-primitive"'ler konulur.
    3)Array'ler super fast'dir ,(cok hizli). Array'ler memory i cok az kullanilir.
Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz
      Eleman sayisi dagisken olan coklu data icin Array kullanma riskini almayin.

     */

    public static void main(String[] args) {

//ArrayList nasil olusturur?

//1.yol
        ArrayList<Integer> ages = new ArrayList<Integer>();

//2.yol
        ArrayList<Integer> hights = new ArrayList<>();

//3.yol
        List<Integer> nums = new ArrayList<>();

//ArrayList'ler nasil yazdirilir?
        System.out.println(nums);

//ArrayList'lere nasil eleman eklenir?
//add() her zaman elemani en sona ekler.  (insertion order).
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);

        nums.add(1, 50);
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);
        System.out.println(prices);

        nums.addAll(2, prices);
        System.out.println(nums);

//ArrayList'lerin eleman sayisi nasil bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);

//ArrayList'lerde herhangi bir eleman nasil secilir?
//get() methodu istenen bir index'teki elemani verir.
        int el1 = nums.get(3);
        System.out.println(el1);

//ArrayList'in bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);

//ArrayList'de bir eleman nasil degistirilir?
        nums.set(3, 200);
        System.out.println(nums);

//Example 1 : nums ArrayList'indeki tüm tek sayilari 11 arttırdiktan sonra ekrana yazdiriniz.

        for (int w : nums) {
            if (w % 2 != 0) {

                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println(nums);


//remove methodunun icine tam sayi koyarsaniz java onu index olarak kabul eder.

//Example 2 : ArrayList'den 34 elemaninin ilk görünümünü siliniz.
//Note : Tüm tam sayilar Java icin aksi soylenmedikce primitive'dir yani "int" dir
//Note 2 : "Primitive'ler" ArrayList'lerin elemani olamazlar.
//Not 3 : "Primitive'i"   "Wrapper Class'a" cevirirseniz, non-primitive olur ve non-primitive'ler ArrayList'ler elemani olur ,index olmaz.

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);

    }


}

package day31maps;

import java.util.HashMap;

public class HashMap02 {

    /*
       1)Siz "HashMap<String, Double> salaries = new HashMap<()" kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi olusturur ve
         bu yapidaki herbir kutuya index verir. Index'ler 0'dan 15'e kadardir.
       2)Siz "salaries.put("QA",110000.00);" kodunu yazdiginizda Java key icin bir HashCode olusturur bu HashCode'u 15'e boler ve kalani index olarak kullanir.
         v ebu elemani o index' e yerlestir.
       3)Yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode"'u ,ikinci bolumune "key"'i ,ucuncu bolume "value"'yu ve dorduncu bolumune
         "pointer"'i koyar. Bu cok bolumlu yapi LinkedList'lerde "Node"'dur yani HashMap bucket'lara koydugu data'yi LinkedList olarak depolar.
       4)Java "null" icin hep HashCode olarak "zero" uretir, o yuzden key null oldugunda
         eleman ilk bucket'a yerlestirilir. Bundan dolayi key'si null olan elemanlar Mapin icinde
         genellikle ilk sirada gozukurler.
       5)Java normalde Code'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin
         ayni HashCode uretilebilir. Buna "Hash Collision " denir. Hash Collision mushur bir
         Java Development probleminidir. Bu problem ile karsilasildiginda developer'lar bu problemi cozemek icin kodlar yazarlar, ama bu
         Core Java'nin konusu degildir.
     */


    public static void main(String[] args) {


        HashMap<String, Double> salaries = new HashMap<>();

        salaries.put("QA", 110000.00);
        salaries.put("Dev", 130000.00);
        salaries.put("Sales Force", 125000.00);


    }


}

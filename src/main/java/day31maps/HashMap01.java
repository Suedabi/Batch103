package day31maps;

/*

1)Map'ler key-value structure kullanir.
2)Key'ler unique'dir.
3)Value'lar tekrarli data icerebilir.
4)Map'lerde eleman degil EntrySet kullaniriz.
5)Key'ler null tekrarsiz olarak kullanilir.
6)Value'lar null kabul eder.
7)HashMap'ler EntrySet'leri herhanigi bir siralamaya tabi tutmaz,rastgele siralar.
8)Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisirlar.

 */


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();

        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 83);
        studentAges.put("Cuneyt", 75);
        studentAges.put(null, 55);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);
        studentAges.put("Ali", 83);//Ayni key degerini tekrar kullandigimizda hata vermez "overwrite" yapar.

        System.out.println(studentAges);//{null=55, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=83, Brad=12, Cuneyt=75, Ali=83}


//Map'den sadece key'ler nasil alinir.
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

//Map'den sadece value'lar nasil alinir.

        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[55, null, null, 21, 83, 12, 75, 83]


//Belli bir key'e ait value nasil alinir.
        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge);//75

//Example 1 : Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz.

        Collection<Integer> ages = studentAges.values();

        Integer sum = 0;
        double counter = 0;

        for (Integer w : ages) {
            if (w != null) {
                sum = sum + w;
                counter++;
            }

        }
        System.out.println("Ortalama yas :" + (sum / counter));//Ortalama yas :54.833333333333336

//Example 2 : A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
//            [null,Ayhan Isik, Sadri Alisik,Tom,Ajda,Brad,Cuneyt,Ali]

        int sum1 = 0;

        Set<String> names = studentAges.keySet();

        for (String w : names) {
            if (w != null && !w.startsWith("A")) {
                sum1 = sum1 + w.length();


            }
        }

        System.out.println(sum1);//25

        //remove("Ajda" ,83) key'si Ajda ve value'su 83 olan EntrySet'i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 83);
        System.out.println(result);//true
        System.out.println(studentAges);//{null=55, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=83}


        Integer result1 = studentAges.remove(null);
        System.out.println(result1);//55
        System.out.println(studentAges);//{Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=83}

//key varsa value'u ver ,key yoksa sizin istediginiz degeri verir.
        Integer result2 = studentAges.getOrDefault("Brad", 0);
        System.out.println(result2);//12

//Value null ise ekleme yapar,value null degilse ekleme yapmaz.
//putIfAbsent methodunu yazdirdigimizda bize kendi valuesunu verir eger value null ise listdde key'in valusunu verilen velue ile degistir.
//eger value'nun list'deki degeri null degilse hic bir sey olmaz. Listde value degeri sabit kalir.

        Integer result3 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result3);//null
        System.out.println(studentAges);//{Ayhan Isik=null, Sadri Alisik=100, Tom=21, Brad=12, Cuneyt=75, Ali=83}

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4);//null
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=100, Tom=21, Brad=12, Cuneyt=75, Ali=83}

//Key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);//null
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=83}

//replace() method'u value'lari key bakarak degistirdi.

        studentAges.replace("Acun Ilicali", 49);
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=83}

//replace() method'u value'lari key ve value'yu kontrol ettikten sonra degistirdi.

        studentAges.replace("Acun Ilicali", 49, 53);
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=83}

//Example 3 : Map'deki herbir entry'i ekrana farki bir satirda olacak sekilde yazdiriniz.

        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir.
        Set<Map.Entry<String, Integer>> entries = studentAges.entrySet();

        for (Map.Entry<String, Integer> w : entries) {
            System.out.println(w);
        }


    }


}

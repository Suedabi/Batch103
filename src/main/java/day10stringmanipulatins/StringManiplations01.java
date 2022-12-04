package day10stringmanipulatins;

public class StringManiplations01 {


    public static void main(String[] args) {

String a = "Java kolaydır " ;


//starWith("V" ,2) ; kodu ile ilk 5 karakterden sonraki stringe bakar ve o String'in "V" ile başlayip başlamadiğini kontrol eder.
//"V" ile başlıyorsa "true" başlamiyorsa "false" return eder.
boolean b =a.startsWith("v",2);
System.out.println(b);

 //replaceFrist("a" ,"*" ) ;kod String'deki ilk"a" 'yi "*" 'e çevirir.
 String c= a.replaceFirst("a","*");
 System.out.println(c);

 //replace("a","*") ;kod String'deki tüm "a" 'lari "*"'a çevirir.
 String d= a.replace("a","*");
 System.out.println(d);

 //concat methodu iki tane Stringi birbirine yapıştrmaya yarar.
 //"Concatenation" islemi iki türlü yapilabilir;i)+ile ii)concat() ile
 //Java bir işlem için method üretmişse o methodü kullanmak "best practice"'dir

 String e = a.concat("Anladin mi ? ");
 System.out.println(e);

 String f ="  Sueda    ";
 System.out.println(f);

 //trim() methodu String'in baş ve sondaki space karakterlerini siler aradaki space karakterlerine dokunmaz.
 String g =f.trim();
 System.out.println(g);


 String h = "Jbva";
 String i = "java";

 //h.compereTo(i) ;kod iki tane String'i alfabetik (lexicograpic) olarak karşılaştırır.
 // Büyük harf ve küçük harfe duyarlıdır.
 //Büyük harf küçük harfe duyarsız olmasını isterseniz "compareToIgnorcase(i)" ; kullanabilirsiniz.
 //hcompareTo(i); kodda "h"'nin alfabetik sirasindan "i" nin alfabetik sirasini çikartir.

 int k =h.compareToIgnoreCase(i);
 System.out.println(k);


 //a.repat(5) ; kodu "a" String'ini yan yana 5 kere yapiştirir.
 //Java dökümantasyonuna ulaşmak için == Windows==> ctrl'e basili tutun
 //repeat(0) ; empty String return eder.
 String l=a.repeat(5);
 System.out.println(l);




    }
}

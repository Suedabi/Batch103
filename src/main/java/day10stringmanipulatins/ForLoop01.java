package day10stringmanipulatins;

public class ForLoop01 {

    public static void main(String[] args) {


//Example 1 : ekrana 5 kere "Hi" yazdiriniz.

//Tekrarli isler icin "loop" kullaniriz
//Dort cesit "loop" vardir ; i) for-loop ii) while-looop  iii)do-while-loop  iv)for-each-loop

//i)for-loop
//Example 2 : Ekrana 5 kere "Hi" yazdiriniz


//  Baslangic degeri Loop hangi sart altinda calisacak  Increment (Arttirma) Decrement (Azaltma)
for ( int i =1 ; i<6; i =i+1 ){
System.out.println("Hi");
}


//Example 3 : 4 den 17 ye kadar tüm tam sayilari ekrana ayzdiran kodu yazdirin .

for (int d= 4 ; d<18; d=d+1){
System.out.println(d);

}

//Example 4 : 14 den 5 e kdar tum sayilari ekrana yazdiriniz.

for ( int f =14 ; f>4  ; f--){
System.out.println(f);
}

//Example 5 : 14 de 5 e kadra tum çift sayilari yazdiriiz.

//1.yol
for (int s=14 ; s>4  ; s=s-2 ){
System.out.println(s);
}

//2.yol

for (int r=14; r>4 ; r--) {
if (r % 2 == 0) {

System.out.print(r + " ");
    }
}

//Example 6 : 28 den 5 e kadar tum cift tamsayilari ekrana yadiran kodu yaziniz.

for (int m = 28 ; m>4 ; m--){
if (m%2==0){
System.out.println(m);
}
}

//Example 7 : 28 den 157 e kadar tum cift tamsayilari ekrana yadiran kodu yaziniz.

for (int n = 28 ; n<158 ; n++ ){
if (n%2==0){
System.out.print(n+ " ");
}
}

//Example 8 : 28 den 157 e kadar tum tek tamsayilari ekrana yadiran kodu yazdirirniz.

System.out.println();

for (int o = 28 ; o<158 ; o++ ) {
if (o%2 != 0){
System.out.println(o);
}
}

System.out.println();

//Example9 : "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz.

String str = "Java";

for (int b = 0 ; b<str.length() ; b++ ){
System.out.print(str.charAt(b) + "*");
}

System.out.println();

//Example 10: Size verilen String'de tekrarsız karakterleri ekrana yazdiriniz.
//           "Hellooo Ali" ==> HeAi

String v = "Hellooo Ali";

for (int y = 0 ; y<v.length(); y++){
char c = v.charAt(y);

if (v.indexOf(c)==v.lastIndexOf(c)){
System.out.print(c);

}
}






        }


}

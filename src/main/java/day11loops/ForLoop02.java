package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

//Bir String'deki "m" harfleri tüm harfleri yazdiriniz.
// Andromeda ==> Androeda

        String str = "Anmdromedma";

//1. yol:
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);

            }
        }

//2.Yol:
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c == 'm') {
                continue;//Bosveeeer! ==> Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz.
            }

        System.out.print(c);

    }
     System.out.println();
//Example 2: 1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

for (int x =1 ;x<101 ; x++){
if (x%6==0)  {
    continue;
}
System.out.print(x + " ");
}

System.out.println();
//Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
//           Luxemburg ==> Luxe

String z = "Luxemburg";

for (int i=0;i<z.length();i++){
char p =z.charAt(i);
if (p=='m'){
break;
}
System.out.print(p);
}





    }
}

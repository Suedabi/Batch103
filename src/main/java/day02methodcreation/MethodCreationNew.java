package day02methodcreation;

public class MethodCreationNew {
  //main method içerisinde kullanılan her şey "static" olmalıdır çünkü main method static dir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));

  System.out.println(ucCarpamaYap(2,1.5,6));

  System.out.println(hemToplaHemCarp(8,9,3));

  // sout yazıp "Enter" a basarsak karşımıza System.out.println() otomatik olarak gelecektir.
  // ekrana bir şey yazdırmak için iki tane farklı yol vardır 1) Sytem.out.println()  2) System.out.print eğer ikincinci yolu yaparsak sadece o satırı çalıştırır. ama eğer birinci yolu yaparsak o satırı yazdırıp alttaki satıra geçer.


     }

// 1: Toplama işlemi yapan bir method oluşturunuz.

    public static double toplamaYap(double a , double b ){

        return a+b;
}

//Example 2: üç sayıyı birbiriyle çarpan bir method oluşturunuz.

    public static double ucCarpamaYap(double a, double b , double c) {

        return a*b*c ;
    }
//Example 3: uc sayıdan ilk ikisini toplayıp ucuncu ile carpan method olusturup, sonucu ekrana yazıralım.

    public static double hemToplaHemCarp ( double a, double b, double c) {
         return  (a+b)*c ;
    }

}

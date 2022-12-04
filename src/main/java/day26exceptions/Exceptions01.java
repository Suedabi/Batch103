package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);//128

        String st = "1a2b";
        int res = convertStringToInteger(st);//NumberFormatException: Eger icinde rakamdan farkli character barindiran bir String'in
        //                       valueOf() methodu kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.
        System.out.println(res + 5);

    }

    public static int convertStringToInteger(String str) {
        int i = 0;

        try {
            //Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer. try icindeki sonraki kodlari calistirmaz.
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");

        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String:'ler Integer'a cevrilmez.");


        }
        return i;

    }


}

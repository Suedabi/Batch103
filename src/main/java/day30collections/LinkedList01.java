package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hanks");

        System.out.println(names);//Chris, Alexandre, Mark, Tom, Jeremy, Hanks]

        // Retrieves, but does not remove,first element of this list.
        //     * @return the head of this list, or {@code null} if this list is empty
        //Bize list'in ilk elemanini verir.
        String finalEl = names.peek();
        System.out.println(finalEl);//Chris

        System.out.println(names);


        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();
        System.out.println(first);//null

        //Retrieves and removes the head (first element) of this list.
        //     * @return the head of this list, or {@code null} if this list is empty
        //Bize birinci elemani verir ve siler. pop dan farki pop eger list bos ise hata veririr pool hata vermez "null" verir.
        String delete = names.poll();
        System.out.println(delete);//Chris

        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hanks]

        //Retrieves, but does not remove, the head (first element) of this list.
        //     * @throws NoSuchElementException if this list is empty
        //Bize birinci elamni verir ve silmez
        //eger list bos ise null vermez "NoSuchException" return eder.
        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hanks]

        //Retrieves, but does not remove, the first element of this list,
        //     * or returns {@code null} if this list is empty.
        //peek and peekFirs is same
        //Bize list'in ilk elemanini veriri fakat silmez eger bos ise "null" return eder."peek" methodu ile aynidir.
        String p = names.peekFirst();

        //Example 1 : "A" ile baslayan tum isimleri "*****" 'e ceviriniz.

        LinkedList<String> student = new LinkedList<>();

        student.add("Chris");
        student.add("Louis");
        student.add("Noah");
        student.add("Aiden");
        student.add("Tony");
        student.add("Hanry");
        System.out.println(student);//[Chris, Louis, Noah, Aiden, Tony, Hanry]

        for (String w : student) {
            if (w.startsWith("A")) {
                student.set(student.indexOf(w), "*****");
            }
        }

        System.out.println(student);//[Chris, Louis, Noah, *****, Tony, Hanry]

        //Interview sorusu:
        //Example 2 : List'deki dort harften cok fark iceren isimleri siliniz.
        //Eleman sayisini azaltacagimiz icin i'ye ihtiyacimiz var o yüzden for-each loop degil for loop kullaniyoruz.

        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).length() > 4) {
                student.remove(student.get(i));
                i--;
            }
        }
        System.out.println(student);//[Noah, Tony]


    }


}

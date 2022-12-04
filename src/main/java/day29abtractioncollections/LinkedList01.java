package day29abtractioncollections;

import javax.swing.text.AbstractDocument;
import java.util.LinkedList;

public class LinkedList01 {

    /*

       1)LinkedList'deki her eleman iki bolumden olusur.  i)Data   ii)Pointer
       2)LinedList'deki herbir eleman "Node" olarak adlandirilir.
       3)LinkedList'ler eleman ekleme ve eleman cikarmada cok basarilidirlar.
       4)LinedList'ler eleman arama islemlerinde basarisizdirlar.
       5) 3. ve 4. maddelerden dolayi elelman ekleme cikarma isleminin cok yapilacagi durumlada LinkedList kullanilmalir.
       6)ArrayList'ler index kullanir LinedList'ler index kullanmaz.
       7)Index kullanmak eleman bulma islemlerinde cok basarilidir. Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayLis kullanmalisiniz.

     */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");

        visitors.add(2, "Angelina Jolie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //LinkedList'ler ekleme ve cikarma islemlerinde cok basarli oldugunda ekleme ve cikarma ile alakali cok fazla method icerir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

       /*

     *Removes and returns the first element of this list.
     *This method is equivalent to {@link #removeFirst()}.
     * @return the element at the front of this list (which is the top)
     * @throws:
     NoSuchElementException if this list is empty

     pop verilen ilk elemani bize gösteriri ve siler.
        */

        String firstEl = visitors.pop();//Cut+Paste ==> Ctrl+x
        System.out.println(firstEl);//"Tom"

        System.out.println(visitors);//[Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]


        LinkedList<String> myList = new LinkedList<>();

        //myList.pop();//NoSuchElementException atti cunku LinkedList bos.

    }


}

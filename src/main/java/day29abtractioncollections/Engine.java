package day29abtractioncollections;

public interface Engine extends Vehicle {

    // Child      Parent
    //Class ---> Interface  ====> implements
    //Class ---> Class      ====> extends
    //Interface ---> Interface ====> extends
    //Interface ---> Class  ====> Mumkun degil

    //interface'lerdeki tum variable'lar otomatik olarak (defoult) "public" 'dir.
    //interface'lerdeki tum variable'lar otomatik olarak (defoult) "final" 'dir.
    //interface'lerdeki tum variable'lar otomatik olarak (defoult) "static" 'dir.
    int price = 2000;


    void run();

    double weight = 23.5;

}

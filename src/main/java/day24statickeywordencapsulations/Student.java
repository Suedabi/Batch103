package day24statickeywordencapsulations;

public class Student {

//Encapsulation:"Data Hiding(Gizlemek)" demektir

//Data'yi niçin gizlersiniz? Data'yi dis etkenlerden korumak icin.

//Data'yi nasil gizlersin? Acces Modifier'ini "private" yaparak gizlerim.

//Data'yi gizledikten sonra basa Class'lardan okumak istersen ne yaparsin?
//"get method'lar(getters)" olusturarak gizledigimiz Data'lari okunur hale getirebiliriz.

//Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method'lar(setter)" olusturarak gizledigimiz Data'lari degistirebilirz.

//Variable'nin "Data Type'i" ne ise get method'un "return type'i" da ayni olmalidir.
//get method'lari isimlendirirken "get+<variable name>" ancak variable'in Data Type'i "booelan" ise "is + <variable name>" yapiyoruz.
//setter'lar bize data vermez.
//

    public String stdName = "Tom Hanks";
    private String stdId = "TH2022201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}

package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;//hesap numarasi
    private int pinNumber;//Sifre

    private double checkingBalance; //Vadesiz hesap bakiyesi
    private double savingBalance;//Vadeli hesap bakiyesi

    DecimalFormat monyFormat = new DecimalFormat("'$' ###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

//Para cekme =>paraCekmeIslemindenKalanMiktar amount=> miktar/tutar demek

    private double calculateCheckingBalanceAfterWithdraw(double amount) {

        checkingBalance = (checkingBalance - amount);

        return checkingBalance;


    }
    //para yatirma isleminden sonra kalan bakiye'yi hesapla

    private double calculateCheckingBalanceAfterDeposit(double amount) {
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    //Para cekme : saving hesabindan para cekildikten sonra kalan bakiye

    private double calculateSavingBalanceAfterWithdraw(double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;

    }
    //para yatirma: saving hesabinda para yatirdiktan sonra geri kalan bakiyeyi hesaplayabilirsiniz.

    private double calculateSavingBalanceAfterwithDeposit(double amount) {
        savingBalance = savingBalance + amount;
        return savingBalance;

    }

    //Musteri ile para cekmek icin etkilesime gecelim.
    public void getCheckingWithdraw() {
        disPlayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi miktarlar gecersizdir!");
            getCheckingWithdraw();//recursive method //method'u tekrardan cagirma
        } else if (amount <= checkingBalance) {
            calculateCheckingBalanceAfterWithdraw(amount);
            disPlayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Yetersiz bakiye");
        }

    }
//Para yatirma(checking) : Musteri ile para yatirmak icin etilesime gecelim.

    public void getCheckingDeposit() {

        disPlayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz :");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi miktarlar gecersizdir!");
            getCheckingWithdraw();
        } else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            System.out.println("Checking hesabinizda bulunan bakiye : " + monyFormat.format(checkingBalance));
            disPlayCurrentAmount(checkingBalance);
        }


    }

    //Musteri ile para cekmek icin iletisime gecelim: saving account

    public void getSavingWithdraw() {

        disPlayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingWithdraw();
        } else if (amount <= savingBalance) {
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            disPlayCurrentAmount(savingBalance);
        } else {
            System.out.println("Yetersiz bakiye");
        }


    }

    //Para yatirma(saving balance): Musteri ile parayi yatirmak icin etkilesime gecelim.

    public void getSvingDeposit() {
        disPlayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz meblayi giriniz");
        double amount = input.nextDouble();
        if (amount <= 0) {
            System.out.println("Sifir veya eksi miktarlar gecersizdir!");
            getSavingWithdraw();
        } else {
            calculateSavingBalanceAfterwithDeposit(amount);
            disPlayCurrentAmount(savingBalance);
        }

    }


    //son bakiyeyi goster
    public void disPlayCurrentAmount(double balance) {
        System.out.println("Checking hesabinzda bulunan bakiye: " + monyFormat.format(balance));
    }
System.out.println("Allah'im lütfen olsun");

}


package SampleQuestion;

import java.util.Scanner;

public class C07_doubleSayiyibaskaSayiyaCevirme {

    // Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
    // (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
    // ipuclari:
    // Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim. (edited)

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi1 = scan.nextDouble();
        int sayi2 = (int) sayi1;

        System.out.println("sayi2= "+ sayi2);

        System.out.println("");
        System.out.println("lutfen bir sayi giriniz");
        float sayi3 = scan.nextFloat();
        short sayi4 = (short) sayi3;

        System.out.println("sayi4= "+ sayi4);

    }
}

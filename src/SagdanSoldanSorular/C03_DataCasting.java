package SagdanSoldanSorular;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        /*Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim. (edited)

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen double bir sayi giriniz ");
        double sayi1 = scan.nextDouble();

        int sayi1Yeni= (int)sayi1;

        System.out.println(sayi1Yeni);

        System.out.println("");

        System.out.println("lutfen float bir sayi giriniz ");
       float sayi2 = scan.nextFloat();

        short sayi2Yeni= (short) sayi2;

        System.out.println(sayi2Yeni);



    }
}

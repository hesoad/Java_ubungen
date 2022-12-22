package SampleQuestion;

import java.util.Scanner;

public class C08_basmakliSayi {

    public static void main(String[] args) {
      //  Kullanicidan üc basamaklı bir sayı alin.
        //  Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //  ipuclari:
        //  Matematiksel Islemler konusuna bakalim.
        //  Bölme islemi kullanarak sayinin basamaklarini alalim ve
        //  toplam adli bir konteynira (Variable) atalim. (edited)


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen uc basamkli bir sayiyi giriniz ");
        int sayi = scan.nextInt();
        int rakamlarToplami=0;

        int birlerbasmagi = sayi%10 ;

        int onlarbasamagi= (sayi%100)/10;

        int yuzlerbasaamgi= sayi/100;

       rakamlarToplami=birlerbasmagi+onlarbasamagi+yuzlerbasaamgi;

        System.out.println(rakamlarToplami);

    }
}

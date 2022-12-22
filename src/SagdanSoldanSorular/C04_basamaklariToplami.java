package SagdanSoldanSorular;

import java.util.Scanner;

public class C04_basamaklariToplami {
    public static void main(String[] args) {

        /*Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
             ipuclari:
             Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim. (edited)

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamali bir sayi giriniz");
        int sayi = scan.nextInt();

        int rakamalarToplami=0;
        int birlerBasamagi=0;
        int onlarrBasamagi=0;
        int yuzlerBasamagi=0;
        int binlerBasamagi=0;

        birlerBasamagi=sayi%10;
        onlarrBasamagi =sayi/10%10;
        yuzlerBasamagi= sayi/100%10;
        binlerBasamagi= sayi/1000%10;

        rakamalarToplami=birlerBasamagi+onlarrBasamagi+yuzlerBasamagi;



            System.out.println("Rakamlar toplami = "+rakamalarToplami);




    }
}

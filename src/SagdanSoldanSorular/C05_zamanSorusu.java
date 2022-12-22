package SagdanSoldanSorular;

import java.util.Scanner;

public class C05_zamanSorusu {

    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviriniz.
         Örnek: 2 saat 3 dakika 10 saniye ==>7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen saati giriniz");
        int saat   = scan.nextInt();
        System.out.println("Lutfen dakikayi giriniz");
        int dakika = scan.nextInt();
        System.out.println("Lutfen saniyeyi giriniz");
        int saniye = scan.nextInt();
        System.out.println(" Girilen zaman = "+ (saat*60*60+dakika*60+saniye)+ "saniyedir");
    }
}

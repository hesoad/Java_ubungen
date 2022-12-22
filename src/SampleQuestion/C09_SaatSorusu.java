package SampleQuestion;

import java.util.Scanner;

public class C09_SaatSorusu {

    public static void main(String[] args) {

        /*  Girilen zamanı saniyeye çeviriniz.
            Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen saati  giriniz ");
        double saat= scan.nextDouble();
        System.out.println("lutfen dakikayi  giriniz ");
        double dakika= scan.nextDouble();
        System.out.println("lutfen saniyeyi giriniz ");
        double saniye= scan.nextDouble();
        double zaman= saat+dakika+saniye;

        saat= saat*60*60;
        dakika= dakika*60;

        System.out.println(saat+saniye+dakika);

    }
}

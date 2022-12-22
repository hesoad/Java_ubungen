package SagdanSoldanSorular;

import java.util.Scanner;

public class C10_HarfBenzerligi {
    public static void main(String[] args) {
       /* Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
       Ipucu:
       IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc harfli bir isim giriniz");
        String isim= scan.nextLine().toLowerCase();

        if(isim.length()>3){
            System.out.println("geçersiz giriş, lütfen tekrar deneyin!");

        }else{
            if((isim.charAt(0)==isim.charAt(1)) || isim.charAt(0)==isim.charAt(2) || isim.charAt(1)==isim.charAt(2)) {
                System.out.println("Dize yinelenen karakterlere sahip");

            }else{
                System.out.println("Dize benzersiz karakterlere sahip");
            }

        }




    }
}

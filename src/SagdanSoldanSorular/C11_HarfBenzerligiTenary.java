package SagdanSoldanSorular;

import java.util.Scanner;

public class C11_HarfBenzerligiTenary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc harfli bir isim giriniz");
        String isim= scan.nextLine().toLowerCase();
        System.out.println(isim.length()>3 ?
                "lutfen yeniden isim giriniz, isim uc harfli olmali" :
                ((isim.charAt(0)==isim.charAt(1)) || isim.charAt(0)==isim.charAt(2) || isim.charAt(1)==isim.charAt(2))?
                        "yinelnen dize lutfen yeniden isim giriniz" :"benzersiz karekterler");

    }
}

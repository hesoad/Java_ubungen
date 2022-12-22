package SagdanSoldanSorular;

import java.util.Scanner;

public class C16_enaz5harfliKelimeolusturmak {
    public static void main(String[] args) {

         /*Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen en az 5 harfli bir kelme giriniz");
        String kelime = scan.nextLine();

        while (!(kelime.length() >=5)){
            System.out.println("Lutfen 5 haneli yeni bir kelime giriniz");
            kelime= scan.nextLine();
        }
        System.out.println(kelime.substring(kelime.length()-3).repeat(2));

    }
}

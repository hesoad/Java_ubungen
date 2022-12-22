package SampleQuestion;

import java.util.Scanner;

public class C16_soru {
    public static void main(String[] args) {
        /*Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!

         */

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen en az 5 harfli bir kelime giriniz");

        String kelime=scan.next();

        while(!(kelime.length() >= 5)){
            System.out.println("}\nKelime en az 5 harfli olmalıdır.\nLütfen en az 5 harfli bir kelime giriniz: ");
            kelime=scan.next();

        }
        String yeniKelime=kelime.substring(kelime.length()-3).repeat(5);

        System.out.println(yeniKelime);

       /* -Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
        2-Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun. Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
        3-kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamanın altında,kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
        4-String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
        Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
        5-MOUNTAIN ARRAY SORUSU : Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod yazınız.
        Not:
        Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan deger alıyorsa Mountain Array' dir.
        Mountain Array Degil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli artan deger alıyorsa Mountain Array degildir

        */


    }
}

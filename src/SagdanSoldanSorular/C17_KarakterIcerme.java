package SagdanSoldanSorular;

import java.util.Scanner;

public class C17_KarakterIcerme {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        Örnek:
        char ch1=            'a'
       String name =     "Ali bakkala geç gitti."
       Beklenen Çıktı=    a sayısı = 3
       Ipucu:
       Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz! Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen kucuk bir  karakter giriniz ");
        char karakter=scan.next().charAt(0);
        int sayac = 0;
        isim=isim.toLowerCase();


        for (int i = 0; i <isim.length(); i++) {
            if(isim.charAt(i)==karakter)
                sayac++;


        }
        System.out.println("Stringimizde "+sayac+ " adet "+ karakter+ " bulunmaktadir");
    }
}

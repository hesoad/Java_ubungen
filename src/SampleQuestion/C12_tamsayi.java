package SampleQuestion;

import java.util.Scanner;

public class C12_tamsayi {
    public static void main(String[] args) {
       /* Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme

        */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");

        long sayi1= scan.nextLong();
        long sayi2= scan.nextLong();

        if(sayi2+sayi1>9999999999l){
            System.out.println("Fazla yukleme");
        }if(sayi2+sayi1<9999999999l){
            System.out.println("sayilarin toplami =" + sayi2+sayi2);
        }



    }
}

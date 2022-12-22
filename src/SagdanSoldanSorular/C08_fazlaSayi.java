package SagdanSoldanSorular;

import java.util.Scanner;

public class C08_fazlaSayi {
    public static void main(String[] args) {
        /*Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme (

         */



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam =sayi2+sayi1;

        if(sayi2<0 || sayi1<0 ){
            System.out.println("lutfen pozitif bir tam sayi giriniz");
        } else if(sayi1+sayi2>999999999){
            System.out.println("fazla yukleme ");
        }else {
            System.out.println("sayilarin toplami= "+ toplam);
        }
    }
}

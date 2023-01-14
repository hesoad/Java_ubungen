package NottanSorular3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bakkal {

    /*{Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
    yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
    method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
    gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
    kazandığını gösteren bir method yazınız.

 *          1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
            2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
            3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
            4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
            5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
    kazançtan yüksekse o günleri return yap.
            6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    ortalama kazançtan aşağıysa o günleri return yap.

 */
    static   double kazanclar=0;
    static   double toplam=0;
    static double ortalama=0;
    static   ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
    static   ArrayList<String>gunlerlistesi=new ArrayList<>(Arrays.asList("Montag", "Dienstag", "Mietwoche", "Donerstag", "Freitag", "Samstag", "Sontag"));

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <gunlerlistesi.size() ; i++) {
            System.out.println(gunlerlistesi.get(i)+" gunun kazancini giriniz");
            kazanclar= scan.nextInt();
            gunlukKazanclar.add((int) kazanclar);

        }
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            System.out.println(gunlerlistesi.get(i)+ "gunununkazanci :"+gunlukKazanclar.get(i)+ " dir ");
        toplam+=gunlukKazanclar.get(i);
        getortalamakazanc(toplam);
        kazanceslestirme(ortalama,gunlukKazanclar);}

        }

    private static void getortalamakazanc(double toplam) {
       ortalama=toplam/7;

        System.out.println("Haftalik kazanc ortalmasi ="+ ortalama);

    }

    private static void kazanceslestirme(double ortalama, ArrayList<Integer> gunlukKazanclar) {
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if(ortalama<gunlukKazanclar.get(i)){

                System.out.println("ortlamanin ustunde kazandiginiz gün="+gunlerlistesi.get(i));
            }else{
                System.out.println("ortlamanin altinda kazandiginiz günler "+gunlerlistesi.get(i));
            }

        }


    }

}

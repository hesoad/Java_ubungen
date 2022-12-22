package SagdanSoldanSorular;

import java.util.Scanner;

public class C28_SayiyiTersCevirme {
    public static void main(String[] args) {
      /*  Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz.

       */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int sayi = scan.nextInt();
        int tersSayi=0;

        while ((sayi>0)){  // sayi Buyuktur sifir sarti olustugu surece donguyu calistir.
            System.out.print(sayi % 10);
           sayi= sayi/10;
        }



    }
}

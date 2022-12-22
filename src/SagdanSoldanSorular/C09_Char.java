package SagdanSoldanSorular;

import java.util.Scanner;

public class C09_Char {
    public static void main(String[] args) {
       /* Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
                Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        Ipucu:
        Switch konusunu hatırlayalım!

        */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz ");
        String karekter2= scan.next();
        char karekter =  karekter2.toLowerCase().charAt(0);


        if(karekter=='a'){
            System.out.println("İsteğiniz işleniyor");
        }else if(karekter=='b'){
            System.out.println("'Değerlendirmeniz için yine de teşekkür ederiz");

        }else if(karekter=='c'){
            System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
        }else{
            System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }
    }
}

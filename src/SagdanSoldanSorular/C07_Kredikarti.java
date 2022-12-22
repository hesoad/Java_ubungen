package SagdanSoldanSorular;

import java.util.Scanner;

public class C07_Kredikarti {
    public static void main(String[] args) {
        /*Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)

         */
        Scanner scan  = new Scanner(System.in);
        System.out.println("Lutfen adinizi soyadinizi giriniz");
        String isim = scan.nextLine();
        String soyad= scan.nextLine();
        System.out.println("Lutfen 16 haneli kredi karti numaranizi giriniz ");
        String kartNo= scan.nextLine();


        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*");
        kartNo=kartNo.substring(0).replaceAll("\\w","*");
        if(kartNo.length()!=16){
            System.out.println("hatali giris yaptiniz 16 haneli kart numarasini girmeniz gerekmektedir.");
        }else{
            System.out.println(isim+" "+soyad);
            System.out.println(kartNo);
        }






    }
}

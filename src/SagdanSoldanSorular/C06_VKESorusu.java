package SagdanSoldanSorular;

import java.util.Scanner;

public class C06_VKESorusu {
    public static void main(String[] args) {

       /* Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
       **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
       Kullanıcıya aşağıdaki gibi mesaj verin:
        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez
        ÖRNEK :
        Ağırlık : 71
        Yükseklik : 1,72
        ÇIKTI :
        VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited)

        */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        double VKE =1;
        VKE=kilo/(boy*boy);

        System.out.println(VKE);

        if(VKE<18.5){
            System.out.println("Zayifsiniz , kilo almaya bakiniz ");
        }else if(VKE<25){
            System.out.println("kilonuz idealdir . kendinizi koruyun");

        }else if(VKE<30){
            System.out.println("şişmansınız, zayiflamaya bak ");
        }else if(VKE>=30){
            System.out.println("Obezsin ,Doktura basvur .");
        }else{
            System.out.println("hatali bir deger girdiniz ");
        }









    }
}

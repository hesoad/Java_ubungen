package SagdanSoldanSorular;

import java.util.Scanner;

public class C2_caySorusu {
    public static void main(String[] args) {
       /* Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayınç

        Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

        */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen gunluk ictiginiz cay miktarini girin ");
        int cay= scan.nextInt();
        System.out.println("lutfen gunluk tukettiginiz seker miktarini girin ");
        double seker = scan.nextDouble();
        System.out.println("Tuketilen yillik cay miktari: " +(cay*365)+ " adettir ");
        System.out.println("Tuketilen yillik seker  miktari: " +(365*seker*1.5/1000)+ " kilogramdir ");





    }
}

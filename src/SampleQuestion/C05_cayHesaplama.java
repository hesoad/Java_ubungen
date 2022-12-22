package SampleQuestion;

import java.util.Scanner;

public class C05_cayHesaplama {

    public static void main(String[] args) {

        /*Kullanıcıya günde ne kadar bardak çay içtiğini ve ne kadar şeker kullandığını sorun
         Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("gunluk ne kadar seker tukketiginizi lutfen yaziniz");
        double seker = scan.nextDouble();
        System.out.println("gunluk ne kadar cay  tukketiginizi lutfen yaziniz");
       int  cay = scan.nextInt();



        System.out.println("Yilda "+ seker*1.5*365 +" gram seker kullaniyorsunuz");
        System.out.println("Yilda "+ cay*1* 365  +" adet  cay  tuketiyorsunuz");






    }
}

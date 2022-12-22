package SampleQuestion;

import java.util.Scanner;

public class C03_Sayiortalamasi {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 5 adet sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        double sayi5 = scan.nextDouble();

        System.out.println("Sayilarin ortalamasi = " +(sayi1+sayi2+sayi3+sayi4+sayi5)/5);

    }
}

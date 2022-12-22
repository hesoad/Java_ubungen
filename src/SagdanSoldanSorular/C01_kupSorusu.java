package SagdanSoldanSorular;

import java.util.Scanner;

public class C01_kupSorusu {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.*/

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        double sayi= scanner.nextDouble();
        System.out.println("verilen sayının küpünün yarısı= "+ (sayi*sayi*sayi)/2);


    }
}

package SampleQuestion;

import java.util.Scanner;

public class C04_KareninAlaniVeCevresi {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarini giriniz");

        double kenar= scan.nextDouble();

        System.out.println("Karenin alani= "+ kenar*kenar);

        System.out.println("Karenin cevresi = "+ 4*kenar);
    }
}

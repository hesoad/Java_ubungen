package NottanSorular;

import java.util.ArrayList;
import java.util.Scanner;

public class C13_FibonaciSayisiForLoop {
    public static void main(String[] args) {
 /*  Soru 13- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        bir liste olarak bize donduren bir method olusturun
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(fibonacilistesiyap(sayi));

    }

    public static ArrayList<Integer> fibonacilistesiyap(int sayi ){
        ArrayList<Integer>fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        int toplam=0;

        for (int i = 0; i <sayi; i ++) {

            toplam += (fibo.get(fibo.size() - 2) + fibo.get(fibo.size() - 1));
            if (toplam < sayi)
                fibo.add(toplam);
        }

        return fibo;
    }
}

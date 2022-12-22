package NottanSorular;

import java.util.ArrayList;
import java.util.Scanner;

public class C13_fibonaciSayisiWhile {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         * 1-1-2-3-5-8-13-21-34....
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
        while (toplam<sayi){
            toplam+=fibo.get(fibo.size()-2)+fibo.get(fibo.size()-1);
            if(toplam<sayi)
                fibo.add(toplam);
        }
        return fibo;

    }
}

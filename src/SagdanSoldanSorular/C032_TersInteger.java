package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C032_TersInteger {
    public static void main(String[] args) {
        /*
      Soru=32
      Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
      İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin..
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Arraye kac adet eleman atanacagini giriniz ");
        int n= scan.nextInt();
        int[]arr= new int[n];
        System.out.println("Lütfen belirtiginiz miktarda eleman giriniz");


        for (int i = 0; i <n ; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] arrReverse=new int[n];

        for (int i =n-1; i >=0; i--) {
            System.out.print(arr[i]+ " ");

            System.out.println(Arrays.toString(arr));

            /*
                /*Soru 32-)
    Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir
    Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    İpucu:  int arrReverse[] diye bir array oluşturun ve
    kullancıya oluşturdugunuz arrayi buna tersten assign edin...

         */
           /* Scanner scanner = new Scanner(System.in);
            System.out.println("Array kaç elemanlı olsun? : ");
            int elemanSayisi = scanner.nextInt();
            Integer[] sayilar = new Integer[elemanSayisi];
            Integer[] reverseArray = new Integer[elemanSayisi];
            List<Integer> yeniListe = new ArrayList<>();

            for (int i = 0; i < elemanSayisi; i++) {
                System.out.println("Lütfen array'in " + i + " indexli elemanını giriniz: ");
                sayilar[i] = scanner.nextInt();
            }

            for (int i=sayilar.length-1; i >= 0; i--) {

                yeniListe.add(sayilar[i]);
            }
            System.out.println("1.Array : ");
            System.out.println(Arrays.toString(sayilar));
            System.out.println("----------------------------------------");
            yeniListe.toArray(reverseArray);
            System.out.println("Array'in son şekli : ");
            System.out.println(Arrays.toString(reverseArray));

            */



        }




    }
}

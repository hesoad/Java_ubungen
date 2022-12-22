package SagdanSoldanSorular;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C31_ArrayinUzunlugu {
    public static void main(String[] args) {

         /*
        Soru 31-)
Kullanıcıdan Arrayin uzunlugunu isteyin.
Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt

          */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Array'e kac tane eleman atamak istediginizi yaziniz ");
       int n= scan.nextInt();
       int[]arr=new int[n];
        System.out.println("array'e atamak icin eleman giriniz");

        for (int i = 0; i <n ; i++) {
            arr[i]= scan.nextInt();


        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <n ; i++) {

            System.out.println(arr[i]);
        }

    }
}

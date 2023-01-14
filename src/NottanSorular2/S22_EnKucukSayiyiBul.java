package NottanSorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S22_EnKucukSayiyiBul {
   /* Verilen 3 sayı içerisinden en küçük sayıyı bulup, method olarak döndüren
    java kodu yazınız.
    birinci sayı : 25
    ikinci sayı : 37
    üçüncü sayı : 29
    beklenen çıktı:
    En küçük sayı 25.0

    */

    public static void main(String[] args) {
        int []array={25,37,29};
        System.out.println(enKUcukElemaniBul(array));


    }

    private static int enKUcukElemaniBul (int[] array) {

        Arrays.sort(array);

        int enKucuk=array[0];

        return enKucuk;
    }

}

package NottanSorular2;

import java.util.ArrayList;
import java.util.List;



public class S21_ArrayinTekliElemani {

    public static void main(String[] args) {
        /*
         Soru 21:
     Bir Integer Array içerisinde bazı elementler birden fazla bulunmaktadır.
     Tekli elemanları oluşturacağımız yeni Array'e aktaran bir method oluşturup,
     yeni Array'i yazdıralım.
     örnek: int [] array={3,7,9,6,7,3,5,4,1,8,6,9}
    Çıktı : yeniArray={5,4,1,8}
         */

        int [] array={3,7,9,6,7,3,5,4,1,8,6,9};


        System.out.println(sadeceBirkezKullanilanElement(array));
    }

    public static List<Integer> sadeceBirkezKullanilanElement(int[] array) {
        int[] elementSayaci = new int[array.length];
        for (int eachsayi : array) {
            elementSayaci[eachsayi]++;
        }
        List<Integer> sadeceBirkezKullanilanElement = new ArrayList<>();
        for (int i = 0; i < elementSayaci.length; i++) {
            if (elementSayaci[i] == 1) {
                sadeceBirkezKullanilanElement.add(i);
            }
        }
        return sadeceBirkezKullanilanElement;
    }

}




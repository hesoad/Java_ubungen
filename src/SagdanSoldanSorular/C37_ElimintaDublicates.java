package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.List;

public class C37_ElimintaDublicates {
    public static void main(String[] args) {

       /* Soru 37-)
        --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
                (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate
        values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method,
        and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi
        döndüren aşağıdaki başlıga sahip bir metot yazınız.
                On tane tamsayı alan ve bu metodu çağırarak sonucu
        gösteren bir test programı yazınız.
                ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
                */

        int [] array={1,2,3,2,1,6,3,4,5,2};
        List<Integer> yeniListe=new ArrayList<>();
        tekElemanlariYazdir(yeniListe,array);
    }
    public static void tekElemanlariYazdir(List<Integer>yeniListe,int []array){


        for (int i = 0; i < array.length; i++) {

            if(!yeniListe.contains(array[i])){
                yeniListe.add(array[i]);
            }

        }
        int[] yeniArray=new int [yeniListe.size()];
        for (int i = 0; i < yeniListe.size(); i++) {
            yeniArray[i]=yeniListe.get(i);

        }
        // System.out.println(Arrays.toString(yeniArray));
        for (int i = 0; i < yeniArray.length; i++) {
            System.out.print(yeniArray[i]+" ");

        }

    }
}

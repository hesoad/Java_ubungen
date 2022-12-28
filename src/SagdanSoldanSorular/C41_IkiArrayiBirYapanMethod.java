package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C41_IkiArrayiBirYapanMethod {
    public static void main(String[] args) {
        /*
        Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */
        /*
        Schreiben Sie eine Methode, die 2 Int Arrays als Parameter akzeptiert und die Liste von 2 Arrays zu einem neuen Array hinzufügt und druckt.
       * Eingang1={1,2,3,4}
       * Eingang2={5,6}
       * Ausgabe={1,2,3,4,5,6}
         */

        int[] eingan1={1,2,3,4};
        int[]eingang2={5,6};
        neuArray(eingan1,eingang2);
        neuArray(eingang2,eingan1);



    }
    public static void neuArray(int [] arr1, int[] arr2){
        List<Integer>listNeue=new ArrayList<>();

        for (int j : arr1) {
            listNeue.add(j);

        }
        for (int i : arr2) {
            listNeue.add(i);

        }
        System.out.println("Iki arrayin birlesimi ="+listNeue);


    }




}

package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.List;

public class D18_listOrtalamasi {
    public static void main(String[] args) {
      /* S18) Bir listede (List) bulunan pozitif sayılardan oluşan
      elemanların ortalamasını döndüren method oluşturunuz

       */
      double []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(ortalmayiBulanMetot(arr));


    }

    private static double ortalmayiBulanMetot(double[] arr) {
       double toplam=0;
       double ortalama=0;

        for (double eachsayi: arr) {
            toplam+=eachsayi;

        }
        ortalama=toplam/ arr.length;

        return ortalama;



    }
}

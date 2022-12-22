package NottanSorular;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class S12_IcArrayToplama {
    public static void main(String[] args) {

        /*
      Soru 12- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
     olusturacagimiz tek katli bir array’e bu toplamlari atayin.
     input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
     output: [10, 3, 12, 10, 9]
     */

         int[][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
         int toplam=0;
         int [] arrTemp= new int[arr.length];


         
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }
            arrTemp[i]+=toplam;
            toplam =0;
        }
        System.out.println(Arrays.toString(arrTemp));
    }
}



/*
iki bos kova lazim
bir olusacak array icin
ikincisi ic arrayin toplami icin
ucuncu en onemli husus donuste kovayi sifirlamak  bos arraye toplam atanirken
bosaltma yapilamz ise onceki toplam ile yola devam eder
 */
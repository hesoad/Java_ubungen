package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C39_Array_MinMax {
    public static void main(String[] args) {
        /*
        Soru-39)
   Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
   Örnek:
   Input : {3,2,5,4,1,6}
   Output :
   min: 1
   max: 6
   Ipucu: sort yöntemni kullanabilirsiniz.
         */

        int  [] arr= {3,51,2,5,4,1,6,9,3,4,5,13,41};
        int enBuyukSayi=0;
        int enKucukSayi=arr[0];// arrayin indexi olarak verince dinamik oluyor . "0" olarak verilirse en kucuk hep sifir cikar
        Arrays.sort(arr);


        for (int each:arr) {


            if(each>enBuyukSayi){
                enBuyukSayi=each;

            }
            if(each<enKucukSayi) {
                enKucukSayi = each;

            }
        }
        System.out.println("en Buyuk sayi : "+ enBuyukSayi);
        System.out.println("en kucuksayi : " + enKucukSayi);

    }
}

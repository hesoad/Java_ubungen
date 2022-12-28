package SagdanSoldanSorular;

public class D19_enBuyukikinciSayi {
    public static void main(String[] args) {

        /*
       Soru19: Bir integer Array'de bulunan sayılardan 2.büyük olanı bulan java programı yazınız.
         */

        int [] arr1 =   {5,4,6,34,22,1,25};
        int [] arr2 =   {25,34,56,34,232,31,23,4,5};
        enBuyukIkinciSayi(arr1);
        enBuyukIkinciSayi(arr2);
    }

    private static void enBuyukIkinciSayi(int[] arr) {
        int enbuyuksayi=0;
        int ikinciEnBuyukSayi=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>enbuyuksayi){
                enbuyuksayi= arr[i];
            }
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j]>ikinciEnBuyukSayi&& arr[j]<enbuyuksayi)
                    ikinciEnBuyukSayi= arr[j];

            }

        }

        System.out.println(ikinciEnBuyukSayi);
    }
}
       /*iki kere for loop calistiriyoruz ilkinde en buyuk sayiyi bulmak icin,
       ikincisinde en buyukden kucuk, diger sayilardan buyuk sayiyi bulmak icin.
       */
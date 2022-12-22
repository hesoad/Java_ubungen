package NottanSorular;

public class S11_ArrayinSonToplami {
    public static void main(String[] args) {

        /*
    Soru 11- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
    toplaminini yazdiran bir method olusturun
     */
        int[][] arr = {{1, 2, 9}, {4, 5, 6}, {7, 8, 11}};

        System.out.println(icArrayinSonElemanininToplami(arr));

    }

    public static int icArrayinSonElemanininToplami(int[][] arr){


        int toplam=0;

        for (int[] icArray:arr) {
            toplam+=icArray[icArray.length-1];


        }

   return toplam;
    }
}

/* Arrayde bbulunan her ic arrayi getirip o arraydeki en son elemeani toplama ekle

 */
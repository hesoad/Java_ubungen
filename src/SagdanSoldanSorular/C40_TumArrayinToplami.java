package SagdanSoldanSorular;

public class C40_TumArrayinToplami {
    public static void main(String[] args) {
       /* Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
        Örn:
        girdi : {1,2,3,4,5,6,7,8}
        çıkış: 36
        ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün

        */
        /*
        Schreiben Sie eine Methode, die ein Array (Array) als Parameter akzeptiert und die Summe aller Elemente im Array zurückgibt, und geben Sie dann das Ergebnis in der Hauptmethode aus.
     z.B:
     Eingabe: {1,2,3,4,5,6,7,8}
    Ausgabe: 36
    Tipp: Sammeln Sie die Elemente des Arrays mit der For-Schleife und geben Sie die Methode zurück, indem Sie sie drucken

         */
        int [] array={1,2,3,4,5,6,7,8};
        int [] array2={21,12,8,4,15,6,37,38};

        dieSummeAllerElement( array );
        dieSummeAllerElement(array2);


    }
    public static void  dieSummeAllerElement(int[] arr){
        int sum=0;

        for (int i = 0; i < arr.length ; i++) {

            sum+=arr[i];


        }
        System.out.println(sum);

    }

}

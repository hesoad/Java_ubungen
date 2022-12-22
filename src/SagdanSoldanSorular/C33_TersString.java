package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C33_TersString {
    public static void main(String[] args) {

               /*Soru 33-)
Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
bir Java programı yazın (boşluklar ve özel karakterler dahil).
​
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından
Loop kullanarak son karakterden başlayıp tersten yazdırın
  */
        String str="Kodlama harika.";
        String[]arrayStr=str.split("");
        System.out.println("String'in orjinal hali :");
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(arrayStr));
        System.out.println("String'in son hali :");
        System.out.println("-----------------------------");
        String[]reverseStr=new  String[str.length()];
        List<String> reverseList=new ArrayList<>();

        for (int i = str.length()-1; i >=0 ; i--) {
            reverseList.add(arrayStr[i]);

        }
        reverseStr=reverseList.toArray(reverseStr);
        String sonArray=String.join("",reverseStr);
        System.out.println(Arrays.toString(reverseStr)); //[., a, k, i, r, a, h,  , a, m, a, l, d, o, K]
        System.out.println("\" "+ sonArray+"\""); // " .akirah amaldoK"
        String [] sonString=new String[]{sonArray};
        System.out.println(Arrays.toString(sonString)); //[.akirah amaldoK]
    }

}

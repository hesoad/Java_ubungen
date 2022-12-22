package SagdanSoldanSorular;

import java.util.Arrays;

public class C35_CharArrayDizini {
    public C35_CharArrayDizini() {
    }

    public static void main(String[] args) {
        /*Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
                --> toCharArray() yöntemini kullanmayın
        Örnek:
        String isim:    Yakup
        char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

         */

        String isim="Yakup";
        System.out.println(Arrays.toString(ismiCharArrayDizisiOlarakDondur(isim)));


    }
    public static char[] ismiCharArrayDizisiOlarakDondur(String isim){
        char[]arr= new char[isim.length()];
        for (int i = 0; i <isim.length() ; i++) {
            arr[i]=isim.charAt(i);

        }
        return arr;
    }
}

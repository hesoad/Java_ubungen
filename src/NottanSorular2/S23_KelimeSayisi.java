package NottanSorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S23_KelimeSayisi {
    public static void main(String[] args) {
        /*
         Bir Stringde bulunan toplam kelime sayısını bulup, method olarak döndüren
 java programı yazınız.
 Örnek String : Java ögrenmek emek ve sabır ister.
 Beklenen çıktı :
 String'de bulunan kelime sayısı : 6
         */

        String str = "Java ögrenmek emek ve sabir ister.";
        List<String> list = new ArrayList<>();
        list= List.of(str.split(" "));

        System.out.println(list);
        System.out.println(list.size());//
    }
    }

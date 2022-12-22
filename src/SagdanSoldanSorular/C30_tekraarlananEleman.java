package SagdanSoldanSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C30_tekraarlananEleman {
    public static void main(String[] args) {
        /*
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
            Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
         */

        String  str="bu gun hava cok soguk";
        ArrayList tekrarlananKarakterler=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char karakter=str.charAt(i);
            //1. sart. Eğer harf daha önce tekrarlanan karakterler listesine eklenmediyse ve
            //2. sart. Dizede birden fazla kez bulunuyorsa, listeye ekleyelim
            //indexOf=ilk görunum indexi
            //lastIndexOf=son görünüm indexi
            if (!tekrarlananKarakterler.contains(Character.toString(karakter)) && str.indexOf(karakter) != str.lastIndexOf(karakter)) {
                tekrarlananKarakterler .add(Character.toString(karakter));
            }
        }
        System.out.println("Tekrarlanan karakterler:   "+tekrarlananKarakterler);




    }
}

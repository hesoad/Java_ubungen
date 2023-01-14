package NottanSorular2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class S24_AnlikSaat {
    public static void main(String[] args) {
       /* Soru 24:
        Anlık tarihi ve saati gösteren bir method yazdırınız.
        Beklenen çıktı :
        Current date and time: Wednesday January 25, 2017 7:47:43

        */

        LocalDateTime tarih= LocalDateTime.now();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("EEEE MMM dd, YYYY H:m:s");
        System.out.println(tarih.format(format1));
    }


}

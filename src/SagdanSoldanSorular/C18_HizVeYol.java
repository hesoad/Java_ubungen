package SagdanSoldanSorular;

import java.util.Scanner;

public class C18_HizVeYol {
    public static void main(String[] args) {

              /*Soru 18-)
             Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
              Kullanıcıya hızını ve kilometreyi soralım,
              bunu methoda gönderelim ve bize varış süremizi hesaplasın
           İpucu:
           yol=Hız*zaman/*


         */

       Scanner scan = new Scanner(System.in);

        System.out.println("lutfen gidilecek yolu  giriniz");
        double yol = scan.nextDouble();
        System.out.println("lutfen hizinizi giriniz");
        double hiz =scan.nextDouble();
        yolSuresiniBulanMethod(yol,hiz);



    }
    public static void yolSuresiniBulanMethod(double yol, double hiz){

        double zaman =1;

        zaman=yol/hiz;


        System.out.println(zaman);

    }


}

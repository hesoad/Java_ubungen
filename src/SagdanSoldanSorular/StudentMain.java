package SagdanSoldanSorular;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        /*
        Soru 45-)
StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul) Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun, bu parametreler Maın classdaki bılgılerı ıstesın.
Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun. Ardından consolda giriilen bilgileri yazdırın
Ipucu:
Bu soruda iki classa ihtiyacımız olacak.
Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız. String isim, int yas, char cinsiyet gibi...
Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız, bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek, bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
         */



        Scanner scan = new Scanner(System.in);
        System.out.println(" adinizi giriniz");
        String   ad=scan.nextLine();
        System.out.println("soyadinizi giriniz");
        String   soyad=scan.nextLine();
        System.out.println(" yasinizi  giriniz");
        int yas=scan.nextInt();
        System.out.println("cinsiyetinizi giriniz");
        char  cinsiyet=scan.next().charAt(0);

        Student student1=new Student(ad,soyad,yas,cinsiyet);

        System.out.println("\nOgrencinin Soyadi: "+student1.soyad+"\nOgrencinin Yasi: "+student1.yas);


    }
}

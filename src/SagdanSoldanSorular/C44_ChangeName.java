package SagdanSoldanSorular;

public class C44_ChangeName {
    public static void main(String[] args) {
     /*   Soru 44-)
    Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
     Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın
     ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
     Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
     Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
     Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.



      */
        String isim="Hasan";
        String soyad="Adiguzel";
        String okul= "Sosyal Lise";
        int okulno= 8765;
        String sinifi="10 TMB";

        changeName ("Hasan","Adiguzel", "Sagmalcilar Lisesi",8765, "10Tmb");

    }
    public static void  changeName (String isim,String soyad, String okul,int okulno, String sinifi){

        isim="Huseyin";
        soyad="guzel";
        okul="sagmalcilar Lise";
        okulno=5678;
        sinifi="10 a";

        System.out.println("Isim:"+isim +"\nSoyadi: "+soyad +"\nOkul: "+okul+"\nOkul Nummarasi: "+okulno+"\nSinifi: "+sinifi);

    }

}

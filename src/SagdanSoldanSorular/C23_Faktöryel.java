package SagdanSoldanSorular;

public class C23_Faktöryel {

    public static void main(String[] args) {
        /*
          Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
          Örnek:
          Girdi: 6
         Çıktı: 6!=65432*1=720
         ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
        int input=6;
        int fakt=1;
        System.out.println(faktoryel(input, fakt));


    }
    public static int faktoryel(int sayi1, int carpim ){
        System.out.print(sayi1+ "!");
        for (int i = sayi1; i >=1 ; i--) {
            System.out.print(i+"");

            carpim=carpim*i;

        }
        System.out.print("= ");

        return carpim;
    }
}

package SagdanSoldanSorular;

public class Deneme {
    int num=21;
    String str="Bunu Yaz";


    /*
    Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
   Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

     */
    public Deneme(){


    }


    public Deneme(int num, String str){
        this.num=16;
        this.str=str;



    }

    public static void main(String[] args) {


        Deneme dene1= new Deneme(16,"Hallo world ");
        Deneme dene2 =new Deneme();



        System.out.println(dene1.num+ " "+ dene1.str);
        System.out.println(dene2.num+ " "+ dene2.str);

    }

}

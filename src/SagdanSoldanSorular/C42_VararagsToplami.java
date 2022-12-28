package SagdanSoldanSorular;

public class C42_VararagsToplami {
    public static void main(String[] args) {
        /*
        Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
    Method name=sum
    eğer metodu bu şekilde çağırırsanız

     toplam(1,2,3) çıktı =6
	 toplam(1,2,3,4,5) çıktı =15
	 sum(1,2) output=3
    Ipucu:  varargs sorusu, varargs olusturalım


         */


        vararagsSumme(1,22,3,6,9);
        vararagsSumme(11,21,3,6,7,8); 
        vararagsSumme(1,2,3,9);
        vararagsSumme(45,6,7,8,6,9);
        


    }

    private static void vararagsSumme(int...zahlen) {
        int toplam=0;

        for (int each :zahlen) {
            toplam+=each;
            
        }
        System.out.println("insgesamt= "+toplam);
        
        
        
    }
}

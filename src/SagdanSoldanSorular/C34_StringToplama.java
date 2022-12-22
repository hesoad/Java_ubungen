package SagdanSoldanSorular;

public class C34_StringToplama {
    public static void main(String[] args) {
        /*Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

         */

        String str = "ab5c2d4ef12s";

        System.out.println(sayilarinToplaminiBul(str));


    }
    public static int sayilarinToplaminiBul(String str){

        int toplam = 0;
        for (int i =0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                String tmp = str.substring(i,i+1);
                toplam += Integer.parseInt(tmp);
            }
        }
        return toplam;

}
}

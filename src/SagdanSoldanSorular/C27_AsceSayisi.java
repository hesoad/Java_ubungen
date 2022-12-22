package SagdanSoldanSorular;

public class C27_AsceSayisi {
    public static void main(String[] args) {
        //Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
        //ipucu: For Loop ve Char kullanarak çözebilirsiniz.
        //örnek:
        //Ascii value of a = 97
        //Ascii value of b = 98
        //Ascii value of c = 99
        //Ascii value of d = 100

        char krk1= 'a';
        char krk2= 'z';


        for ( char i = krk1; i <= krk2; i++) {
            System.out.println((" ascee value of " +(char)i +" " + (int) i));//97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122


        }
    }
}

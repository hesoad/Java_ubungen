package SagdanSoldanSorular;

import java.util.Scanner;

public class C19_BurcSorusu {
    public static void main(String[] args) {
        /*Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dogum ayinizi giriniz  ");
        String ay = scan.nextLine();
        System.out.println("Lutfen dogumu gununuzu sayisal olarak  giriniz");
        int gun = scan.nextInt();

        burclariHesaplama(ay, gun);

    }

    private static void burclariHesaplama (String ay, int gun) {
        if(ay.equalsIgnoreCase("subat")){
            if(gun >=21){
                System.out.println("burcunuz balik");
            }else{
                System.out.println("burcunuz kova");
            }

        }else if(ay.equalsIgnoreCase("nisan")){
            if(gun >=21){
                System.out.println("burcunuz balik");
            }else{
                System.out.println("burcunuz kova");
            }
        }else if(ay.equalsIgnoreCase("mayis")){
            if(gun >=21){
                System.out.println("burcunuz Koc");
            }else{
                System.out.println("burcunuz balik");
            }
        }else if(ay.equalsIgnoreCase("haziran")){
            if(gun >=21){
                System.out.println("burcunuz boga");
            }else{
                System.out.println("burcunuz koc");
            }
        }else if(ay.equalsIgnoreCase("temmuz")){
            if(gun >=21){
                System.out.println("burcunuz ikizler");
            }else{
                System.out.println("burcunuz boga");
            }
        }else if(ay.equalsIgnoreCase("agustos")){
            if(gun >=21){
                System.out.println("burcunuz yengec");
            }else{
                System.out.println("burcunuz ikizler");
            }
        }else if(ay.equalsIgnoreCase("eylul")){
            if(gun >=21){
                System.out.println("burcunuz aslan");
            }else{
                System.out.println("burcunuz yengec");
            }
        }else if(ay.equalsIgnoreCase("ekim")){
            if(gun >=21){
                System.out.println("burcunuz basak");
            }else{
                System.out.println("burcunuz aslan");
            }
        }else if(ay.equalsIgnoreCase("kasim")){
            if(gun >=21){
                System.out.println("burcunuz terazi");
            }else{
                System.out.println("burcunuz basak");
            }
        }else if(ay.equalsIgnoreCase("aralik")){
            if(gun >=21){
                System.out.println("burcunuz akrep");
            }else{
                System.out.println("burcunuz basak");
            }

        }else{
            System.out.println(" hatali bir tarih girdiniz ");
        }
    }

}
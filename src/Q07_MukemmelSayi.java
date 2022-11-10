import java.util.Scanner;

public class Q07_MukemmelSayi {

    // Kullanicidan 2 sayi alaliniz.
    // 1. sayi taban
    // 2. sayi Us
    // 1 sayinin ussunu hesaplatan code create edelim.

        // 3, 3  sonuc = 27
        // 2, 3 = 2*2*2=8

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Iki tane tam sayi giriniz :");

        int taban = scan.nextInt();
        int kuvvet = scan.nextInt();

        long sonuc = 1;

        while (kuvvet!=0){
            sonuc*=taban;

            kuvvet--;
        }

        System.out.println(taban + "'in istenen kuvveti = " + sonuc);
    }
}

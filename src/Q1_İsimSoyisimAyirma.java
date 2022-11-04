import java.util.Scanner;

public class Q1_İsimSoyisimAyirma {

    /*Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    ad ayrı soyad ayrı sekilde ekrana yazdırınız.

    input  : "AHMET YILMAZ"
    output : Ahmet
             Yilmaz

     */

    // subString methodu uzerinde islem yapilan String'in istenen bir parcasini size gri dondurur
    // Bunu yaparken iki farkli olanak sunar:
    // Ilki : 1 int parametre ister ve belirtilen index'ten String'in sonuna kadar size geri dondurur
    // Ikincisi ise 2 tane int parametre ister, ilk int parametre baslangic index'ini isaret eder ve o index'i
    // de dahil ederek verilen ikinci index'e kadar olan String'i size dondurur, ikinci index'teki karakter
    // dahil degildir.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isim ve soyisminizi giriniz.");

        String adSoyad = scan.nextLine();

        String ad = adSoyad.substring(0,adSoyad.indexOf(' '));

        String soyad = adSoyad.substring(adSoyad.indexOf(' ')+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}

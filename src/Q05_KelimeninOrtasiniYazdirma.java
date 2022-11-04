import java.util.Scanner;

public class Q05_KelimeninOrtasiniYazdirma {

      /*
 Cift sayida harf iceren bir String degiskenin ortasindaki harfi
 konsolda yazdirmak icin bir Java programi yaziniz.
 Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
 ORNEK:
       INPUT  :  Python
       OUTPUT :  th
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bie kelime giriniz.");
        String input = scan.next();

        System.out.println(ortadakiHarfiYazdir(input));
    }
    public static String ortadakiHarfiYazdir(String input){

        int uzunluk = input.length();
        int ortadakiIndex = uzunluk/2;
        int baslangizIndex = ortadakiIndex-1;
        int bitisIndex = ortadakiIndex+1;

        if (uzunluk % 2 == 0 )return input.substring(baslangizIndex,bitisIndex);
        else return input.substring(ortadakiIndex,ortadakiIndex+1);


    }
}

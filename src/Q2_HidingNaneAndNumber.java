import java.util.Scanner;

public class Q2_HidingNaneAndNumber {

    /*
     * Ask user Name, Surname and credit card numbers than convert it to special
     * form
     *
     * (Check credit card number, if there aren't 16 digit print
     * "Invalid credit card number"
     *
     * Input : John White 1234234534561478
     * Output : Name : J*** W****
     *          CCN  : **** **** **** 1478
     *  (Initials for name and surname should be uppercase)
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isim giriniz.");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz.");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen kredi karti numaranizi giriniz.");
        String ccn = scan.nextLine();

        if (ccn.length()!=16) System.out.println("Gecersiz kart numarası");
        else {

            isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\W","*");

            soyisim= isim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\W","*");

            ccn = "**** **** **** " + ccn.substring(12);

            System.out.println("Name : " + isim + " " + soyisim + "\n CCN" + ccn);
        }
    }
}

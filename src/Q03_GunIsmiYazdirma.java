import java.util.Scanner;

public class Q03_GunIsmiYazdirma {

   /*
         Kullanicidan gun numarasini alip
         gun ismini yazdiran bir program yazin.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gun numarasi giriniz : ");
        int gunSayisi = scan.nextInt();

        System.out.println("==================== IF ELSE Cozumu ========================");

        if (gunSayisi<=0 || gunSayisi>7) System.out.println("Gecersiz giris yaptiniz!");
        else if (gunSayisi==1) System.out.println("Pazartesi");
        else if (gunSayisi==2) System.out.println("Sali");
        else if (gunSayisi==3) System.out.println("Carsamba");
        else if (gunSayisi==4) System.out.println("Persembe");
        else if (gunSayisi==5) System.out.println("Cuma");
        else if (gunSayisi==6) System.out.println("Cumartesi");
        else System.out.println("Pazar");

        System.out.println("==================== SWITCH CASE Cozumu ========================");

        switch (gunSayisi){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun sayisi girdiniz!");
        }

        switch (gunSayisi) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Carsamba");
            case 4 -> System.out.println("Persembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Gecersiz gun sayisi girdiniz!");
        }

        /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore
          hafta ici veya hafta sonu yazdirin
         */
        System.out.println("Lutfen gun ismi giriniz : ");
        String gunIsmi = scan.next();

        // PAZARTESI , pazartesi, Pazartesi, pAzArTeSI

        gunIsmi = gunIsmi.toLowerCase();

        switch (gunIsmi) {
            case "pazartesi", "sali", "carsamba", "persembe", "cuma" -> System.out.println("Girdiginiz gun haftaicidir.");
            case "cumartesi", "pazar" -> System.out.println("Girdiginiz gun haftasonudur.");
            default -> System.out.println("Gecersiz gun ismi girdiniz!");
        }
    }
}

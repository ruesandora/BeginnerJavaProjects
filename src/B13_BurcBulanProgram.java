import java.util.Scanner;

public class B13_BurcBulanProgram {
  public static void main(String[] args) {

    /*
         kullanıcıdan doğum ayı ve gün
         değerlerini alıp Burcunu hesaplayan program yazınız.

        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart

     */

    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen doğduğunuz ayı giriniz: ");
    int month = scan.nextInt();
    System.out.print("Lütfen doğduğunuz günü giriniz: ");
    int day = scan.nextInt();

    if ((month <= 0 ) || (month >= 13)){
      System.out.println("Geçersiz ay girişi.");
    }
    if (day < 1 || day > 31) {
      System.out.println("Geçersiz gün girişi.");
    }

    System.out.println();

    if (month == 1 && day >= 22 && day <= 31){
      System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");
    } else if (month == 1 && day <= 22 && day >= 1){
      System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");
    }

    if (month == 2 && day >= 1 && day <= 19){
      System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");
    } else if (month == 2 && day >= 20 && day <= 31){
      System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
    }

    if (month == 3 && day >= 1 && day <= 20){
      System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
    } else if (month == 3 && day >= 21 && day <= 31) {
      System.out.println("Koç Burcu : 21 Mart - 20 Nisan");
    }

    if (month == 4 && day >= 1 && day <= 20){
      System.out.println("Koç Burcu : 21 Mart - 20 Nisan");
    } else if (month == 4 && day >= 21 && day <= 31) {
      System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
    }

    if (month == 5 && day >= 1 && day <= 21){
      System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
    } else if (month == 5 && day >= 22 && day <= 31) {
      System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
    }

    if (month == 6 && day >= 1 && day <= 22){
      System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
    } else if (month == 6 && day >= 23 && day <= 31){
      System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
    }

    if (month == 7 && day >= 1 && day <= 22){
      System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
    } else if (month == 7 && day >= 23 && day <= 31){
      System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
    }

    if (month == 8 && day >= 1 && day <= 22){
      System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
    } else if (month == 8 && day >= 23 && day <= 31){
      System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
    }

    if (month == 9 && day >= 1 && day <= 22){
      System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
    } else if (month == 9 && day >= 23 && day <= 31){
      System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
    }

    if (month == 10 && day >= 1 && day <= 22){
      System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
    } else if (month == 10 && day >= 23 && day <= 31){
      System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
    }

    if (month == 11 && day >= 1 && day <= 21){
      System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
    } else if (month == 11 && day >= 22 && day <= 31){
      System.out.println("Yay Burcu : 22 Kasım - 21 Aralık");
    }

    if (month == 12 && day >= 1 && day <= 21){
      System.out.println("Yay Burcu : 22 Kasım - 21 Aralık");
    } else if (month == 12 && day >= 22 && day <= 31){
      System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");
    }
  }


}

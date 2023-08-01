import java.util.Scanner;

public class B15_TekSayilarinToplami {
  public static void main(String[] args) {

    /*
    #Java ile kullanıcı negatif bir değer girene kadar kullanıcıdan sayı girişini kabul
    eden ve girilen sayılardan tek sayıları toplayıp ekrana basan programı yazın.

    Örnek Çıktı
    Sayı Giriniz : 2
    Sayı Giriniz : 3
    Sayı Giriniz : 7
    Sayı Giriniz : -15
    Toplam : 10

    Bonus Geliştirme

    Java ile girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */


    Scanner scan = new Scanner(System.in);
    int number = 0;
    int toplam = 0;

    System.out.print("Sayı giriniz: ");
    number = scan.nextInt();

    while (number > 0);{
      System.out.println("Sayı giriniz: ");
      number = scan.nextInt();

      if (number % 1 == 0){

      }

    }

  }
}

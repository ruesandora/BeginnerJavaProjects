import java.util.Scanner;

public class B14_CiftSayilariBulma {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
//    System.out.print("Lütfen bir tamsayi giriniz: ");
//    int number = scan.nextInt();
//
//    for (int i = 1; i <= number; i++) {
//      if (i % 2 == 0){
//        System.out.println(i + ": Sayısı çift");
//      }
//    }

// Java ile 0'dan girilen sayıya kadar olan sayılardan 4 ve 5'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

    System.out.print("Ortalamasını hesaplanmasını istediğiniz sayıyı giriniz: ");
    int number1 = scan.nextInt();
    System.out.println();
    int dordunKati = 0;
    int besinKati = 0;
    int sayac1 = 0;
    int sayac2 = 0;

    for (int i = 1; i <= number1; i++) {
      if (i % 4 == 0){
        dordunKati += i;
        sayac1++;
      }
      if (i % 5 == 0){
        besinKati += i;
        sayac2++;
      }
    }

    double output1 = (double) dordunKati / sayac1;
    double output2 = (double) besinKati / sayac2;

    // 4'ün bölünenleri hakkında çıktılar:
    System.out.println("- Sayınızın dörde bölünenlerin toplamı: " + dordunKati);
    System.out.println("- Sayınız toplamda " + sayac1 + " kez dörde bölünüyor..");
    System.out.println("- Sayınızın tam bölünen sayıların ortalaması: " + output1);

    System.out.println();

    // 5'in bölünenleri hakkında çıktılar:
    System.out.println("- Sayınızın beşe bölünenlerin toplamı: " + besinKati);
    System.out.println("- Sayınız toplamda " + sayac2 + " kez beşe bölünüyor..");
    System.out.println("- Sayınızın tam bölünen sayıların ortalaması: " + output2);

  }

  // Kodu daha basit  ve okunur hale getirelim.
}

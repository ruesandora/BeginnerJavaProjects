import java.util.Scanner;

public class B04_VucutKitleIndeksiHesaplama {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double boy, kilo, vke;

    System.out.print("Lütfen boyunuzu metre cinsinde giriniz: ");
    boy = scan.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz: ");
    kilo = scan.nextDouble();

    vke = kilo / (boy * boy);

    System.out.println();
    System.out.println("- Vucut kitle İndeksiniz: " + vke);
    System.out.println();

    if (vke < 18.5){
      System.out.println("- Zayıf");
    } else if (vke < 24.9) {
      System.out.println("- İdeal");
    } else if (vke < 29.9) {
      System.out.println("- Şişman");
    } else if (vke < 34.9) {
      System.out.println("- Obez");
    } else System.out.println("- Aşırı obez");

  }
}

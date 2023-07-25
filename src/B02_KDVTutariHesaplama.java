import java.util.Scanner;

public class B02_KDVTutariHesaplama {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double tutar, kdv;

    System.out.print("Lütfen tutarı giriniz: ");
    tutar = scanner.nextInt();
    System.out.println();

    System.out.println("- KDV oranı %18");
    kdv = tutar * 0.18;
    System.out.println("- KDV Tutarı: " + kdv);
    System.out.println("- KDV'li Tutar: " + (tutar + kdv));

  }
}

import java.util.Scanner;

public class B06_DaireAlanHesaplama {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Dairenin yarıçap değerini giriniz: ");
    int r = scanner.nextInt();
    double alan = Math.PI * r * r;
    double cevre = 2 * Math.PI * r;

    System.out.println("Dairenin alanı: " + alan);
    System.out.println("Dairenin çevresi: " + cevre);

    System.out.println("Merkez açısını giriniz: ");
    double a = scanner.nextDouble();

    double formul = (Math.PI * (r*r)*a) / 360;
    System.out.println("Dairenin dilimi: " + formul);


  }
}

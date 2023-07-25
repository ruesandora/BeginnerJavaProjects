import java.util.Scanner;

public class B03_HipotenusHesaplama {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double value1, value2, output;

    System.out.print("1. Kenarı giriniz: ");
    value1 = scanner.nextDouble();

    System.out.print("2. Kenarı giriniz: ");
    value2 = scanner.nextDouble();

    output = Math.sqrt((value1*value1) + (value2*value2));

    System.out.println("Hipotenüs: " + output);


  }
}

import java.util.Scanner;

public class B05_Manav {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double salatalik = 3.14, elma = 4.11, kabak = 2.22, domates = 0.95, patlican = 7.00;
    double salatalikKilo , elmaKilo , kabakKilo , domatesKilo , patlicanKilo;
    double tutar;


    System.out.print("Kaç kilo salatalık alındı?: ");
    salatalikKilo = scan.nextDouble();
    salatalik *= salatalikKilo;

    System.out.print("Kaç kilo elma alındı?: ");
    elmaKilo = scan.nextDouble();
    elma *= elmaKilo;

    System.out.print("Kaç kilo kabak alındı?: ");
    kabakKilo = scan.nextDouble();
    kabak *= kabakKilo;

    System.out.print("Kaç kilo domates alındı?: ");
    domatesKilo = scan.nextDouble();
    domates *= domatesKilo;

    System.out.print("Kaç kilo patlican alındı?: ");
    patlicanKilo = scan.nextDouble();
    patlican *= patlicanKilo;

    tutar = (salatalik + elma + kabak + domates + patlican);

    System.out.println("Toplam tutar: " + tutar + "TL");

  }
}

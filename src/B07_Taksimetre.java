import java.util.Scanner;

public class B07_Taksimetre {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double km = 2.20;
    int kisaMesafe = 20;
    double acilisUcreti = 10.0;

    System.out.print("Kaç kilometre yol kat ettiniz?: ");
    double mesafe = input.nextDouble();
    double ucret = km * mesafe;

    if (ucret < kisaMesafe && ucret > 0){
      System.out.println("Taksi ücretiniz: " + kisaMesafe + " TL");
    } else if (ucret > kisaMesafe) {
      System.out.println("Taksi ücretiniz: " + (ucret + acilisUcreti));
    } else System.out.println("Geçersiz değer");

  }
}

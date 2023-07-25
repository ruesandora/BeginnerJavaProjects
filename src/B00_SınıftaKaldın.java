import java.util.Scanner;

public class B00_SınıftaKaldın {
  public static void main(String[] args) {

    double fizik, tarih, matematik, kimya, biyoloji, edebiyat, ortalama;

    Scanner scanner = new Scanner(System.in);

    System.out.println("-----Karne hesaplama programı------");
    System.out.println();

    System.out.print("Lütfen fizik notunuzu giriniz: ");
    fizik = scanner.nextDouble();

    System.out.print("Lütfen tarih notunuzu giriniz: ");
    tarih = scanner.nextDouble();

    System.out.print("Lütfen matematik notunuzu giriniz: ");
    matematik = scanner.nextDouble();

    System.out.print("Lütfen kimya notunuzu giriniz: ");
    kimya = scanner.nextDouble();

    System.out.print("Lütfen biyoloji notunuzu giriniz: ");
    biyoloji = scanner.nextDouble();

    System.out.print("Lütfen edebiyat notunuzu giriniz: ");
    edebiyat = scanner.nextDouble();

    ortalama = (fizik + tarih + matematik + kimya + biyoloji + edebiyat) / 6.0;

    System.out.println("Sınavlarınızın not ortalaması: " + ortalama);

    // Lütfen fizik notunuzu giriniz: 48
    //Lütfen tarih notunuzu giriniz: 55
    //Lütfen matematik notunuzu giriniz: 27
    //Lütfen kimya notunuzu giriniz: 38
    //Lütfen biyoloji notunuzu giriniz: 36
    //Lütfen edebiyat notunuzu giriniz: 95


    if (ortalama < 50){
      System.out.println("Sınıfta kaldın");
    } else System.out.println("Sınıfı geçtin.");

//    if (ortalama >= 65 && ortalama < 75){
//      System.out.println("Teşekkür belgesi aldın!");
//    } else if (ortalama >= 75 && ortalama < 100) {
//      System.out.println("Taktir belgesi aldınız!");
//    } else if (ortalama < 0 && ortalama > 100) {
//      System.out.println("Mal mısın oglum böyle bir deger yok.");
//    } else System.out.println("Siktirname kazandınız");

    if (ortalama < 0.0 || ortalama > 100.0){
      System.out.println("Geçersiz değer..");
    } else if (ortalama >= 65 && ortalama < 75) {
      System.out.println("Teşekkür belgesi aldın!");
    } else if (ortalama >= 75 && ortalama < 100) {
      System.out.println("Taktir belgesi aldınız!");
    } else System.out.println("Herhangi bir  belge kazanamadınız.");




  }
}

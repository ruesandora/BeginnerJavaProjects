import java.util.Scanner;

public class B01_NotOrtalamasiHesaplama {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int fizik, matematik, turkce, kimya, muzik, tarih;
    double ortalama;

    System.out.print("Lütfen fizik sınav puanınızı giriniz: ");
    fizik = scan.nextInt();
    System.out.print("Lütfen matematik sınav puanınızı giriniz: ");
    matematik = scan.nextInt();
    System.out.print("Lütfen türkçe sınav puanınızı giriniz: ");
    turkce = scan.nextInt();
    System.out.print("Lütfen kimya sınav puanınızı giriniz: ");
    kimya = scan.nextInt();
    System.out.print("Lütfen muzik sınav puanınızı giriniz: ");
    muzik = scan.nextInt();
    System.out.print("Lütfen tarih sınav puanınızı giriniz: ");
    tarih = scan.nextInt();

    ortalama = (fizik + matematik + turkce + kimya + muzik + tarih) / 6.0;

    System.out.println("Ortalamanız: " + ortalama);

    while (ortalama >= 60){
      System.out.println("sınıfı geçtin");
      break;
    }

    while (ortalama < 60) {
      System.out.println("Sınıfı geçemedin");
      break;
    }

  }
}

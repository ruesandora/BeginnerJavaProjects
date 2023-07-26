import java.util.Scanner;

public class B09_EtknlikOnerme {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Havanın sıcaklığı kaç derece?: ");
    int derece = scanner.nextInt();

    if (derece < 5){
      System.out.println("Kayak yapmayı öneriyorum.") ;
    } else if (derece <= 15) {
      System.out.println("Tiyatroya katılmanızı öneriyorum.");
    } else if (derece <= 25) {
      System.out.println("Mangal yapmanızı öneriyorum.");
    } else if (derece > 25){
      System.out.println("Yüzmenizi öneriyorum.");
    } else System.out.println("Evinizde oturmanızı öneriyorum :)");
  }
}
